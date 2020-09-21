package com.project.mvo.models;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author jcatangu
 */
@Entity
@Table(name = "TIPOPOBLACION")
public class Tipopoblacion implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDTIPOPOB")
    private BigDecimal idtipopob;
    
    @Size(max = 200)
    @Column(name = "NOMBRETIPOPOB")
    private String nombretipopob;
    
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "tipopoblacionIdtipopob")
    private Candidato candidato;
    
    @JoinColumn(name = "PARAMETROFUNC_IDPARFUNC", referencedColumnName = "IDPARFUNC")
    @OneToOne(optional = false)
    private Parametrofunc parametrofuncIdparfunc;

    public Tipopoblacion() {
    }

    public Tipopoblacion(BigDecimal idtipopob) {
        this.idtipopob = idtipopob;
    }

    public BigDecimal getIdtipopob() {
        return idtipopob;
    }

    public void setIdtipopob(BigDecimal idtipopob) {
        this.idtipopob = idtipopob;
    }

    public String getNombretipopob() {
        return nombretipopob;
    }

    public void setNombretipopob(String nombretipopob) {
        this.nombretipopob = nombretipopob;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
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
        hash += (idtipopob != null ? idtipopob.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipopoblacion)) {
            return false;
        }
        Tipopoblacion other = (Tipopoblacion) object;
        if ((this.idtipopob == null && other.idtipopob != null) || (this.idtipopob != null && !this.idtipopob.equals(other.idtipopob))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Tipopoblacion[ idtipopob=" + idtipopob + " ]";
    }
    
}
