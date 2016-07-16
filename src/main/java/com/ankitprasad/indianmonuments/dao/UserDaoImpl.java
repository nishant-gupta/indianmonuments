/*package com.sample.project.dao;

import java.util.List;


 
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import Users;


 
@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private SessionFactory sessionFactory;
 
    public UserDaoImpl() {
         
    }
     
    public UserDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
 
    @Override
    @Transactional
    public List<Users> list() {
        @SuppressWarnings("unchecked")
        List<Users> listUser = (List<Users>) sessionFactory.getCurrentSession()
                .createCriteria(Users.class)
                .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
 
        return listUser;
    }
 
    @Override
    @Transactional
    public void saveOrUpdate(Users user) {
        sessionFactory.getCurrentSession().saveOrUpdate(user);
    }
    
    @Override
    @Transactional
    public void delete(int id) {
        Users userToDelete = new Users();
        userToDelete.setId(id);
        sessionFactory.getCurrentSession().delete(userToDelete);
    }
 
    @Override
    @Transactional
    public Users get(int id) {
        String hql = "from User where id=" + id;
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
         
        @SuppressWarnings("unchecked")
        List<Users> listUser = (List<Users>) query.list();
         
        if (listUser != null && !listUser.isEmpty()) {
            return listUser.get(0);
        }
         
        return null;
    }
}
 
*/