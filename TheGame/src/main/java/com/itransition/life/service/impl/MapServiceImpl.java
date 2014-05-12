/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itransition.life.service.impl;

import com.itransition.life.dao.MapDao;
import com.itransition.life.domain.Map;
import com.itransition.life.service.MapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 *
 * @author Albina
 */
@Service
public class MapServiceImpl implements MapService{ 
    private MapDao mapDao;    
    
    @Autowired
    public void setMapDao(MapDao mapDao){
        this.mapDao = mapDao;
    }    
    
    public MapDao getMapDao() {
        return mapDao;
    }
                
    @Override
    @Transactional
    public void save(Map map){
        mapDao.save(map);
    }

    @Override
    @Transactional
    public void update(Map map){
        mapDao.update(map);
    }

    @Override
    @Transactional
    public void delete(Map map){
        mapDao.delete(map);
    }

    @Override
    @Transactional
    public Map findByUserId(Integer userId){        
        return mapDao.findByUserId(userId);
    }
}
