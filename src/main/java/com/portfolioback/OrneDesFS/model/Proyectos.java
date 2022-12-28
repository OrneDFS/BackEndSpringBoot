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
@Table(name = "proyectos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Proyectos.findAll", query = "SELECT p FROM Proyectos p"),
    @NamedQuery(name = "Proyectos.findByIdProyectos", query = "SELECT p FROM Proyectos p WHERE p.proyectosPK.idProyectos = :idProyectos"),
    @NamedQuery(name = "Proyectos.findByTitulo", query = "SELECT p FROM Proyectos p WHERE p.titulo = :titulo"),
    @NamedQuery(name = "Proyectos.findByDescripci\u00f3n", query = "SELECT p FROM Proyectos p WHERE p.descripci\u00f3n = :descripci\u00f3n"),
    @NamedQuery(name = "Proyectos.findByUrlProy", query = "SELECT p FROM Proyectos p WHERE p.urlProy = :urlProy"),
    @NamedQuery(name = "Proyectos.findByPersonaidPersona", query = "SELECT p FROM Proyectos p WHERE p.proyectosPK.personaidPersona = :personaidPersona")})
public class Proyectos implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProyectosPK proyectosPK;
    @Column(name = "Titulo")
    private String titulo;
    @Column(name = "Descripci\u00f3n")
    private String descripción;
    @Column(name = "Url_Proy")
    private String urlProy;
    @JoinColumn(name = "Persona_idPersona", referencedColumnName = "idPersona", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Persona persona;

    public Proyectos() {
    }

    public Proyectos(ProyectosPK proyectosPK) {
        this.proyectosPK = proyectosPK;
    }

    public Proyectos(int idProyectos, int personaidPersona) {
        this.proyectosPK = new ProyectosPK(idProyectos, personaidPersona);
    }

    public ProyectosPK getProyectosPK() {
        return proyectosPK;
    }

    public void setProyectosPK(ProyectosPK proyectosPK) {
        this.proyectosPK = proyectosPK;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public String getUrlProy() {
        return urlProy;
    }

    public void setUrlProy(String urlProy) {
        this.urlProy = urlProy;
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
        hash += (proyectosPK != null ? proyectosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Proyectos)) {
            return false;
        }
        Proyectos other = (Proyectos) object;
        if ((this.proyectosPK == null && other.proyectosPK != null) || (this.proyectosPK != null && !this.proyectosPK.equals(other.proyectosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.portfolioback.OrneDesFS.model.Proyectos[ proyectosPK=" + proyectosPK + " ]";
    }
    
}
