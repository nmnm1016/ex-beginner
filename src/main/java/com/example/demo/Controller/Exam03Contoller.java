package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.ServletContext;

@Controller
@RequestMapping("/ex03")
public class Exam03Contoller {

	@Autowired
	private ServletContext application;

	@GetMapping("")
	public String index() {
		return "exam03";
	}

	@PostMapping("/sendItems")
	public String sendNum(String item1, String item2, String item3) {
		application.setAttribute("item1", item1);
		application.setAttribute("item2", item2);
		application.setAttribute("item3", item3);
		
		int nonTaxedPrice = Integer.parseInt(item1)  + Integer.parseInt(item2) + Integer.parseInt(item3);
		application.setAttribute("nonTaxedPrice", nonTaxedPrice);
		
		int taxedPrice = nonTaxedPrice + (int)(nonTaxedPrice * 0.1);
		application.setAttribute("taxedPrice", taxedPrice);
		return "exam03-result";
	}
}
