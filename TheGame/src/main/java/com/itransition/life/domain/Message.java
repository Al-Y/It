/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itransition.life.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author Albina
 */
@Entity
@Table(name = "messages")
public class Message implements Serializable {
    private static final long serialVersionUID = 1L;        
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", unique = true, nullable = false)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "ID", nullable = false)
    private Integer fromUser;
    @ManyToOne
    @JoinColumn(name = "ID", nullable = false)
    private Integer toUser;
    @Column(name = "SendingDate", nullable = false, length = 19)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date sendingDate;
    @Column(name = "Content", nullable = false, length = 255)
    private String content;

    public Message(){        
    }
    
    public Message(Integer fromUser, Integer toUser, Date sendingDate, String content) {
        this.fromUser = fromUser;
        this.toUser = toUser;
        this.sendingDate = sendingDate;
        this.content = content;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
        public Integer getFromUser() {
        return fromUser;
    }

    public void setFromUser(Integer fromUser) {
        this.fromUser = fromUser;
    }

        public Integer getToUser() {
        return toUser;
    }

    public void setToUser(Integer toUser) {
        this.toUser = toUser;
    }

        public Date getSendingDate() {
        return sendingDate;
    }

    public void setSendingDate(Date sendingDate) {
        this.sendingDate = sendingDate;
    }

        public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 53 * hash + (this.fromUser != null ? this.fromUser.hashCode() : 0);
        hash = 53 * hash + (this.toUser != null ? this.toUser.hashCode() : 0);
        hash = 53 * hash + (this.sendingDate != null ? this.sendingDate.hashCode() : 0);
        hash = 53 * hash + (this.content != null ? this.content.hashCode() : 0);
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
        final Message other = (Message) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        if (this.fromUser != other.fromUser && (this.fromUser == null || !this.fromUser.equals(other.fromUser))) {
            return false;
        }
        if (this.toUser != other.toUser && (this.toUser == null || !this.toUser.equals(other.toUser))) {
            return false;
        }
        if (this.sendingDate != other.sendingDate && (this.sendingDate == null || !this.sendingDate.equals(other.sendingDate))) {
            return false;
        }
        if ((this.content == null) ? (other.content != null) : !this.content.equals(other.content)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Message{" + "id=" + id + ", fromUser=" + fromUser + ", toUser=" + toUser + ", sendingDate=" + sendingDate + ", content=" + content + '}';
    }

   
}
