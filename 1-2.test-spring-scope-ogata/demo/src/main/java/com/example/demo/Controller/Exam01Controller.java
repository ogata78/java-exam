package com.example.demo.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class Exam01Controller {
    
    @GetMapping("/")
    public String index() {
        return "exam01";
    }

    @PostMapping("/login")
    public String login( @RequestParam String email,@RequestParam String password, Model model) {

        String result;

        if ("yamada@sample.com".equals(email)
                && "yamayama".equals(password)) {
            result = "成功";
        } else {
            result = "失敗";
        }

        // requestスコープ
        model.addAttribute("result", result);

        return "exam01-result";
    }
}
    




    
