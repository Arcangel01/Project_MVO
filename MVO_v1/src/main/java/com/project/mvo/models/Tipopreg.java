package com.project.mvo.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author jcatangu
 */
@Entity
@Table(name = "TIPOPREG")
public class Tipopreg implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDTIPOP")
    private BigDecimal idtipop;
    
    @Size(max = 100)
    @Column(name = "NOMBRETIPOP")
    private String nombretipop;
    
    @Lob
    @Column(name = "DESCRIPCION")
    private String descripcion;
    
    @Column(name = "CREADOPOR")
    private BigInteger creadopor;
    
    @Column(name = "FECHACREADO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechacreado;
    
    @Column(name = "ACTUALIZADOPOR")
    private BigInteger actualizadopor;
    
    @Column(name = "FECHAACTUALIZADO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaactualizado;
    
    @JoinColumn(name = "ESTADO_IDESTADO", referencedColumnName = "IDESTADO")
    @OneToOne(optional = false)
    private Estado estadoIdestado;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipopregIdtipop")
    private Collection<Configtipre> configtipreCollection;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipopreg")
    private Collection<Item> itemCollection;

    public Tipopreg() {
    }

    public Tipopreg(BigDecimal idtipop) {
        this.idtipop = idtipop;
    }

    public BigDecimal getIdtipop() {
        return idtipop;
    }

    public void setIdtipop(BigDecimal idtipop) {
        this.idtipop = idtipop;
    }

    public String getNombretipop() {
        return nombretipop;
    }

    public void setNombretipop(String nombretipop) {
        this.nombretipop = nombretipop;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigInteger getCreadopor() {
        return creadopor;
    }

    public void setCreadopor(BigInteger creadopor) {
        this.creadopor = creadopor;
    }

    public Date getFechacreado() {
        return fechacreado;
    }

    public void setFechacreado(Date fechacreado) {
        this.fechacreado = fechacreado;
    }

    public BigInteger getActualizadopor() {
        return actualizadopor;
    }

    public void setActualizadopor(BigInteger actualizadopor) {
        this.actualizadopor = actualizadopor;
    }

    public Date getFechaactualizado() {
        return fechaactualizado;
    }

    public void setFechaactualizado(Date fechaactualizado) {
        this.fechaactualizado = fechaactualizado;
    }

    public Estado getEstadoIdestado() {
        return estadoIdestado;
    }

    public void setEstadoIdestado(Estado estadoIdestado) {
        this.estadoIdestado = estadoIdestado;
    }

    public Collection<Configtipre> getConfigtipreCollection() {
        return configtipreCollection;
    }

    public void setConfigtipreCollection(Collection<Configtipre> configtipreCollection) {
        this.configtipreCollection = configtipreCollection;
    }

    public Collection<Item> getItemCollection() {
        return itemCollection;
    }

    public void setItemCollection(Collection<Item> itemCollection) {
        this.itemCollection = itemCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtipop != null ? idtipop.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipopreg)) {
            return false;
        }
        Tipopreg other = (Tipopreg) object;
        if ((this.idtipop == null && other.idtipop != null) || (this.idtipop != null && !this.idtipop.equals(other.idtipop))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Tipopreg[ idtipop=" + idtipop + " ]";
    }
    
}
