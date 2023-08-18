package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Exp2 {
	private String name = "Yazhini";
    @GetMapping("/")
    public String display() {
    	return "WELCOME  " + name + " !";
    }
}
