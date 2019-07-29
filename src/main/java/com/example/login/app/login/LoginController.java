package com.example.login.app.login;

import java.util.Collection;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;




@Controller
@RequestMapping("login")
public class LoginController {
	
	@ModelAttribute 
	public LoginForm setUpForm() {
		LoginForm form = new LoginForm();
		return form;
	}
	
	@GetMapping("create")
	public String list(Model model) {
		return "login/create"; 
	}
	

}
