package com.hongyan.combinedemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {

    @PostMapping("/user/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password,
                        Map<String,Object> map , HttpSession session){

        if (!StringUtils.isEmpty(username) && "123456".equals(password)){
            //登录成功
            session.setAttribute("loginUser",username);
            //使用重定向，防止表单重复提交
            return "redirect:/mainboard.do";
        }else{
            map.put("login_msg","用户名或密码错误");
            return "login";
        }

    }
}
