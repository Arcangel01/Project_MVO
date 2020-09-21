package com.project.mvo.models;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
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
@Table(name = "RESULTADOIPO")
public class Resultadoipo implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDRESULTADO")
    private BigDecimal idresultado;
    
    @Column(name = "PORCENTAJEAFINIDAD1")
    private Double porcentajeafinidad1;
    
    @Size(max = 100)
    @Column(name = "NOMBREAREA1")
    private String nombrearea1;
    
    @Column(name = "PORCENTAJEAFINIDAD2")
    private Double porcentajeafinidad2;
    
    @Size(max = 100)
    @Column(name = "NOMBREAREA2")
    private String nombrearea2;
    
    @JoinColumn(name = "PROGRAMAF_IDPROGRAMAFORMACION", referencedColumnName = "IDPROGRAMAFORMACION")
    @OneToOne(optional = false)
    private Programaf programafIdprogramaformacion;
    
    @JoinColumn(name = "PRUEBAPRES_IDPRUPRE", referencedColumnName = "IDPRUPRE")
    @OneToOne(optional = false)
    private Pruebapres pruebapresIdprupre;

    public Resultadoipo() {
    }

    public Resultadoipo(BigDecimal idresultado) {
        this.idresultado = idresultado;
    }

    public BigDecimal getIdresultado() {
        return idresultado;
    }

    public void setIdresultado(BigDecimal idresultado) {
        this.idresultado = idresultado;
    }

    public Double getPorcentajeafinidad1() {
        return porcentajeafinidad1;
    }

    public void setPorcentajeafinidad1(Double porcentajeafinidad1) {
        this.porcentajeafinidad1 = porcentajeafinidad1;
    }

    public String getNombrearea1() {
        return nombrearea1;
    }

    public void setNombrearea1(String nombrearea1) {
        this.nombrearea1 = nombrearea1;
    }

    public Double getPorcentajeafinidad2() {
        return porcentajeafinidad2;
    }

    public void setPorcentajeafinidad2(Double porcentajeafinidad2) {
        this.porcentajeafinidad2 = porcentajeafinidad2;
    }

    public String getNombrearea2() {
        return nombrearea2;
    }

    public void setNombrearea2(String nombrearea2) {
        this.nombrearea2 = nombrearea2;
    }

    public Programaf getProgramafIdprogramaformacion() {
        return programafIdprogramaformacion;
    }

    public void setProgramafIdprogramaformacion(Programaf programafIdprogramaformacion) {
        this.programafIdprogramaformacion = programafIdprogramaformacion;
    }

    public Pruebapres getPruebapresIdprupre() {
        return pruebapresIdprupre;
    }

    public void setPruebapresIdprupre(Pruebapres pruebapresIdprupre) {
        this.pruebapresIdprupre = pruebapresIdprupre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idresultado != null ? idresultado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Resultadoipo)) {
            return false;
        }
        Resultadoipo other = (Resultadoipo) object;
        if ((this.idresultado == null && other.idresultado != null) || (this.idresultado != null && !this.idresultado.equals(other.idresultado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Resultadoipo[ idresultado=" + idresultado + " ]";
    }
    
}
