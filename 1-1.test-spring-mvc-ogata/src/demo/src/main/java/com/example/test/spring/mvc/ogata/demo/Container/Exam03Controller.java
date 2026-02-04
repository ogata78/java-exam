package com.example.test.spring.mvc.ogata.demo.Container;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam-03")
public class Exam03Controller {

    @RequestMapping("/show-abc")
    public String showABC(){
        return "exam-03";
    }

}
