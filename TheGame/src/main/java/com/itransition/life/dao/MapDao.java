/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itransition.life.dao;

import com.itransition.life.entities.Map;

/**
 *
 * @author Albina
 */
public interface MapDao {
    void save(Map map);
    void update(Map map);
    void delete(Map map);
    Map findByUserId(Integer userId);
}
