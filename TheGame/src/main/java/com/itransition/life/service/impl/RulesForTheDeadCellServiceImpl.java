/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itransition.life.service.impl;

import com.itransition.life.dao.RulesForTheDeadCellDao;
import com.itransition.life.domain.RuleForTheDeadCell;
import com.itransition.life.service.RulesForTheDeadCellService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Albina
 */
@Service
public class RulesForTheDeadCellServiceImpl implements RulesForTheDeadCellService{
    private RulesForTheDeadCellDao rulesForTheDeadCellDao;
    
    @Autowired
    public void setRulesForTheDeadCellDao (RulesForTheDeadCellDao rulesForTheDeadCellDao){
        this.rulesForTheDeadCellDao = rulesForTheDeadCellDao;
    }
    
    public RulesForTheDeadCellDao getRulesForTheDeadCellDao() {
        return rulesForTheDeadCellDao;
    }
    
    @Override
    @Transactional
    public void save(RuleForTheDeadCell ruleForTheDeadCell){
       rulesForTheDeadCellDao.save(ruleForTheDeadCell);
    }

    @Override
    @Transactional
    public void update(RuleForTheDeadCell ruleForTheDeadCell){
       rulesForTheDeadCellDao.update(ruleForTheDeadCell);
    }

    @Override
    @Transactional
    public void delete(RuleForTheDeadCell ruleForTheDeadCell){
       rulesForTheDeadCellDao.delete(ruleForTheDeadCell);
    }

    @Override
    @Transactional
    public List<RuleForTheDeadCell> findByUserId(Integer userId){
       return rulesForTheDeadCellDao.findByUserId(userId);
    }
}
