/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itransition.life.dao.impl;

import com.itransition.life.dao.UserDao;
import com.itransition.life.domain.User;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;
import org.springframework.beans.factory.annotation.Autowired;


/**
 *
 * @author Albina
 */
public class UserDaoImpl implements UserDao{ 
    private SessionFactory sessionFactory;
 
    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    
    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    @Override
    public void save(User user){
        Session session = getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit(); 
    }

    @Override
    public void update(User user){
        Session session = getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.update(user);
        session.getTransaction().commit(); 
    }

    @Override
    public void delete(Integer userId){
        Session session = getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.delete(userId);
        session.getTransaction().commit(); 
    }

    @Override
    public User findByUserId(Integer userId){
        Session session = getSessionFactory().getCurrentSession();
        session.beginTransaction();
        
        User user = new User();
        user.setId(userId);
        
        List<User> result = session.createCriteria(User.class)
        .add( Example.create(user) )
        .list();
       
        session.getTransaction().commit();   
        return result.get(0);
    }
}
