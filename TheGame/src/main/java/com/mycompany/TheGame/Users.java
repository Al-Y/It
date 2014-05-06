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
public class Users implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String login;
    private String password;
    private String credentials;
    private Set messagesesToUser = new HashSet(0);
    private Set messagesesFromUser = new HashSet(0);
    private Set mapses = new HashSet(0);

    public Set getMessagesesToUser() {
        return messagesesToUser;
    }

    public void setMessagesesToUser(Set messagesesToUser) {
        this.messagesesToUser = messagesesToUser;
    }

    public Set getMessagesesFromUser() {
        return messagesesFromUser;
    }

    public void setMessagesesFromUser(Set messagesesFromUser) {
        this.messagesesFromUser = messagesesFromUser;
    }

    public Set getMapses() {
        return mapses;
    }

    public void setMapses(Set mapses) {
        this.mapses = mapses;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCredentials() {
        return credentials;
    }

    public void setCredentials(String credentials) {
        this.credentials = credentials;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
        if (!(object instanceof Users)) {
            return false;
        }
        Users other = (Users) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.User[ id=" + id + " ]";
    }
    
}
