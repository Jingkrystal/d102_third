package org.java.web;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/**
 * @Author:
 * @Date: 2019/7/27 15:17
 * @Description:
 */
@Controller
public class FirstController {
    @GetMapping("first")
    public String first (HttpSession session){
        System.out.println("-----------进入first控制器-----------");

        Subject subject= SecurityUtils.getSubject();

        Map principal = (Map) subject.getPrincipal();

        List<Map> menus = (List<Map>) principal.get("menus");


        session.setAttribute("user",principal.get("username"));
        session.setAttribute("menus",menus);
        return "main";
    }
}
