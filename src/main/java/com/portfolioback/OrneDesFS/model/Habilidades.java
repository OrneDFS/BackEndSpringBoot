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
@Table(name = "habilidades")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Habilidades.findAll", query = "SELECT h FROM Habilidades h"),
    @NamedQuery(name = "Habilidades.findByIdtable1", query = "SELECT h FROM Habilidades h WHERE h.habilidadesPK.idtable1 = :idtable1"),
    @NamedQuery(name = "Habilidades.findByDescripci\u00f3n", query = "SELECT h FROM Habilidades h WHERE h.descripci\u00f3n = :descripci\u00f3n"),
    @NamedQuery(name = "Habilidades.findByURLVideo", query = "SELECT h FROM Habilidades h WHERE h.uRLVideo = :uRLVideo"),
    @NamedQuery(name = "Habilidades.findByPersonaidPersona", query = "SELECT h FROM Habilidades h WHERE h.habilidadesPK.personaidPersona = :personaidPersona")})
public class Habilidades implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected HabilidadesPK habilidadesPK;
    @Column(name = "Descripci\u00f3n")
    private String descripción;
    @Column(name = "URL_Video")
    private String uRLVideo;

    public Habilidades() {
    }

    public Habilidades(HabilidadesPK habilidadesPK) {
        this.habilidadesPK = habilidadesPK;
    }

    public Habilidades(int idtable1, int personaidPersona) {
        this.habilidadesPK = new HabilidadesPK(idtable1, personaidPersona);
    }

    public HabilidadesPK getHabilidadesPK() {
        return habilidadesPK;
    }

    public void setHabilidadesPK(HabilidadesPK habilidadesPK) {
        this.habilidadesPK = habilidadesPK;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public String getURLVideo() {
        return uRLVideo;
    }

    public void setURLVideo(String uRLVideo) {
        this.uRLVideo = uRLVideo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (habilidadesPK != null ? habilidadesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Habilidades)) {
            return false;
        }
        Habilidades other = (Habilidades) object;
        if ((this.habilidadesPK == null && other.habilidadesPK != null) || (this.habilidadesPK != null && !this.habilidadesPK.equals(other.habilidadesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.portfolioback.OrneDesFS.model.Habilidades[ habilidadesPK=" + habilidadesPK + " ]";
    }
    
}
