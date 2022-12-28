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
public class ProyectosPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idProyectos")
    private int idProyectos;
    @Basic(optional = false)
    @Column(name = "Persona_idPersona")
    private int personaidPersona;

    public ProyectosPK() {
    }

    public ProyectosPK(int idProyectos, int personaidPersona) {
        this.idProyectos = idProyectos;
        this.personaidPersona = personaidPersona;
    }

    public int getIdProyectos() {
        return idProyectos;
    }

    public void setIdProyectos(int idProyectos) {
        this.idProyectos = idProyectos;
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
        hash += (int) idProyectos;
        hash += (int) personaidPersona;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProyectosPK)) {
            return false;
        }
        ProyectosPK other = (ProyectosPK) object;
        if (this.idProyectos != other.idProyectos) {
            return false;
        }
        if (this.personaidPersona != other.personaidPersona) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.portfolioback.OrneDesFS.model.ProyectosPK[ idProyectos=" + idProyectos + ", personaidPersona=" + personaidPersona + " ]";
    }
    
}
