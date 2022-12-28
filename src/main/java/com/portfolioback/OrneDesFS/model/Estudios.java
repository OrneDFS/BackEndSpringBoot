/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioback.OrneDesFS.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ornel
 */
@Entity
@Table(name = "estudios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Estudios.findAll", query = "SELECT e FROM Estudios e"),
    @NamedQuery(name = "Estudios.findByIdEstudios", query = "SELECT e FROM Estudios e WHERE e.estudiosPK.idEstudios = :idEstudios"),
    @NamedQuery(name = "Estudios.findByInstituci\u00f3n", query = "SELECT e FROM Estudios e WHERE e.instituci\u00f3n = :instituci\u00f3n"),
    @NamedQuery(name = "Estudios.findByPeriodo", query = "SELECT e FROM Estudios e WHERE e.periodo = :periodo"),
    @NamedQuery(name = "Estudios.findByT\u00edtulo", query = "SELECT e FROM Estudios e WHERE e.t\u00edtulo = :t\u00edtulo"),
    @NamedQuery(name = "Estudios.findByDescripci\u00f3n", query = "SELECT e FROM Estudios e WHERE e.descripci\u00f3n = :descripci\u00f3n"),
    @NamedQuery(name = "Estudios.findByEnlace", query = "SELECT e FROM Estudios e WHERE e.enlace = :enlace"),
    @NamedQuery(name = "Estudios.findByPersonaidPersona", query = "SELECT e FROM Estudios e WHERE e.estudiosPK.personaidPersona = :personaidPersona")})
public class Estudios implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EstudiosPK estudiosPK;
    @Column(name = "Instituci\u00f3n")
    private String institución;
    @Column(name = "Periodo")
    private String periodo;
    @Column(name = "T\u00edtulo")
    private String título;
    @Column(name = "Descripci\u00f3n")
    private String descripción;
    @Column(name = "Enlace")
    private String enlace;

    public Estudios() {
    }

    public Estudios(EstudiosPK estudiosPK) {
        this.estudiosPK = estudiosPK;
    }

    public Estudios(int idEstudios, int personaidPersona) {
        this.estudiosPK = new EstudiosPK(idEstudios, personaidPersona);
    }

    public EstudiosPK getEstudiosPK() {
        return estudiosPK;
    }

    public void setEstudiosPK(EstudiosPK estudiosPK) {
        this.estudiosPK = estudiosPK;
    }

    public String getInstitución() {
        return institución;
    }

    public void setInstitución(String institución) {
        this.institución = institución;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getTítulo() {
        return título;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public String getEnlace() {
        return enlace;
    }

    public void setEnlace(String enlace) {
        this.enlace = enlace;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (estudiosPK != null ? estudiosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estudios)) {
            return false;
        }
        Estudios other = (Estudios) object;
        if ((this.estudiosPK == null && other.estudiosPK != null) || (this.estudiosPK != null && !this.estudiosPK.equals(other.estudiosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.portfolioback.OrneDesFS.model.Estudios[ estudiosPK=" + estudiosPK + " ]";
    }
    
}
