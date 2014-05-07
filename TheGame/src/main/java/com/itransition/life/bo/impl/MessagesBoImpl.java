/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itransition.life.bo.impl;


import com.itransition.life.dao.MessagesDao;
import com.itransition.life.entities.Message;
import java.util.List;


/**
 *
 * @author Albina
 */
public class MessagesBoImpl implements MessagesDao{
    private MessagesDao messagesDao;
    
    public void setMessagesDao (MessagesDao messagesDao){
        this.messagesDao = messagesDao;
    }
    
    public void save(Message user){
        messagesDao.save(user);
    }

    public void update(Message user){
        messagesDao.update(user);
    }

    public void delete(Message user){
        messagesDao.delete(user);
    }

    public List<Message> findByUsersIds(Integer toUser, Integer fromUser){
        return messagesDao.findByUsersIds(toUser, fromUser);
    }
}
