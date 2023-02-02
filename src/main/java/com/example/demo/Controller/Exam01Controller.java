package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/ex01")
public class Exam01Controller {

	@Autowired
	private HttpSession session;

	@GetMapping("")
	public String index() {
		return "exam01";
	}
	
	@PostMapping("/result")
	public String result(String name) {
		session.setAttribute("name", name);
		return "exam01-result";
		
	}
}
