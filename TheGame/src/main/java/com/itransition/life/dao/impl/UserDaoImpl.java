/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itransition.life.dao.impl;

import com.itransition.life.dao.UserDao;
import com.itransition.life.entities.User;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author Albina
 */
public class UserDaoImpl extends HibernateDaoSupport implements UserDao{
 
	public void save(User user){
		getHibernateTemplate().save(user);
	}
 
	public void update(User user){
		getHibernateTemplate().update(user);
	}
 
	public void delete(User user){
		getHibernateTemplate().delete(user);
	}
 
	public User findByUserId(Integer userId){
		List list = getHibernateTemplate().find(
                      "from Users where userId=?",userId
                );
		return (User)list.get(0);
	}
}
