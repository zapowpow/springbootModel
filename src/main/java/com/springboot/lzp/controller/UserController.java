package com.springboot.lzp.controller;

import com.springboot.lzp.GetMethodAndProperty;
import com.springboot.lzp.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * @Author: lizhipeng
 * @Company: 上海博般数据技术有限公司
 * @Date: 2018/10/29 10:51
 * @Description:
 */
@RestController
@RequestMapping("/user")
public class UserController extends BaseControllerImpl<User,Integer>{

    private Logger logger =  LoggerFactory.getLogger(User.class);
    @RequestMapping("/get")
    public void get(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        Cookie cookie1 = new Cookie("name","lzp");
        Cookie cookie2 = new Cookie("password","123");
        response.addCookie(cookie1);
    }

    @RequestMapping("/set")
    public Object set(HttpServletRequest request, HttpServletResponse response) {
        Cookie[] cookies = request.getCookies();
        for (int i=0;cookies!=null&&i<cookies.length;i++){
            System.out.println(cookies[i].getName());
        }
        return null;
    }


    @RequestMapping("come")
    public String come() {
        return GetMethodAndProperty.findId(User.class);
    }
}