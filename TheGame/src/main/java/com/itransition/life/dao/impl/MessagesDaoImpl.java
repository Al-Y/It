/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itransition.life.dao.impl;

import com.itransition.life.dao.MessagesDao;
import com.itransition.life.domain.Message;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;
import org.springframework.beans.factory.annotation.Autowired;


/**
 *
 * @author Albina
 */
public class MessagesDaoImpl implements MessagesDao{
    private SessionFactory sessionFactory;
 
    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    
    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    @Override
    public void save(Message message){
        Session session = getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.save(message);
        session.getTransaction().commit();            
    }

    @Override
    public void update(Message message){
        Session session = getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.update(message);
        session.getTransaction().commit();            
    }

    @Override
    public void delete(Message message){
        Session session = getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.delete(message);
        session.getTransaction().commit();            
    }

    @Override
    public List<Message> findByUsersIds(Integer toUser, Integer fromUser){
        Session session = getSessionFactory().getCurrentSession();
        session.beginTransaction();
        
        Message message = new Message();
        message.setToUser(toUser);
        message.setFromUser(fromUser);
                
        List<Message> result = session.createCriteria(Message.class)
        .add( Example.create(message) )
        .list();
       
        session.getTransaction().commit();   
        return result;        
    }
}
