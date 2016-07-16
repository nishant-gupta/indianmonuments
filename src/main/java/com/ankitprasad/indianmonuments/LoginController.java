package com.ankitprasad.indianmonuments;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	
	@RequestMapping(value = "/Login", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		System.out.println("Welcome home! ");
		return "login";
	}
	
	/*@RequestMapping(value = "/login", method = RequestMethod.GET)
    public String init(Model model) {
        model.addAttribute("msg", "Please Enter Your Login Details");
        return "login";
    }*/
 
    @RequestMapping(method = RequestMethod.POST)
    public String submit(Model model, @ModelAttribute("loginBean") LoginBean loginBean) {
    	System.out.println(loginBean.getUserName());
    	System.out.println(loginBean.getPassword());
        if (loginBean != null && loginBean.getUserName() != null & loginBean.getPassword() != null) {
            if (loginBean.getUserName().equals("chandra") && loginBean.getPassword().equals("chandra123")) {
                model.addAttribute("msg", "welcome" + loginBean.getUserName());
                return "success";
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
