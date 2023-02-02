package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
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
	public String culcNum(@Validated UserForm form, BindingResult result) {

		if (result.hasErrors()) {
			return index(form);
		}
		session.setAttribute("name", form.getName());
		session.setAttribute("age", form.getIntAge());
		session.setAttribute("comment", form.getComment());
		return "exam04-result";
	}

}
