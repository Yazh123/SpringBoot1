package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Exp1 {
	@GetMapping("welcome")
    public String display() {
  	  return "Welcome String Boot!";
    }
}
