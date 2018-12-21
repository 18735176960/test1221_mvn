package com.iotek.controller;

import com.iotek.model.User;
import com.iotek.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by 11929 on 2018/12/21.
 */
@Controller
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/login")
    public String login(User user, Model model)throws Exception{
        System.out.println(user);

        User user1 = userService.getUser(user);
        System.out.println(user1);
        if (user1!=null){
            model.addAttribute("u",user1);
            return "main";
        }
        return "../../index";
    }
}
