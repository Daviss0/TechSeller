package com.pi.techsellerh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  //
@RequestMapping("/v1/auth")
public class LoginController {

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }
}
