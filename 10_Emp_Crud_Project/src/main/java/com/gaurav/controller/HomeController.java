package com.gaurav.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.util.HttpSessionMutexListener;

import com.gaurav.dao.EmpDao;
import com.gaurav.entity.Emp;

@Controller
public class HomeController {
	
	@Autowired 
	private EmpDao empDao;
	@RequestMapping(path="/home")
	public String home(Model m)
	{
		
		List<Emp> list=empDao.getAllEmp();
		
		m.addAttribute("empList",list);
	return "home";
	}  
	
	
	@RequestMapping(path="/add_emp")
	public String addemp()
	{
	return "add_emp";
	}  
	
	@RequestMapping(path="/createEmp",method=RequestMethod.POST)
	public String createEmp(@ModelAttribute Emp emp,HttpSession session )
	{
		
		System.out.println(emp);
	
		int i=empDao.saveEmp(emp);
		session.setAttribute("msg", "Register Sucessfully");
		
		 return "redirect:/add_emp";
	}
	@RequestMapping(path="/editEmp/{id}")
	public String editEmp(@PathVariable int id,Model m)
	{
		empDao.getEMpById(id);
		Emp emp=empDao.getEMpById(id);
		m.addAttribute("emp",emp);
		return "edit_emp";
		
	}
	@RequestMapping(path="/UpdateEmp", method=RequestMethod.POST)
	public String updateEmp(@ModelAttribute Emp em,HttpSession session)
	{
		empDao.update(em);
		session.setAttribute("msg","Update Sucessfully");
		return "redirect:/home";
	}
	@RequestMapping("/deleteEmp/{id}")
	public String deleteEmp(@PathVariable int id,HttpSession session)
	{
		
		empDao.deleteEmp(id);
		
		session.setAttribute("msg","delete successfully");
		return "redirect:/home";
	}
	
	
}

          