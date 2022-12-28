/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioback.OrneDesFS.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ornel
 */
@Entity
@Table(name = "trabajos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Trabajos.findAll", query = "SELECT t FROM Trabajos t"),
    @NamedQuery(name = "Trabajos.findByIdTrabajos", query = "SELECT t FROM Trabajos t WHERE t.idTrabajos = :idTrabajos"),
    @NamedQuery(name = "Trabajos.findByPersonaidPersona", query = "SELECT t FROM Trabajos t WHERE t.personaidPersona = :personaidPersona")})
public class Trabajos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idTrabajos")
    private Integer idTrabajos;
    @Lob
    @Column(name = "Empresa")
    private String empresa;
    @Lob
    @Column(name = "Periodo")
    private String periodo;
    @Lob
    @Column(name = "Puesto")
    private String puesto;
    @Lob
    @Column(name = "Descripci\u00c3\u00b3n")
    private String descripciÃn;
    @Lob
    @Column(name = "Url_empresa")
    private String urlempresa;
    @Column(name = "Persona_idPersona")
    private Integer personaidPersona;

    public Trabajos() {
    }

    public Trabajos(Integer idTrabajos) {
        this.idTrabajos = idTrabajos;
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

    public String getDescripciÃn() {
        return descripciÃn;
    }

    public void setDescripciÃn(String descripciÃn) {
        this.descripciÃn = descripciÃn;
    }

    public String getUrlempresa() {
        return urlempresa;
    }

    public void setUrlempresa(String urlempresa) {
        this.urlempresa = urlempresa;
    }

    public Integer getPersonaidPersona() {
        return personaidPersona;
    }

    public void setPersonaidPersona(Integer personaidPersona) {
        this.personaidPersona = personaidPersona;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTrabajos != null ? idTrabajos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Trabajos)) {
            return false;
        }
        Trabajos other = (Trabajos) object;
        if ((this.idTrabajos == null && other.idTrabajos != null) || (this.idTrabajos != null && !this.idTrabajos.equals(other.idTrabajos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.portfolioback.OrneDesFS.model.Trabajos[ idTrabajos=" + idTrabajos + " ]";
    }
    
}
