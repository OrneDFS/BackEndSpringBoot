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
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    @Column(name="id")
    private Integer id;
    
    
    @Column(name = "Descripcion")
    private String descripcion;
    @Column(name = "URL_Video")
    private String uRLVideo;
    @JoinColumn(name = "persona_idPersona", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Persona persona;

        public Habilidades(Integer id, String descripcion, String uRLVideo) {
        this.id = id;
        this.descripcion = descripcion;
        this.uRLVideo = uRLVideo;
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
        
        
}
