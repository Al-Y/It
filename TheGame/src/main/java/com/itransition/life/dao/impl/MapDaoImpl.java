/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itransition.life.dao.impl;

import com.itransition.life.dao.MapDao;
import com.itransition.life.entities.Map;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author Albina
 */
public class MapDaoImpl extends HibernateDaoSupport implements MapDao{
 
    public void save(Map map){
            getHibernateTemplate().save(map);
    }

    public void update(Map map){
            getHibernateTemplate().update(map);
    }

    public void delete(Map map){
            getHibernateTemplate().delete(map);
    }

    public Map findByUserId(Integer userId){
            List list = getHibernateTemplate().find(
                  "from Users where toUser=?",userId                  
            );
            return (Map)list.get(0);
    }
}
