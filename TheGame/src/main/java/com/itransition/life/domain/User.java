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
@Table(name = "users")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;    
    private Integer id;
    private String login;
    private String password;
    private String credentials;
    private Set messagesesToUser = new HashSet(0);
    private Set messagesesFromUser = new HashSet(0);
    private Set mapses = new HashSet(0);

       
    public User() {
    }
    
    public User(String login, String password, String credentials) {
        this.login = login;
        this.password = password;
        this.credentials = credentials;
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

    @OneToMany(mappedBy = "users")   
    public Set getMessagesesToUser() {
        return messagesesToUser;
    }

    public void setMessagesesToUser(Set messagesesToUser) {
        this.messagesesToUser = messagesesToUser;
    }

    @OneToMany(mappedBy = "users")   
    public Set getMessagesesFromUser() {
        return messagesesFromUser;
    }

    public void setMessagesesFromUser(Set messagesesFromUser) {
        this.messagesesFromUser = messagesesFromUser;
    }
    
    @OneToMany(mappedBy = "users")   
    public Set getMapses() {
        return mapses;
    }

    public void setMapses(Set mapses) {
        this.mapses = mapses;
    }

    @Column(name = "login", nullable = false, length = 40)
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Column(name = "password", nullable = false, length = 255)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name = "credentials", nullable = false, length = 40)
    public String getCredentials() {
        return credentials;
    }

    public void setCredentials(String credentials) {
        this.credentials = credentials;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 61 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 61 * hash + (this.login != null ? this.login.hashCode() : 0);
        hash = 61 * hash + (this.password != null ? this.password.hashCode() : 0);
        hash = 61 * hash + (this.credentials != null ? this.credentials.hashCode() : 0);
        hash = 61 * hash + (this.messagesesToUser != null ? this.messagesesToUser.hashCode() : 0);
        hash = 61 * hash + (this.messagesesFromUser != null ? this.messagesesFromUser.hashCode() : 0);
        hash = 61 * hash + (this.mapses != null ? this.mapses.hashCode() : 0);
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
        final User other = (User) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        if ((this.login == null) ? (other.login != null) : !this.login.equals(other.login)) {
            return false;
        }
        if ((this.password == null) ? (other.password != null) : !this.password.equals(other.password)) {
            return false;
        }
        if ((this.credentials == null) ? (other.credentials != null) : !this.credentials.equals(other.credentials)) {
            return false;
        }
        if (this.messagesesToUser != other.messagesesToUser && (this.messagesesToUser == null || !this.messagesesToUser.equals(other.messagesesToUser))) {
            return false;
        }
        if (this.messagesesFromUser != other.messagesesFromUser && (this.messagesesFromUser == null || !this.messagesesFromUser.equals(other.messagesesFromUser))) {
            return false;
        }
        if (this.mapses != other.mapses && (this.mapses == null || !this.mapses.equals(other.mapses))) {
            return false;
        }
        return true;
    }
        
   

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", login=" + login + ", password=" + password + ", credentials=" + credentials + ", messagesesToUser=" + messagesesToUser + ", messagesesFromUser=" + messagesesFromUser + ", mapses=" + mapses + '}';
    }
}
