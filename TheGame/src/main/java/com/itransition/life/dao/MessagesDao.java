/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itransition.life.dao;

import com.itransition.life.entities.Message;
import java.util.List;

/**
 *
 * @author Albina
 */
public interface MessagesDao {
    void save(Message message);
    void update(Message message);
    void delete(Message message);
    List<Message> findByUsersIds(Integer toUser, Integer fromUser);
}
