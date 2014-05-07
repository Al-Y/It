/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itransition.life.dao.impl;

import com.itransition.life.dao.MessagesDao;
import com.itransition.life.entities.Message;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author Albina
 */
public class MessagesDaoImpl extends HibernateDaoSupport implements MessagesDao{
 
	public void save(Message user){
		getHibernateTemplate().save(user);
	}
 
	public void update(Message user){
		getHibernateTemplate().update(user);
	}
 
	public void delete(Message user){
		getHibernateTemplate().delete(user);
	}
 
	public List<Message> findByUsersIds(Integer toUser, Integer fromUser){
		List list = getHibernateTemplate().find(
                      "from Users where toUser=?",toUser,
                      "from Users where fromUser=?",fromUser
                );
		return list;
	}
}
