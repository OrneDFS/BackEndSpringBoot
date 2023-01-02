
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
@Table(name = "trabajos")
/*@NamedQueries({
    @NamedQuery(name = "Trabajos.findAll", query = "SELECT t FROM Trabajos t"),
    @NamedQuery(name = "Trabajos.findByIdTrabajos", query = "SELECT t FROM Trabajos t WHERE t.idTrabajos = :idTrabajos"),
    @NamedQuery(name = "Trabajos.findByPersona_idPersona", query = "SELECT t FROM Trabajos t WHERE t.persona_idPersona = :persona_idPersona")})*/
public class Trabajos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "idTrabajos")
    private Integer idTrabajos;
    
    @Column(name = "Empresa")
    private String empresa;
    
    @Column(name = "Periodo")
    private String periodo;
    
    @Column(name = "Puesto")
    private String puesto;
    
    @Column(name = "Descripcion")
    private String descripcion;
    
    @Column(name = "Url_empresa")
    private String urlempresa;
    
    @JoinColumn(name = "persona_id_Persona", referencedColumnName = "id")
    
    @ManyToOne(optional = false)
    @JsonIgnoreProperties(value={"estudiosCollection", "proyectosCollection", "redesSocialesCollection", "habilidadesCollection", "trabajosCollection"})
    private Persona persona;

    public Trabajos() {
    }

    public Trabajos(Integer idTrabajos, String empresa, String periodo, String puesto, String descripcion, String urlempresa, Persona persona) {
        this.idTrabajos = idTrabajos;
        this.empresa = empresa;
        this.periodo = periodo;
        this.puesto = puesto;
        this.descripcion = descripcion;
        this.urlempresa = urlempresa;
        this.persona = persona;
    }

    public Integer getIdTrabajos() {
        return idTrabajos;
    }

    public void setIdTrabajos(Integer idTrabajos) {
        this.idTrabajos = idTrabajos;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUrlempresa() {
        return urlempresa;
    }

    public void setUrlempresa(String urlempresa) {
        this.urlempresa = urlempresa;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    
    
    
}
