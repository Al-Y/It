/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itransition.life.service.impl;


import com.itransition.life.dao.UserDao;
import com.itransition.life.domain.User;
import com.itransition.life.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Albina
 */
@Service
public class UserServiceImpl implements UserService{
    private UserDao userDao;
    
    @Autowired
    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }

    public UserDao getUserDao() {
        return userDao;
    }
    
    @Override
    @Transactional
    public void save(User user){
       userDao.save(user);
    }

    @Override
    @Transactional
    public void update(User user){
       userDao.update(user);
    }

    @Override
    @Transactional
    public void delete(Integer userId){
       userDao.delete(userId);
    }

    @Override
    @Transactional
    public User findByUserId(Integer userId){
       return userDao.findByUserId(userId);
    }
}
