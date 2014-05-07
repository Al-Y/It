/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itransition.life.dao.impl;

import com.itransition.life.dao.RulesForTheDeadCellDao;
import com.itransition.life.entities.RuleForTheDeadCell;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author Albina
 */
public class RulesForTheDeadCellDaoImpl extends HibernateDaoSupport implements RulesForTheDeadCellDao{
 
	public void save(RuleForTheDeadCell ruleForTheDeadCell){
		getHibernateTemplate().save(ruleForTheDeadCell);
	}
 
	public void update(RuleForTheDeadCell ruleForTheDeadCell){
		getHibernateTemplate().update(ruleForTheDeadCell);
	}
 
	public void delete(RuleForTheDeadCell ruleForTheDeadCell){
		getHibernateTemplate().delete(ruleForTheDeadCell);
	}
 
	public List<RuleForTheDeadCell> findByUserId(Integer userId){
		List list = getHibernateTemplate().find(
                      "from Users where userId=?",userId
                );
		return list;
	}
}
