package org.java.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: 马果
 * @Date: 2019/7/26 17:08
 * @Description:
 */
@Controller
public class ProdController {

    @GetMapping("prod/manager")
    public String prodManager(){
        return "/prod/prodManager";
    }
}
