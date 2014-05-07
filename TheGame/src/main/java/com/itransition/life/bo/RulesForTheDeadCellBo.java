/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itransition.life.bo;

import com.itransition.life.entities.RuleForTheDeadCell;
import java.util.List;

/**
 *
 * @author Albina
 */
public interface RulesForTheDeadCellBo {
    void save(RuleForTheDeadCell ruleForTheDeadCell);
    void update(RuleForTheDeadCell ruleForTheDeadCell);
    void delete(RuleForTheDeadCell ruleForTheDeadCell);
    List<RuleForTheDeadCell> findByUserId(Integer userId);
}
