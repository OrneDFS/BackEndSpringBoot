
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
@Table(name = "estudios")

/*@NamedQueries({
    @NamedQuery(name = "Estudios.findAll", query = "SELECT e FROM Estudios e"),
    @NamedQuery(name = "Estudios.findByInstitucion", query = "SELECT e FROM Estudios e WHERE e.institucion = :institucion"),
    @NamedQuery(name = "Estudios.findByPeriodo", query = "SELECT e FROM Estudios e WHERE e.periodo = :periodo"),
    @NamedQuery(name = "Estudios.findByTitulo", query = "SELECT e FROM Estudios e WHERE e.titulo = :titulo"),
    @NamedQuery(name = "Estudios.findByDescripcion", query = "SELECT e FROM Estudios e WHERE e.descripcion = :descripcion"),
    @NamedQuery(name = "Estudios.findByEnlace", query = "SELECT e FROM Estudios e WHERE e.enlace = :enlace"),
})*/

public class Estudios implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional=false)
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
    private Integer id;
        
    @Column(name = "Institucion")
    private String institucion;
    @Column(name = "Periodo")
    private String periodo;
    @Column(name = "Titulo")
    private String titulo;
    @Column(name = "Descripcion")
    private String descripcion;
    @Column(name = "Enlace")
    private String enlace;
    @JoinColumn(name = "persona_id_persona", referencedColumnName = "id")
    @ManyToOne
    @JsonIgnoreProperties(value={"estudiosCollection", "proyectosCollection", "redesSocialesCollection", "habilidadesCollection", "trabajosCollection"})
    private Persona persona;

    public Estudios() {
    }

    public Estudios(Integer id, String institucion, String periodo, String titulo, String descripcion, String enlace, Persona persona) {
        this.id = id;
        this.institucion = institucion;
        this.periodo = periodo;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.enlace = enlace;
        this.persona = persona;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
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

    public String getEnlace() {
        return enlace;
    }

    public void setEnlace(String enlace) {
        this.enlace = enlace;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    

    
    
    
}
