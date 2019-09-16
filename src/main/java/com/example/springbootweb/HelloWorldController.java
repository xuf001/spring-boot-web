package com.example.springbootweb;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("/index")
    public String index(){
        return "success";
    }

    public static void main(String[] args) {
        System.out.println("helloworld");
    }
}

