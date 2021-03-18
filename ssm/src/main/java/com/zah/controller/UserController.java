package com.zah.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.zah.model.User;
import com.zah.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/select")
    public String selectUser(Model model) throws Exception {
        User user = userService.selectUser(1);
        model.addAttribute("user",user);
        return "user" ;
    }
}