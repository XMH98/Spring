package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author: 徐明皓
 * Date: 2021-07-29 21:16
 * Description: <描述>
 */
@Controller
public class WaterController {

    @RequestMapping("/water")
    public String water(){
        return "water";
    }

}
