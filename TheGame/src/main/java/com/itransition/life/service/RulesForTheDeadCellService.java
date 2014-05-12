/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itransition.life.service;

import com.itransition.life.domain.RuleForTheDeadCell;
import java.util.List;

/**
 *
 * @author Albina
 */
public interface RulesForTheDeadCellService {
    void save(RuleForTheDeadCell ruleForTheDeadCell);
    void update(RuleForTheDeadCell ruleForTheDeadCell);
    void delete(RuleForTheDeadCell ruleForTheDeadCell);
    List<RuleForTheDeadCell> findByUserId(Integer userId);
}
