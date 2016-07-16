package com.ankitprasad.indianmonuments;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegistrationController {
	
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
	    	return "login";
	 }
}

