package com.example.test.spring.mvc.ogata.demo.Container;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/exam02")
public class Exam02Controller {

    @RequestMapping("/show-company-introduction")
    public String showCompanyIntroduction2(){
        return "exam-02";
    }
    

}
