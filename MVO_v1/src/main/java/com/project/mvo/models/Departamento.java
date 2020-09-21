package com.project.mvo.models;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author jcatangu
 */
@Entity
@Table(name = "DEPARTAMENTO")
public class Departamento implements Serializable {

	private static final long serialVersionUID = 1L;
	@EmbeddedId
	protected DepartamentoPK departamentoPK;

	@Size(max = 500)
	@Column(name = "NOMBREDEPARTAMENTO")
	private String nombredepartamento;

	@Size(max = 20)
	@Column(name = "CODIGODANE")
	private String codigodane;

	@JoinColumn(name = "MUNICIPIO_IDMPIO", referencedColumnName = "IDMPIO", insertable = false, updatable = false)
	@ManyToOne(optional = false)
	private Municipio municipio;

	@JoinColumn(name = "PARAMETROFUNC_IDPARFUNC", referencedColumnName = "IDPARFUNC")
	@OneToOne(optional = false)
	private Parametrofunc parametrofuncIdparfunc;

	public Departamento() {
	}

	public Departamento(DepartamentoPK departamentoPK) {
		this.departamentoPK = departamentoPK;
	}

	public Departamento(BigInteger iddepto, BigInteger municipioIdmpio) {
		this.departamentoPK = new DepartamentoPK(iddepto, municipioIdmpio);
	}

	public DepartamentoPK getDepartamentoPK() {
		return departamentoPK;
	}

	public void setDepartamentoPK(DepartamentoPK departamentoPK) {
		this.departamentoPK = departamentoPK;
	}

	public String getNombredepartamento() {
		return nombredepartamento;
	}

	public void setNombredepartamento(String nombredepartamento) {
		this.nombredepartamento = nombredepartamento;
	}

	public String getCodigodane() {
		return codigodane;
	}

	public void setCodigodane(String codigodane) {
		this.codigodane = codigodane;
	}

	public Municipio getMunicipio() {
		return municipio;
	}

	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
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
		hash += (departamentoPK != null ? departamentoPK.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Departamento)) {
			return false;
		}
		Departamento other = (Departamento) object;
		if ((this.departamentoPK == null && other.departamentoPK != null)
				|| (this.departamentoPK != null && !this.departamentoPK.equals(other.departamentoPK))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Departamento[ departamentoPK=" + departamentoPK + " ]";
	}

}
