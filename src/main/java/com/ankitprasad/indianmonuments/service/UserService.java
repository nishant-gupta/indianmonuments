package com.ankitprasad.indianmonuments.service;

import com.ankitprasad.indianmonuments.beans.RegistrationBean;
import com.ankitprasad.indianmonuments.model.User;

public interface UserService {
	
	public String register(RegistrationBean registerBean);
	
	public User authenticateUser(String userName, String password);

}
