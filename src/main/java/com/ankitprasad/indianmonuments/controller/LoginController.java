package com.ankitprasad.indianmonuments.controller;

import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ankitprasad.indianmonuments.beans.LoginBean;
import com.ankitprasad.indianmonuments.model.User;
import com.ankitprasad.indianmonuments.service.UserService;

@Controller
public class LoginController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		System.out.println("Welcome home! ");
		return "login";
	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String init(Model model, HttpSession session) {
		if( session != null && session.getAttribute("USER") != null ){
			session.invalidate();
		}
//        model.addAttribute("msg", "Please Enter Your Login Details");
        return "home";
    }
 
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String submit(Model model, @ModelAttribute("loginBean") LoginBean loginBean, HttpSession session) {
    	System.out.println(loginBean.getUserName());
    	System.out.println(loginBean.getPassword());
        if (loginBean != null && loginBean.getUserName() != null & loginBean.getPassword() != null) {
        	User user = userService.authenticateUser(loginBean.getUserName(), loginBean.getPassword()); 
            if (user != null) {
            	session.setAttribute("USER", user);
            	
            	if( "ADMIN".equals(user.getRole()) ){
            		model.addAttribute("msg", "Welcome " + loginBean.getUserName());
            		return "admin";
            		
            	}else{
            		model.addAttribute("msg", "Welcome " + loginBean.getUserName());
            		return "success";
            	}
            } else {
                model.addAttribute("error", "Invalid Details");
                return "login";
            }
        	
        	
        	
        } else {
            model.addAttribute("error", "Please enter Details");
            return "login";
        }
    }
    
    
}
