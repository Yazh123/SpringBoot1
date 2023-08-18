package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Exp3 {
	private String color = "Blue";
	@GetMapping("color")
    public String disp() {
      return ("My favorite color is  " + color);
    }
}
