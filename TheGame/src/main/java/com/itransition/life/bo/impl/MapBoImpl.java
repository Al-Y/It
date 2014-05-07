/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itransition.life.bo.impl;

import com.itransition.life.bo.MapBo;
import com.itransition.life.dao.MapDao;
import com.itransition.life.entities.Map;


/**
 *
 * @author Albina
 */
public class MapBoImpl implements MapBo{ 
    private MapDao mapDao;    
    
    public void setMapDao(MapDao mapDao){
        this.mapDao = mapDao;
    }
                
    public void save(Map map){
        mapDao.save(map);
    }

    public void update(Map map){
        mapDao.update(map);
    }

    public void delete(Map map){
        mapDao.delete(map);;
    }

    public Map findByUserId(Integer userId){        
        return mapDao.findByUserId(userId);
    }
}
