/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itransition.life.dao.impl;

import com.itransition.life.dao.MapDao;
import com.itransition.life.domain.Map;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Albina
 */
@Repository
public class MapDaoImpl implements MapDao{   
    private SessionFactory sessionFactory;
 
    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    
    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    @Override
    public void save(Map map){
        Session session = getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.save(map);
        session.getTransaction().commit();            
    }

    @Override
    public void update(Map map){
        Session session = getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.update(map);
        session.getTransaction().commit();   
    }

    @Override
    public void delete(Map map){
        Session session = getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.delete(map);
        session.getTransaction().commit();   
    }

    @Override
    public Map findByUserId(Integer userId){
        Session session = getSessionFactory().getCurrentSession();
        session.beginTransaction();
        
        Map map = new Map();
        map.setForUser(userId);
        
        List<Map> result = session.createCriteria(Map.class)
        .add( Example.create(map) )
        .list();
       
        session.getTransaction().commit();   
        return result.get(0);
    }
}
