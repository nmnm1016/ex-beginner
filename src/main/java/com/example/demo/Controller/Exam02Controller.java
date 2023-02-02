package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/ex02")
public class Exam02Controller {

	@Autowired
	private HttpSession session;

	@GetMapping("")
	public String index() {
		return "exam02";
	}

	@PostMapping("/sendNum")
	public String sendNum(int num1, int num2) {
		session.setAttribute("num1", num1);
		session.setAttribute("num2", num2);

		int total = num1 + num2;

		session.setAttribute("total", total);
		return "exam02-result";
	}

	@GetMapping("/result2")
	public String result2() {
		return "exam02-result2";
	}

}
