
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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@Table(name = "redes_sociales")
/*@NamedQueries({
    @NamedQuery(name = "RedesSociales.findAll", query = "SELECT r FROM RedesSociales r"),
    @NamedQuery(name = "RedesSociales.findByRedSocial", query = "SELECT r FROM RedesSociales r WHERE r.redSocial = :redSocial"),
    })*/
public class RedesSociales implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional=false)
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
    private Integer id;
    @Column(name = "redSocial")
    private String redSocial;
    @JoinColumn(name = "persona_id_Persona", referencedColumnName = "id")
    @ManyToOne(optional = false)
    @JsonIgnoreProperties(value={"estudiosCollection", "proyectosCollection", "redesSocialesCollection", "habilidadesCollection", "trabajosCollection"})
    private Persona persona;

    public RedesSociales() {
    }

    public RedesSociales(Integer id, String redSocial, Persona persona) {
        this.id = id;
        this.redSocial = redSocial;
        this.persona = persona;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    
    
}
