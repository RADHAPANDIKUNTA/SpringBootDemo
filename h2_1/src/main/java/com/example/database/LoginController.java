package com.example.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class LoginController {
	@Autowired
	LoginRepository repo;
	
	
	@RequestMapping(value="/login" ,method=RequestMethod.GET)
	public String getLoginForm() {
		
		return "login";
	}
	@RequestMapping(value="/registration" ,method=RequestMethod.GET)
	public String getReg() {
		
		return "registration";
	}
	
	
	@RequestMapping(value="/login" , method=RequestMethod.POST)
	public String login(@ModelAttribute(name="loginForm") LoginForm loginForm , Model model)
	{
		String username=loginForm.getUsername();
		String password=loginForm.getPassword();
		
		
		
		
		if("admin".equals(username) && "12345".equals(password))
		{
			return "home";
		}
		model.addAttribute("inValidCredentials",true);
		return "login"	;
		}
	
	
	@RequestMapping("/registration")
	public String addAlien(LoginForm alien) {
		
		repo.save(alien);
		return "registration.html";
		
	}

}
