package org.java.ex;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author:
 * @Date: 2019/7/27 23:03
 * @Description:
 */
@Component
public class ShiroException implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception ex) {
        String msg = ex.getMessage();

        ModelAndView mv = new ModelAndView("/err");

        mv.addObject("msg",msg);
        return mv;
    }
}
