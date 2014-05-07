/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itransition.life.bo;

import com.itransition.life.entities.User;

/**
 *
 * @author Albina
 */
public interface UserBo {
    void save(User stock);
    void update(User stock);
    void delete(User stock);
    User findByUserId(Integer userId);
}
