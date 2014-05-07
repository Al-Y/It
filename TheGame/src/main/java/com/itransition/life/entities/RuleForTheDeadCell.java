/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itransition.life.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author Albina
 */
@Entity
public class RuleForTheDeadCell implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     private Integer mapID;
     private Map maps;
     private Byte cell;

    public Integer getMapID() {
        return mapID;
    }

    public void setMapID(Integer mapID) {
        this.mapID = mapID;
    }

    public Map getMaps() {
        return maps;
    }

    public void setMaps(Map maps) {
        this.maps = maps;
    }

    public Byte getCell() {
        return cell;
    }

    public void setCell(Byte cell) {
        this.cell = cell;
    }

    
    public Integer getId() {
        return mapID;
    }
   
    public void setId(Integer id) {
        this.mapID = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mapID != null ? mapID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RuleForTheDeadCell)) {
            return false;
        }
        RuleForTheDeadCell other = (RuleForTheDeadCell) object;
        if ((this.mapID == null && other.mapID != null) || (this.mapID != null && !this.mapID.equals(other.mapID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.RullForTheDeadCell[ id=" + mapID + " ]";
    }
    
}
