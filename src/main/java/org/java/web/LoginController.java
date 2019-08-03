package org.java.web;

import com.sun.media.sound.SoftTuning;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author:
 * @Date: 2019/7/27 15:28
 * @Description:
 */
@Controller
public class LoginController {
    @RequestMapping("/login")
    public String login(HttpServletRequest request) throws Exception {
        System.out.println("准备进入login.jsp进行登录");


        String err = (String) request.getAttribute("shiroLoginFailure");

        if (err != null) {
            if (err.endsWith("UnknownAccountException")) {
                throw new Exception("用户名不存在");
            }
            if (err.endsWith("IncorrectCredentialsException")) {
                throw new Exception("密码错误");
            }
        }
        return "login";
    }
}




