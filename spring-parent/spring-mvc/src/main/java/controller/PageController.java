package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author: 徐明皓
 * Date: 2021-07-29 21:57
 * Description: <描述>
 */
@Controller
@RequestMapping("/page")
public class PageController {

    @RequestMapping("/{pageName}")
    public String go(@PathVariable String pageName){
        return pageName;
    }

}
