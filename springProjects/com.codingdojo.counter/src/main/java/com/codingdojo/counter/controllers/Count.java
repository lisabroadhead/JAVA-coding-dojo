package com.codingdojo.counter.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Count {
    @RequestMapping("/")
    public String index() {
        return "index.jsp";
    }
}
