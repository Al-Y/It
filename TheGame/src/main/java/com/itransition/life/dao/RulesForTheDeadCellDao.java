/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itransition.life.dao;

import com.itransition.life.domain.RuleForTheDeadCell;
import java.util.List;

/**
 *
 * @author Albina
 */
public interface RulesForTheDeadCellDao {
    void save(RuleForTheDeadCell ruleForTheDeadCell);
    void update(RuleForTheDeadCell ruleForTheDeadCell);
    void delete(RuleForTheDeadCell ruleForTheDeadCell);
    List<RuleForTheDeadCell> findByUserId(Integer userId);
}
