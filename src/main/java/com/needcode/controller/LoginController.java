package com.needcode.controller;

import com.needcode.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class LoginController {
    private final MemberService memberService;

    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
