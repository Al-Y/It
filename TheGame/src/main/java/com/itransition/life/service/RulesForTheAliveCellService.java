/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itransition.life.service;

import com.itransition.life.domain.RuleForTheAliveCell;
import java.util.List;

/**
 *
 * @author Albina
 */
public interface RulesForTheAliveCellService {
    void save(RuleForTheAliveCell ruleForTheAliveCell);
    void update(RuleForTheAliveCell ruleForTheAliveCell);
    void delete(RuleForTheAliveCell ruleForTheAliveCell);
    List<RuleForTheAliveCell> findByUserId(Integer userId);    
}
