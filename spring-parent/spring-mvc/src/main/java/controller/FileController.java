package controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import util.StringUtils;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * Author: 徐明皓
 * Date: 2021-08-02 14:30
 * Description: <描述>
 */
@Controller
@RequestMapping("/file")
public class FileController {

    @RequestMapping("/upload")
    public String upload(String username, @RequestParam CommonsMultipartFile file, HttpSession session) throws IOException {
        System.out.println("用戶名："+username);
        System.out.println("表單名稱："+file.getName());
        System.out.println("文件名："+file.getOriginalFilename());
        System.out.println("文件大小："+file.getSize());

        //获取上传目录的物理路径
        String path = session.getServletContext().getRealPath("WEB-INF/upload");
        System.out.println(path);

        file.transferTo(new File(path, StringUtils.renameFileName(file.getOriginalFilename())));

        return "success";
    }

    @RequestMapping("/uploads")
    public String uploads(String username, @RequestParam CommonsMultipartFile[] files, HttpSession session) throws IOException {
        //获取上传目录的物理路径
        String path = session.getServletContext().getRealPath("WEB-INF/upload");

        for(CommonsMultipartFile file:files){
            file.transferTo(new File(path, StringUtils.renameFileName(file.getOriginalFilename())));
        }

        return "success";
    }

    @RequestMapping("/download")
    public void download(String filename, HttpSession session, HttpServletResponse resp){
        String path = session.getServletContext().getRealPath("/WEB-INF/upload/");
        File file = new File(path,filename);

        try {
            filename = "你好.jpg";
            filename = new String(filename.getBytes(StandardCharsets.UTF_8),"iso8859-1");
            resp.setHeader("content-disposition","attachment;filename="+filename);
            StreamUtils.copy(new FileInputStream(file),resp.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
