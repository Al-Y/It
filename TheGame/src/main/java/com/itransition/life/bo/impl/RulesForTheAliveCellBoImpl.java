/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itransition.life.bo.impl;

import com.itransition.life.bo.RulesForTheAliveCellBo;
import com.itransition.life.dao.RulesForTheAliveCellDao;
import com.itransition.life.entities.RuleForTheAliveCell;
import java.util.List;


/**
 *
 * @author Albina
 */
public class RulesForTheAliveCellBoImpl implements RulesForTheAliveCellBo{
    private RulesForTheAliveCellDao rulesForTheAliveCellDao;
    
    public void setRulesForTheAliveCellDao (RulesForTheAliveCellDao rulesForTheAliveCellDao){
        this.rulesForTheAliveCellDao = rulesForTheAliveCellDao;
    }
    
    public void save(RuleForTheAliveCell ruleForTheAliveCell){
        rulesForTheAliveCellDao.save(ruleForTheAliveCell);
    }

    public void update(RuleForTheAliveCell ruleForTheAliveCell){
        rulesForTheAliveCellDao.update(ruleForTheAliveCell);
    }

    public void delete(RuleForTheAliveCell ruleForTheAliveCell){
        rulesForTheAliveCellDao.delete(ruleForTheAliveCell);
    }

    public List<RuleForTheAliveCell> findByUserId(Integer userId){
        return rulesForTheAliveCellDao.findByUserId(userId);
    }
}
