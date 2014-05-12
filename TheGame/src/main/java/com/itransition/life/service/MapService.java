/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itransition.life.service;

import com.itransition.life.domain.Map;

/**
 *
 * @author Albina
 */
public interface MapService {
    void save(Map map);
    void update(Map map);
    void delete(Map map);
    Map findByUserId(Integer userId);
}
