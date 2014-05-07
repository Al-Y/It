/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itransition.life.bo.impl;

import com.itransition.life.dao.UserDao;
import com.itransition.life.entities.User;

/**
 *
 * @author Albina
 */
public class UserBoImpl implements UserDao{
    private UserDao userDao;
    
    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }
    
    public void save(User user){
       userDao.save(user);
    }

    public void update(User user){
       userDao.update(user);
    }

    public void delete(User user){
       userDao.delete(user);
    }

    public User findByUserId(Integer userId){
       return userDao.findByUserId(userId);
    }
}
