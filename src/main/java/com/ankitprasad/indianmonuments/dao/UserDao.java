package com.ankitprasad.indianmonuments.dao;

import java.util.List;

import com.ankitprasad.indianmonuments.model.User;


public interface UserDao {
    public List<User> list();
     
    public User get(int id);
     
    public void saveOrUpdate(User user);
     
    public void delete(int id);
    
    public User authenticate(String username, String password);
}
