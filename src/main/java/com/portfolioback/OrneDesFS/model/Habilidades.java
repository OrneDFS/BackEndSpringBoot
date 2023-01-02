package com.portfolioback.OrneDesFS.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "habilidades")
/*@NamedQueries({
    @NamedQuery(name = "Habilidades.findAll", query = "SELECT h FROM Habilidades h"),
    @NamedQuery(name = "Habilidades.findByDescripcion", query = "SELECT h FROM Habilidades h WHERE h.descripcion = :descripcion"),
    @NamedQuery(name = "Habilidades.findByURLVideo", query = "SELECT h FROM Habilidades h WHERE h.uRLVideo = :uRLVideo"),
    })*/

public class Habilidades implements Serializable {

    private static final long serialVersionUID = 1L;



    @Id
    @Basic(optional=false)
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
    private Integer id;
    
    
    @Column(name = "Descripcion")
    private String descripcion;
    @Column(name = "URL_Video")
    private String uRLVideo;
    @JoinColumn(name = "persona_id_persona", referencedColumnName = "id")
    @ManyToOne(optional = false)
    @JsonIgnoreProperties(value={"estudiosCollection", "proyectosCollection", "redesSocialesCollection", "habilidadesCollection", "trabajosCollection"})
    private Persona persona;

        public Habilidades(Integer id, String descripcion, String uRLVideo, Persona persona ) {
        this.id = id;
        this.descripcion = descripcion;
        this.uRLVideo = uRLVideo;
        this.persona = persona;
    }

    public Habilidades() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getuRLVideo() {
        return uRLVideo;
    }

    public void setuRLVideo(String uRLVideo) {
        this.uRLVideo = uRLVideo;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
        
        
}
