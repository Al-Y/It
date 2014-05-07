/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itransition.life.dao.impl;

import com.itransition.life.dao.RulesForTheAliveCellDao;
import com.itransition.life.entities.RuleForTheAliveCell;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author Albina
 */
public class RulesForTheAliveCellDaoImpl extends HibernateDaoSupport implements RulesForTheAliveCellDao{
 
	public void save(RuleForTheAliveCell ruleForTheAliveCell){
		getHibernateTemplate().save(ruleForTheAliveCell);
	}
 
	public void update(RuleForTheAliveCell ruleForTheAliveCell){
		getHibernateTemplate().update(ruleForTheAliveCell);
	}
 
	public void delete(RuleForTheAliveCell ruleForTheAliveCell){
		getHibernateTemplate().delete(ruleForTheAliveCell);
	}
 
	public List<RuleForTheAliveCell> findByUserId(Integer userId){
		List list = getHibernateTemplate().find(
                      "from Users where userId=?",userId
                );
		return list;
	}
}
