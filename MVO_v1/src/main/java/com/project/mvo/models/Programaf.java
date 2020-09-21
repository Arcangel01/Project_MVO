package com.project.mvo.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author jcatangu
 */
@Entity
@Table(name = "PROGRAMAF")
public class Programaf implements Serializable {

	private static final long serialVersionUID = 1L;
	// @Max(value=?) @Min(value=?)//if you know range of your decimal fields
	// consider using these annotations to enforce field validation
	@Id
	@Basic(optional = false)
	@NotNull
	@Column(name = "IDPROGRAMAFORMACION")
	private BigDecimal idprogramaformacion;
	
	@Size(max = 200)
	@Column(name = "NOMBREPROGRAMA")
	private String nombreprograma;
	
	@Size(max = 200)
	@Column(name = "LINEATECNOLOGICA")
	private String lineatecnologica;
	
	@Size(max = 100)
	@Column(name = "TIPOPROGRAMA")
	private String tipoprograma;
	
	@Column(name = "HORAS")
	private BigInteger horas;
	
	@JoinColumn(name = "ALGORITMOIPO_IDALGORITMO", referencedColumnName = "IDALGORITMO")
	@ManyToOne(optional = false)
	private Algoritmoipo algoritmoipoIdalgoritmo;
	
	@JoinColumn(name = "AREAVOCACION_IDAREAVOCACION", referencedColumnName = "IDAREAVOCACION")
	@OneToOne(optional = false)
	private Areavocacion areavocacionIdareavocacion;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "programafIdprogramaformacion")
	private Resultadoipo resultadoipo;

	public Programaf() {
	}

	public Programaf(BigDecimal idprogramaformacion) {
		this.idprogramaformacion = idprogramaformacion;
	}

	public BigDecimal getIdprogramaformacion() {
		return idprogramaformacion;
	}

	public void setIdprogramaformacion(BigDecimal idprogramaformacion) {
		this.idprogramaformacion = idprogramaformacion;
	}

	public String getNombreprograma() {
		return nombreprograma;
	}

	public void setNombreprograma(String nombreprograma) {
		this.nombreprograma = nombreprograma;
	}

	public String getLineatecnologica() {
		return lineatecnologica;
	}

	public void setLineatecnologica(String lineatecnologica) {
		this.lineatecnologica = lineatecnologica;
	}

	public String getTipoprograma() {
		return tipoprograma;
	}

	public void setTipoprograma(String tipoprograma) {
		this.tipoprograma = tipoprograma;
	}

	public BigInteger getHoras() {
		return horas;
	}

	public void setHoras(BigInteger horas) {
		this.horas = horas;
	}

	public Algoritmoipo getAlgoritmoipoIdalgoritmo() {
		return algoritmoipoIdalgoritmo;
	}

	public void setAlgoritmoipoIdalgoritmo(Algoritmoipo algoritmoipoIdalgoritmo) {
		this.algoritmoipoIdalgoritmo = algoritmoipoIdalgoritmo;
	}

	public Areavocacion getAreavocacionIdareavocacion() {
		return areavocacionIdareavocacion;
	}

	public void setAreavocacionIdareavocacion(Areavocacion areavocacionIdareavocacion) {
		this.areavocacionIdareavocacion = areavocacionIdareavocacion;
	}

	public Resultadoipo getResultadoipo() {
		return resultadoipo;
	}

	public void setResultadoipo(Resultadoipo resultadoipo) {
		this.resultadoipo = resultadoipo;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idprogramaformacion != null ? idprogramaformacion.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Programaf)) {
			return false;
		}
		Programaf other = (Programaf) object;
		if ((this.idprogramaformacion == null && other.idprogramaformacion != null)
				|| (this.idprogramaformacion != null && !this.idprogramaformacion.equals(other.idprogramaformacion))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Programaf[ idprogramaformacion=" + idprogramaformacion + " ]";
	}

}
