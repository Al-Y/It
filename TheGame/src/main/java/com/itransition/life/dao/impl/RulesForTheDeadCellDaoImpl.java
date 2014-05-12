/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itransition.life.dao.impl;

import com.itransition.life.dao.RulesForTheDeadCellDao;
import com.itransition.life.domain.RuleForTheDeadCell;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;
import org.springframework.beans.factory.annotation.Autowired;


/**
 *
 * @author Albina
 */
public class RulesForTheDeadCellDaoImpl implements RulesForTheDeadCellDao{ 
    private SessionFactory sessionFactory;
 
    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    
    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    @Override
    public void save(RuleForTheDeadCell ruleForTheDeadCell){
        Session session = getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.save(ruleForTheDeadCell);
        session.getTransaction().commit(); 
    }

    @Override
    public void update(RuleForTheDeadCell ruleForTheDeadCell){
        Session session = getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.update(ruleForTheDeadCell);
        session.getTransaction().commit(); 
    }

    @Override
    public void delete(RuleForTheDeadCell ruleForTheDeadCell){
        Session session = getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.delete(ruleForTheDeadCell);
        session.getTransaction().commit(); 
    }

    @Override
    public List<RuleForTheDeadCell> findByUserId(Integer userId){
        Session session = getSessionFactory().getCurrentSession();
        session.beginTransaction();
        
        RuleForTheDeadCell ruleForTheDeadCell = new RuleForTheDeadCell();
        ruleForTheDeadCell.setId(userId);                
                
        List<RuleForTheDeadCell> result = session.createCriteria(RuleForTheDeadCell.class)
        .add( Example.create(ruleForTheDeadCell) )
        .list();
       
        session.getTransaction().commit();   
        return result; 
    }
}
