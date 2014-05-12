/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itransition.life.service.impl;


import com.itransition.life.dao.MessagesDao;
import com.itransition.life.domain.Message;
import com.itransition.life.service.MessagesService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 *
 * @author Albina
 */
@Service
public class MessagesServiceImpl implements MessagesService{
    private MessagesDao messagesDao;
    
    @Autowired
    public void setMessagesDao (MessagesDao messagesDao){
        this.messagesDao = messagesDao;
    }

    public MessagesDao getMessagesDao() {
        return messagesDao;
    }
    
    @Override
    @Transactional
    public void save(Message user){
        messagesDao.save(user);
    }

    @Override
    @Transactional
    public void update(Message user){
        messagesDao.update(user);
    }

    @Override
    @Transactional
    public void delete(Message user){
        messagesDao.delete(user);
    }

    @Override
    @Transactional
    public List<Message> findByUsersIds(Integer toUser, Integer fromUser){
        return messagesDao.findByUsersIds(toUser, fromUser);
    }
}
