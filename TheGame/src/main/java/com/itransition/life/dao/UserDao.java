/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itransition.life.dao;

import com.itransition.life.entities.User;

/**
 *
 * @author Albina
 */
public interface UserDao {
    void save(User stock);
    void update(User stock);
    void delete(User stock);
    User findByUserId(Integer userId);
}
