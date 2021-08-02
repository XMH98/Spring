package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import util.StringUtils;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;

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
}
