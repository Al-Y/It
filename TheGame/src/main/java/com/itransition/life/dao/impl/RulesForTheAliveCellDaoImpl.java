/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itransition.life.dao.impl;

import com.itransition.life.dao.RulesForTheAliveCellDao;
import com.itransition.life.domain.RuleForTheAliveCell;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;
import org.springframework.beans.factory.annotation.Autowired;


/**
 *
 * @author Albina
 */
public class RulesForTheAliveCellDaoImpl implements RulesForTheAliveCellDao{
    private SessionFactory sessionFactory;
 
    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    
    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    @Override
    public void save(RuleForTheAliveCell ruleForTheAliveCell){
        Session session = getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.save(ruleForTheAliveCell);
        session.getTransaction().commit(); 
    }

    @Override
    public void update(RuleForTheAliveCell ruleForTheAliveCell){
        Session session = getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.update(ruleForTheAliveCell);
        session.getTransaction().commit(); 
    }

    @Override
    public void delete(RuleForTheAliveCell ruleForTheAliveCell){
        Session session = getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.delete(ruleForTheAliveCell);
        session.getTransaction().commit(); 
    }

    @Override
    public List<RuleForTheAliveCell> findByUserId(Integer userId){
        Session session = getSessionFactory().getCurrentSession();
        session.beginTransaction();
        
        RuleForTheAliveCell ruleForTheAliveCell = new RuleForTheAliveCell();
        ruleForTheAliveCell.setId(userId);                
                
        List<RuleForTheAliveCell> result = session.createCriteria(RuleForTheAliveCell.class)
        .add( Example.create(ruleForTheAliveCell) )
        .list();
       
        session.getTransaction().commit();   
        return result; 
    }
}
