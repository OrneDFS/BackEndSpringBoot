/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioback.OrneDesFS.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ornel
 */
@Entity
@Table(name = "redes_sociales")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RedesSociales.findAll", query = "SELECT r FROM RedesSociales r"),
    @NamedQuery(name = "RedesSociales.findByIdredesSociales", query = "SELECT r FROM RedesSociales r WHERE r.redesSocialesPK.idredesSociales = :idredesSociales"),
    @NamedQuery(name = "RedesSociales.findByRedSocial", query = "SELECT r FROM RedesSociales r WHERE r.redSocial = :redSocial"),
    @NamedQuery(name = "RedesSociales.findByPersonaidPersona", query = "SELECT r FROM RedesSociales r WHERE r.redesSocialesPK.personaidPersona = :personaidPersona")})
public class RedesSociales implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RedesSocialesPK redesSocialesPK;
    @Column(name = "redSocial")
    private String redSocial;
    @JoinColumn(name = "persona_idPersona", referencedColumnName = "idPersona", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Persona persona;

    public RedesSociales() {
    }

    public RedesSociales(RedesSocialesPK redesSocialesPK) {
        this.redesSocialesPK = redesSocialesPK;
    }

    public RedesSociales(int idredesSociales, int personaidPersona) {
        this.redesSocialesPK = new RedesSocialesPK(idredesSociales, personaidPersona);
    }

    public RedesSocialesPK getRedesSocialesPK() {
        return redesSocialesPK;
    }

    public void setRedesSocialesPK(RedesSocialesPK redesSocialesPK) {
        this.redesSocialesPK = redesSocialesPK;
    }

    public String getRedSocial() {
        return redSocial;
    }

    public void setRedSocial(String redSocial) {
        this.redSocial = redSocial;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (redesSocialesPK != null ? redesSocialesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RedesSociales)) {
            return false;
        }
        RedesSociales other = (RedesSociales) object;
        if ((this.redesSocialesPK == null && other.redesSocialesPK != null) || (this.redesSocialesPK != null && !this.redesSocialesPK.equals(other.redesSocialesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.portfolioback.OrneDesFS.model.RedesSociales[ redesSocialesPK=" + redesSocialesPK + " ]";
    }
    
}
