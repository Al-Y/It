/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itransition.life.bo.impl;

import com.itransition.life.dao.RulesForTheDeadCellDao;
import com.itransition.life.entities.RuleForTheDeadCell;
import java.util.List;

/**
 *
 * @author Albina
 */
public class RulesForTheDeadCellBoImpl implements RulesForTheDeadCellDao{
    private RulesForTheDeadCellDao rulesForTheDeadCellDao;
    
    public void setRulesForTheDeadCellDao (RulesForTheDeadCellDao rulesForTheDeadCellDao){
        this.rulesForTheDeadCellDao = rulesForTheDeadCellDao;
    }
    
    public void save(RuleForTheDeadCell ruleForTheDeadCell){
       rulesForTheDeadCellDao.save(ruleForTheDeadCell);
    }

    public void update(RuleForTheDeadCell ruleForTheDeadCell){
       rulesForTheDeadCellDao.update(ruleForTheDeadCell);
    }

    public void delete(RuleForTheDeadCell ruleForTheDeadCell){
       rulesForTheDeadCellDao.delete(ruleForTheDeadCell);
    }

    public List<RuleForTheDeadCell> findByUserId(Integer userId){
       return rulesForTheDeadCellDao.findByUserId(userId);
    }
}
