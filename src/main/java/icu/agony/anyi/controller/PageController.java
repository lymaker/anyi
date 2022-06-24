package icu.agony.anyi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author LiuYun
 * @version 1.0
 */
@Controller
public class PageController {
    @RequestMapping("/admin")
    public String admin() {
        return "/admin/index.html";
    }
}
