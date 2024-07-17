package com.springmvc;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springmvc.entity.User;

@Controller 
public class HomeController {
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
	public String registeruser(@ModelAttribute User user,@RequestParam("fullname") String fn)
	{
		//System.out.println("user register method call");
	//	System.out.println(user.getFullname());
		System.out.println("Name= "+fn);
		System.out.println(user);
		return "register";
		
	}

}
