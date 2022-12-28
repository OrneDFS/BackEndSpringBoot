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
public class EstudiosPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idEstudios")
    private int idEstudios;
    @Basic(optional = false)
    @Column(name = "Persona_idPersona")
    private int personaidPersona;

    public EstudiosPK() {
    }

    public EstudiosPK(int idEstudios, int personaidPersona) {
        this.idEstudios = idEstudios;
        this.personaidPersona = personaidPersona;
    }

    public int getIdEstudios() {
        return idEstudios;
    }

    public void setIdEstudios(int idEstudios) {
        this.idEstudios = idEstudios;
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
        hash += (int) idEstudios;
        hash += (int) personaidPersona;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EstudiosPK)) {
            return false;
        }
        EstudiosPK other = (EstudiosPK) object;
        if (this.idEstudios != other.idEstudios) {
            return false;
        }
        if (this.personaidPersona != other.personaidPersona) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.portfolioback.OrneDesFS.model.EstudiosPK[ idEstudios=" + idEstudios + ", personaidPersona=" + personaidPersona + " ]";
    }
    
}
