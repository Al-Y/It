/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itransition.life.service;

import com.itransition.life.domain.User;

/**
 *
 * @author Albina
 */
public interface UserService {
    void save(User user);
    void update(User user);
    void delete(Integer userId);
    User findByUserId(Integer userId);
}
