/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioback.OrneDesFS.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author ornel
 */
@Embeddable
public class HabilidadesPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idtable1")
    private int idtable1;
    @Basic(optional = false)
    @Column(name = "Persona_idPersona")
    private int personaidPersona;

    public HabilidadesPK() {
    }

    public HabilidadesPK(int idtable1, int personaidPersona) {
        this.idtable1 = idtable1;
        this.personaidPersona = personaidPersona;
    }

    public int getIdtable1() {
        return idtable1;
    }

    public void setIdtable1(int idtable1) {
        this.idtable1 = idtable1;
    }

    public int getPersonaidPersona() {
        return personaidPersona;
    }

    public void setPersonaidPersona(int personaidPersona) {
        this.personaidPersona = personaidPersona;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idtable1;
        hash += (int) personaidPersona;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HabilidadesPK)) {
            return false;
        }
        HabilidadesPK other = (HabilidadesPK) object;
        if (this.idtable1 != other.idtable1) {
            return false;
        }
        if (this.personaidPersona != other.personaidPersona) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.portfolioback.OrneDesFS.model.HabilidadesPK[ idtable1=" + idtable1 + ", personaidPersona=" + personaidPersona + " ]";
    }
    
}
