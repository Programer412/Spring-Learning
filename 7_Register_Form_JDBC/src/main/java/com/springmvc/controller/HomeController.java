package com.springmvc.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.springmvc.service.*;

import com.springmvc.entity.User;

@Controller 
public class HomeController {
	@Autowired
	private UserService UserService;
	
	@RequestMapping("/home")
	public String home()
	{
		return "home";
	}
	
	@RequestMapping("/register")
	public String signup()
	{
		return "register";
	}
	@RequestMapping(path="/createUser", method=RequestMethod.POST)
	public String registeruser(@ModelAttribute User user,@RequestParam("img") String img,Model m)
	{
user.setImage(img);

	UserService.registerUser(user);
//m.addAttribute("msg","Register succesfully");
m.addAttribute("user",user);
		//return "redirect:/register";
		return "success";

	}

}
