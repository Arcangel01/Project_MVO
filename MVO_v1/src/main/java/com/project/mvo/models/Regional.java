package com.project.mvo.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author jcatangu
 */
@Entity
@Table(name = "REGIONAL")
public class Regional implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDREGIONAL")
    private BigDecimal idregional;
    
    @Size(max = 50)
    @Column(name = "CODIGOREGIONAL")
    private String codigoregional;
    
    @Size(max = 200)
    @Column(name = "NOMBREREGIONAL")
    private String nombreregional;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "regionalIdregional")
    private Collection<Centrofor> centroforCollection;
    
    @JoinColumn(name = "PARAMETROFUNC_IDPARFUNC", referencedColumnName = "IDPARFUNC")
    @OneToOne(optional = false)
    private Parametrofunc parametrofuncIdparfunc;

    public Regional() {
    }

    public Regional(BigDecimal idregional) {
        this.idregional = idregional;
    }

    public BigDecimal getIdregional() {
        return idregional;
    }

    public void setIdregional(BigDecimal idregional) {
        this.idregional = idregional;
    }

    public String getCodigoregional() {
        return codigoregional;
    }

    public void setCodigoregional(String codigoregional) {
        this.codigoregional = codigoregional;
    }

    public String getNombreregional() {
        return nombreregional;
    }

    public void setNombreregional(String nombreregional) {
        this.nombreregional = nombreregional;
    }

    public Collection<Centrofor> getCentroforCollection() {
        return centroforCollection;
    }

    public void setCentroforCollection(Collection<Centrofor> centroforCollection) {
        this.centroforCollection = centroforCollection;
    }

    public Parametrofunc getParametrofuncIdparfunc() {
        return parametrofuncIdparfunc;
    }

    public void setParametrofuncIdparfunc(Parametrofunc parametrofuncIdparfunc) {
        this.parametrofuncIdparfunc = parametrofuncIdparfunc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idregional != null ? idregional.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Regional)) {
            return false;
        }
        Regional other = (Regional) object;
        if ((this.idregional == null && other.idregional != null) || (this.idregional != null && !this.idregional.equals(other.idregional))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Regional[ idregional=" + idregional + " ]";
    }
    
}

