package com.zah.zah_blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BlogController {


    @RequestMapping("/{html}")
    public  String  index(@PathVariable(name = "html") String html){
        return  html;
    }
}
