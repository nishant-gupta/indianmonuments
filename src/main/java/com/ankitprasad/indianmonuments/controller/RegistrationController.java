package com.ankitprasad.indianmonuments.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ankitprasad.indianmonuments.beans.RegistrationBean;
import com.ankitprasad.indianmonuments.service.UserService;

@Controller
public class RegistrationController {
	
	@Autowired
	private UserService UserService;
	
	@RequestMapping(value = "/newUser" , method = RequestMethod.GET)
	public String createNewUser()
	{
		System.out.println("in the registration method");
		return "register";
	}
	
	 @RequestMapping(value = "/add", method = RequestMethod.POST)
	    public String addDetails(Model model, @ModelAttribute("registrationBean") RegistrationBean registerBean) {
		 System.out.println(registerBean.getUserName());
	    	System.out.println(registerBean.getPassword());
	    	System.out.println(registerBean.getEmail());
	    	try{
	    		UserService.register(registerBean);
	    		 model.addAttribute("msg", "Your are registered Successfully");
	    	}
	    	catch(Exception e)
	    	{
	    		model.addAttribute("msg", "Registration Failed");
	    		return "register";
	    	}
	    	return "login";
	 }
}

