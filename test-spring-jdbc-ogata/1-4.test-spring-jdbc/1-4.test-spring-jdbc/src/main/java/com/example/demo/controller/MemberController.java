package com.example.demo.controller;

import java.lang.reflect.Member;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.repository.MemberRepository;

@Controller
@RequestMapping("/member")
public class MemberController {
	@Autowired
	private MemberRepository repository;

	@RequestMapping("")
	public String index() {
		//全件
		List<Member> memberList= repository.findAll();
		for(member member :memberList){
			System.out.println("ID:" + member.getId() 
			+ " 名前:" + member.getName() 
			+ " 年齢:" + member.getAge()
			+ " 部署ID:" + member.getDepartmentId());
		}

		//id2呼び出し
		Member jiro =repository.load(2){
			System.out.println("ID:" + member.getId()
				+ " 名前:" + member.getName()
				+ " 年齢:" + member.getAge()
				+ " 部署ID:" + member.getDepartmentId());
		}
		
		
		return "member";
	}
}
