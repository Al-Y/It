/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itransition.life.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author Albina
 */
@Entity
@Table(name = "rulesforthedeadcell")
public class RuleForTheDeadCell implements Serializable {
    private static final long serialVersionUID = 1L;    
    private Integer mapID;
    private Map map;
    private Byte cell;

    public RuleForTheDeadCell() {
    }

    public RuleForTheDeadCell(Map map, Byte cell) {
        this.map = map;
        this.cell = cell;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", unique = true, nullable = false)
    public Integer getId() {
        return mapID;
    }
   
    public void setId(Integer id) {
        this.mapID = id;
    }    

    @ManyToOne
    @JoinColumn(name = "ID", nullable = false)
    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }
       
    @Column(name = "Cell", nullable = true, length = 3)
    public Byte getCell() {
        return cell;
    }

    public void setCell(Byte cell) {
        this.cell = cell;
    }    

    @Override
    public String toString() {
        return "RuleForTheDeadCell{" + "mapID=" + mapID + ", map=" + map + ", cell=" + cell + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + (this.mapID != null ? this.mapID.hashCode() : 0);
        hash = 71 * hash + (this.map != null ? this.map.hashCode() : 0);
        hash = 71 * hash + (this.cell != null ? this.cell.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final RuleForTheDeadCell other = (RuleForTheDeadCell) obj;
        if (this.mapID != other.mapID && (this.mapID == null || !this.mapID.equals(other.mapID))) {
            return false;
        }
        if (this.map != other.map && (this.map == null || !this.map.equals(other.map))) {
            return false;
        }
        if (this.cell != other.cell && (this.cell == null || !this.cell.equals(other.cell))) {
            return false;
        }
        return true;
    }   
}
