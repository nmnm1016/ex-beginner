package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Form.UserForm;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/ex04")
public class Exam04Controller {

	@Autowired
	private HttpSession session;

	@GetMapping("")
	public String index(UserForm form) {
		return "exam04";
	}

	@PostMapping("/userAdd")
	public String culcNum(UserForm form) {

		session.setAttribute("name", form.getName());
		session.setAttribute("age", form.getAge());
		session.setAttribute("comment", form.getComment());
		return "exam04-result";
	}


}
