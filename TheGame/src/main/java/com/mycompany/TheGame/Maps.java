/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.TheGame;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

/**
 *
 * @author Albina
 */
@Entity
public class Maps implements Serializable {
    private static final long serialVersionUID = 1L;    
    private Integer id;
    private String title;
    private String description;
    private Integer generation;
    private Integer cells;
    private Integer forUser;    
    private Set rulesForTheDeadCells = new HashSet(0);
    private Set rulesForTheAliveCells = new HashSet(0);

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set getRulesForTheDeadCells() {
        return rulesForTheDeadCells;
    }

    public void setRulesForTheDeadCells(Set rulesForTheDeadCells) {
        this.rulesForTheDeadCells = rulesForTheDeadCells;
    }

    public Set getRulesForTheAliveCells() {
        return rulesForTheAliveCells;
    }

    public void setRulesForTheAliveCells(Set rulesForTheAliveCells) {
        this.rulesForTheAliveCells = rulesForTheAliveCells;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getGeneration() {
        return generation;
    }

    public void setGeneration(Integer generation) {
        this.generation = generation;
    }

    public Integer getCells() {
        return cells;
    }

    public void setCells(Integer cells) {
        this.cells = cells;
    }

    public Integer getForUser() {
        return forUser;
    }

    public void setForUser(Integer forUser) {
        this.forUser = forUser;
    }
       
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Maps)) {
            return false;
        }
        Maps other = (Maps) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Map[ id=" + id + " ]";
    }
    
}
