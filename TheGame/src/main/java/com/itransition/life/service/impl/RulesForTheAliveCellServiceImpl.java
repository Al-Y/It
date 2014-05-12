/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itransition.life.service.impl;

import com.itransition.life.dao.RulesForTheAliveCellDao;
import com.itransition.life.domain.RuleForTheAliveCell;
import com.itransition.life.service.RulesForTheAliveCellService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 *
 * @author Albina
 */
@Service
public class RulesForTheAliveCellServiceImpl implements RulesForTheAliveCellService{
    private RulesForTheAliveCellDao rulesForTheAliveCellDao;
    
    @Autowired
    public void setRulesForTheAliveCellDao (RulesForTheAliveCellDao rulesForTheAliveCellDao){
        this.rulesForTheAliveCellDao = rulesForTheAliveCellDao;
    }
    
    public RulesForTheAliveCellDao getRulesForTheAliveCellDao() {
        return rulesForTheAliveCellDao;
    }
    
    @Override
    @Transactional
    public void save(RuleForTheAliveCell ruleForTheAliveCell){
        rulesForTheAliveCellDao.save(ruleForTheAliveCell);
    }

    @Override
    @Transactional
    public void update(RuleForTheAliveCell ruleForTheAliveCell){
        rulesForTheAliveCellDao.update(ruleForTheAliveCell);
    }

    @Override
    @Transactional
    public void delete(RuleForTheAliveCell ruleForTheAliveCell){
        rulesForTheAliveCellDao.delete(ruleForTheAliveCell);
    }

    @Override
    @Transactional
    public List<RuleForTheAliveCell> findByUserId(Integer userId){
        return rulesForTheAliveCellDao.findByUserId(userId);
    }
}
