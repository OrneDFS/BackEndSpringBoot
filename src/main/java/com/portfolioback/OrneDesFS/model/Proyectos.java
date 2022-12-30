
package com.portfolioback.OrneDesFS.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;



@Entity
@Table(name = "proyectos")

/*@NamedQueries({
    @NamedQuery(name = "Proyectos.findAll", query = "SELECT p FROM Proyectos p"),
    @NamedQuery(name = "Proyectos.findByTitulo", query = "SELECT p FROM Proyectos p WHERE p.titulo = :titulo"),
    @NamedQuery(name = "Proyectos.findByDescripcion", query = "SELECT p FROM Proyectos p WHERE p.descripcion = :descripcion"),
    @NamedQuery(name = "Proyectos.findByUrlProy", query = "SELECT p FROM Proyectos p WHERE p.urlProy = :urlProy"),
    })*/

public class Proyectos implements Serializable {

    private static final long serialVersionUID = 1L;
    
    
    
    @Id
    @Basic(optional=false)
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    @Column(name="id")
    private Integer id;
    
    @Column(name = "Titulo")
    private String titulo;
    @Column(name = "Descripcion")
    private String descripcion;
    @Column(name = "Url_Proy")
    private String urlProy;
    @JoinColumn(name = "persona_idPersona", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Persona persona;

    public Proyectos() {
    }

    public Proyectos(String titulo, String descripcion, String urlProy, Persona persona) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.urlProy = urlProy;
        this.persona = persona;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

    
    
}
