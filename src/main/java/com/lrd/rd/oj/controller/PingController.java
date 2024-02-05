package com.lrd.rd.oj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PingController {
    @ResponseBody
    @GetMapping("/")
    public String ping() {
        return "pong";
    }
}
