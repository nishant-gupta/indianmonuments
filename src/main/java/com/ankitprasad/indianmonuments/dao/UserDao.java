package com.ankitprasad.indianmonuments.dao;

import java.util.List;

import com.ankitprasad.indianmonuments.model.Users;


public interface UserDao {
    public List<Users> list();
     
    public Users get(int id);
     
    public void saveOrUpdate(Users user);
     
    public void delete(int id);
}
