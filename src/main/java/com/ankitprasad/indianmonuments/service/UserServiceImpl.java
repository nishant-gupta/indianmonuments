package com.ankitprasad.indianmonuments.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ankitprasad.indianmonuments.beans.RegistrationBean;
import com.ankitprasad.indianmonuments.dao.UserDao;
import com.ankitprasad.indianmonuments.model.User;

@Service("UserService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userdao;
	private User user;
	
	
	@Override
	public String register(RegistrationBean registrationBean) {
		user = new User();
		user.setUsername(registrationBean.getUserName());
		user.setFirstName(registrationBean.getFirstName());
		user.setEmail(registrationBean.getEmail());
		user.setLastName(registrationBean.getLastName());
		user.setPassword(registrationBean.getPassword());
		user.setRole("user");
		userdao.saveOrUpdate(user);
		return null;
	}

	@Override
	public User authenticateUser(String userName, String password) {
		User user = userdao.authenticate(userName, password);
		return user;
	}

	

}
