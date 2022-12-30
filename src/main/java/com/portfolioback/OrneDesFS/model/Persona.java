
package com.portfolioback.OrneDesFS.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
/*@Table(name = "persona")*/

/*@NamedQueries({
    @NamedQuery(name = "Persona.findAll", query = "SELECT p FROM Persona p"),
    @NamedQuery(name = "Persona.findById", query = "SELECT p FROM Persona p WHERE p.id = :id"),
    @NamedQuery(name = "Persona.findByNombre", query = "SELECT p FROM Persona p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "Persona.findByApellido", query = "SELECT p FROM Persona p WHERE p.apellido = :apellido"),
    @NamedQuery(name = "Persona.findByDescripcion", query = "SELECT p FROM Persona p WHERE p.descripcion = :descripcion"),
    @NamedQuery(name = "Persona.findByWhatsApp", query = "SELECT p FROM Persona p WHERE p.whatsApp = :whatsApp"),
    @NamedQuery(name = "Persona.findByCorreo", query = "SELECT p FROM Persona p WHERE p.correo = :correo"),
    @NamedQuery(name = "Persona.findByLugardeResidencia", query = "SELECT p FROM Persona p WHERE p.lugardeResidencia = :lugardeResidencia"),
    @NamedQuery(name = "Persona.findByUrlImg", query = "SELECT p FROM Persona p WHERE p.urlImg = :urlImg")})*/
public class Persona implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Basic (optional=false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "Apellido")
    private String apellido;
    @Column(name = "Descripcion") 
    private String descripcion;
    @Column(name = "WhatsApp")
    private String whatsApp;
    @Column(name = "Correo")
    private String correo;
    @Column(name = "Lugar_de_Residencia")
    private String lugardeResidencia;
    @Column(name = "Url_Img")
    private String urlImg;
   
    @OneToOne(mappedBy = "persona")
    @JsonIgnoreProperties(value="Persona")
    private Usuario usuario;
    
    @OneToMany(mappedBy = "persona")
    @JsonIgnoreProperties(value="Persona")
    private Collection<Proyectos> proyectosCollection;
    
    @OneToMany(mappedBy = "persona")
    @JsonIgnoreProperties(value="Persona")
    private Collection<RedesSociales> redesSocialesCollection;
    
    @OneToMany(mappedBy = "persona")
    @JsonIgnoreProperties(value="Persona")
    private Collection<Estudios> estudiosCollection;
    
    @OneToMany(mappedBy = "persona")
    @JsonIgnoreProperties(value="Persona")
    private Collection<Habilidades> habilidadesCollection;
    
    @OneToMany(mappedBy = "persona")
    @JsonIgnoreProperties(value="Persona")
    private Collection<Trabajos> trabajosCollection;

    public Persona() {
    }

    public Persona(Integer id, String nombre, String apellido, String descripcion, String whatsApp, String correo, String lugardeResidencia, String urlImg, Usuario usuario, Collection<Proyectos> proyectosCollection, Collection<RedesSociales> redesSocialesCollection, Collection<Estudios> estudiosCollection, Collection<Habilidades> habilidadesCollection, Collection<Trabajos> trabajosCollection) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.descripcion = descripcion;
        this.whatsApp = whatsApp;
        this.correo = correo;
        this.lugardeResidencia = lugardeResidencia;
        this.urlImg = urlImg;
        this.usuario = usuario;
        this.proyectosCollection = proyectosCollection;
        this.redesSocialesCollection = redesSocialesCollection;
        this.estudiosCollection = estudiosCollection;
        this.habilidadesCollection = habilidadesCollection;
        this.trabajosCollection = trabajosCollection;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getWhatsApp() {
        return whatsApp;
    }

    public void setWhatsApp(String whatsApp) {
        this.whatsApp = whatsApp;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getLugardeResidencia() {
        return lugardeResidencia;
    }

    public void setLugardeResidencia(String lugardeResidencia) {
        this.lugardeResidencia = lugardeResidencia;
    }

    public String getUrlImg() {
        return urlImg;
    }

    public void setUrlImg(String urlImg) {
        this.urlImg = urlImg;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Collection<Proyectos> getProyectosCollection() {
        return proyectosCollection;
    }

    public void setProyectosCollection(Collection<Proyectos> proyectosCollection) {
        this.proyectosCollection = proyectosCollection;
    }

    public Collection<RedesSociales> getRedesSocialesCollection() {
        return redesSocialesCollection;
    }

    public void setRedesSocialesCollection(Collection<RedesSociales> redesSocialesCollection) {
        this.redesSocialesCollection = redesSocialesCollection;
    }

    public Collection<Estudios> getEstudiosCollection() {
        return estudiosCollection;
    }

    public void setEstudiosCollection(Collection<Estudios> estudiosCollection) {
        this.estudiosCollection = estudiosCollection;
    }

    public Collection<Habilidades> getHabilidadesCollection() {
        return habilidadesCollection;
    }

    public void setHabilidadesCollection(Collection<Habilidades> habilidadesCollection) {
        this.habilidadesCollection = habilidadesCollection;
    }

    public Collection<Trabajos> getTrabajosCollection() {
        return trabajosCollection;
    }

    public void setTrabajosCollection(Collection<Trabajos> trabajosCollection) {
        this.trabajosCollection = trabajosCollection;
    }
    



}
