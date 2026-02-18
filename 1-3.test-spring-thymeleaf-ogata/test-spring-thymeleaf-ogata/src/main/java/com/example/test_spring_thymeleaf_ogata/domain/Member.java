package com.example.test_spring_thymeleaf_ogata.domain;

import java.util.List;

public class Member {

    //属性
    private String name;
    private Integer age;
    private List<String>hobbyList;

    //getter setter
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public Integer getAge(){
        return age;
    }
    public void setAge(Integer age){
        this.age=age;
    }

     public List<String> getHobbyList() {
        return hobbyList;
    }

    public void setHobbyList(List<String> hobbyList) {
        this.hobbyList = hobbyList;
    }

}
