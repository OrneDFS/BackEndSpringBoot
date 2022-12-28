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
public class UsuarioPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idusuario")
    private int idusuario;
    @Basic(optional = false)
    @Column(name = "persona_idPersona")
    private int personaidPersona;

    public UsuarioPK() {
    }

    public UsuarioPK(int idusuario, int personaidPersona) {
        this.idusuario = idusuario;
        this.personaidPersona = personaidPersona;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
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
        hash += (int) idusuario;
        hash += (int) personaidPersona;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsuarioPK)) {
            return false;
        }
        UsuarioPK other = (UsuarioPK) object;
        if (this.idusuario != other.idusuario) {
            return false;
        }
        if (this.personaidPersona != other.personaidPersona) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.portfolioback.OrneDesFS.model.UsuarioPK[ idusuario=" + idusuario + ", personaidPersona=" + personaidPersona + " ]";
    }
    
}
