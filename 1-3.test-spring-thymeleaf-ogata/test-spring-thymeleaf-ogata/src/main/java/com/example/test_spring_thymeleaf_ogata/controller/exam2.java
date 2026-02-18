package main.java.com.example.test_spring_thymeleaf_ogata.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;




@Controller
@RequestMapping("/exam")
public class exam2 {
    @GetMapping("/input")
    public String index() {
        return "ex-thymeleaf-input";
    }

    //送信内容
    @PostMapping("/result")
    public String result(
            String name,
            Integer age,
            String[] hobby,   
            HttpServletRequest request) {

        Member member = new Member();
        member.setName(name);
        member.setAge(age);

        // 配列を Listに変換流れ
        List<String> hobbyList = new ArrayList<>();
        if (hobby != null) {
            for (String h : hobby) {
                hobbyList.add(h);
            }
        }

         member.setHobbyList(hobbyList);

        // requestに保存する流れ
        request.setAttribute("member", member);

        return "ex-thymeleaf-result";
    }



}


//  URL   http://localhost:8080/exam/input
