package com.loveliness.xin_guan_lun_wen_generator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * @author loveliness
 * @create 2021-05-20 14:31
 */
@Controller
public class IndexControllter {

    @Resource
    private HttpSession session;


    @RequestMapping("/")
    public String index() {
        String loginString = "login";
        if (session.getAttribute(loginString) != null) {
            return "index";
        } else {
            return "login";
        }
    }

    @RequestMapping("/index")
    public String index1() {
        return index();
    }

    @RequestMapping("/login")
    public String login() {
        return index();
    }

    @RequestMapping("page/home")
    public String home() {
        return "page/index";
    }

}
