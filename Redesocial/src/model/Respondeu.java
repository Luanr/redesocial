/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author luan
 */
@Entity
@Table(name = "Respondeu")
public class Respondeu implements java.io.Serializable {
    
    @Column(name = "cdusuario")
    private Usuario usr;

    public Usuario getUsr() {
        return usr;
    }

    public void setUsr(Usuario usr) {
        this.usr = usr;
    }

    public Duvida getDvd() {
        return dvd;
    }

    public void setDvd(Duvida dvd) {
        this.dvd = dvd;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Date getHra() {
        return hra;
    }

    public void setHra(Date hra) {
        this.hra = hra;
    }
    
    @Column(name = "cdduvida")
    private Duvida dvd;
    
    @Column(name = "data")
    private Date data;
    
    @Column(name = "hora")
    private Date hra;
}
