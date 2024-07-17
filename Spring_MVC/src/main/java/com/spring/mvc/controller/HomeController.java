

package com.spring.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/site")
public class HomeController {
@RequestMapping("/home")
	public String home(Model m)
	{
	m.addAttribute("name","gaurav");
	m.addAttribute("roll",23414);
	List<String> list=new ArrayList();
	list.add("tula");
	list.add("mula");
	list.add("hulla");
	m.addAttribute("namelist",list);
		return "home";
	}

@RequestMapping(path="/login",method=RequestMethod.GET)
public ModelAndView loginPage()
{
	ModelAndView model=new ModelAndView();
	model.addObject("classname","12th class");
	model.addObject("regnumber",34325);
	List<String> list=new ArrayList();
	list.add("tula");
	list.add("mula");
	list.add("hulla");
	model.addObject("nameList",list);
	
	model.setViewName("login");
	return model;
}

/*
 * @RequestMapping(name="/register",method=RequestMethod.POST) public String
 * register() { return ""; }
 */
}
