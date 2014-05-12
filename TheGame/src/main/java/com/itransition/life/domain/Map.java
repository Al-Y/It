/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itransition.life.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

/**
 *
 * @author Albina
 */
@Entity
@Table(name = "maps")
public class Map implements Serializable {
    private static final long serialVersionUID = 1L;    
    private Integer id;
    private String title;
    private String description;
    private Integer generation;
    private Integer cells;
    private Integer forUser;    
    private Set rulesForTheDeadCells = new HashSet(0);
    private Set rulesForTheAliveCells = new HashSet(0);

    public Map(){        
    }
    
    public Map(String title, String description, Integer generation, Integer cells, Integer forUser) {
        this.title = title;
        this.description = description;
        this.generation = generation;
        this.cells = cells;
        this.forUser = forUser;
    }
            
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", unique = true, nullable = false)
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    @Column(name = "title", nullable = true, length = 255)
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
        
    @OneToMany(mappedBy = "maps")    
    public Set getRulesForTheDeadCells() {
        return rulesForTheDeadCells;
    }

    public void setRulesForTheDeadCells(Set rulesForTheDeadCells) {
        this.rulesForTheDeadCells = rulesForTheDeadCells;
    }

    @OneToMany(mappedBy = "maps")    
    public Set getRulesForTheAliveCells() {
        return rulesForTheAliveCells;
    }

    public void setRulesForTheAliveCells(Set rulesForTheAliveCells) {
        this.rulesForTheAliveCells = rulesForTheAliveCells;
    }   
    
    @Column(name = "description", nullable = true, length = 255)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "generation", nullable = false, length = 10)
    public Integer getGeneration() {
        return generation;
    }

    public void setGeneration(Integer generation) {
        this.generation = generation;
    }

    @Column(name = "cells", nullable = true, length = 10)
    public Integer getCells() {
        return cells;
    }

    public void setCells(Integer cells) {
        this.cells = cells;
    }

    @ManyToOne
    @JoinColumn(name = "ID", nullable = false)
    public Integer getForUser() {
        return forUser;
    }

    public void setForUser(Integer forUser) {
        this.forUser = forUser;
    }
          
    
}
