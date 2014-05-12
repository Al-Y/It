/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itransition.life.dao;

import com.itransition.life.domain.User;

/**
 *
 * @author Albina
 */
public interface UserDao {
    void save(User user);
    void update(User user);
    void delete(Integer userId);
    User findByUserId(Integer userId);
}
