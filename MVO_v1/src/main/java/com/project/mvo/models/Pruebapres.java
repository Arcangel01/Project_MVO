package com.project.mvo.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "PRUEBAPRES")
public class Pruebapres implements Serializable {

	private static final long serialVersionUID = 1L;
	// @Max(value=?) @Min(value=?)//if you know range of your decimal fields
	// consider using these annotations to enforce field validation
	@Id
	@Basic(optional = false)
	@NotNull
	@Column(name = "IDPRUPRE")
	private BigDecimal idprupre;

	@Size(max = 200)
	@Column(name = "NOMBREPRUEBA")
	private String nombreprueba;

	@Column(name = "FECHAYHORAINICIO")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechayhorainicio;

	@Column(name = "FECHAYHORAFIN")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechayhorafin;

	@JoinColumn(name = "CANDIDATO_IDCANDIDATO", referencedColumnName = "IDCANDIDATO")
	@ManyToOne(optional = false)
	private Candidato candidatoIdcandidato;

	@JoinColumn(name = "CONFIGTIPOPRU_IDCONFTIPPRU", referencedColumnName = "IDCONFTIPPRU")
	@ManyToOne(optional = false)
	private Configtipopru configtipopruIdconftippru;

	@JoinColumn(name = "VIGENCIA_IDVIGENCIA", referencedColumnName = "IDVIGENCIA")
	@OneToOne(optional = false)
	private Vigencia vigenciaIdvigencia;

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "pruebapresIdprupre")
	private Resultadoipo resultadoipo;

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "pruebapresIdprupre")
	private Algoritmoipo algoritmoipo;

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "pruebapresIdprupre")
	private Alternativasejec alternativasejec;

	public Pruebapres() {
	}

	public Pruebapres(BigDecimal idprupre) {
		this.idprupre = idprupre;
	}

	public BigDecimal getIdprupre() {
		return idprupre;
	}

	public void setIdprupre(BigDecimal idprupre) {
		this.idprupre = idprupre;
	}

	public String getNombreprueba() {
		return nombreprueba;
	}

	public void setNombreprueba(String nombreprueba) {
		this.nombreprueba = nombreprueba;
	}

	public Date getFechayhorainicio() {
		return fechayhorainicio;
	}

	public void setFechayhorainicio(Date fechayhorainicio) {
		this.fechayhorainicio = fechayhorainicio;
	}

	public Date getFechayhorafin() {
		return fechayhorafin;
	}

	public void setFechayhorafin(Date fechayhorafin) {
		this.fechayhorafin = fechayhorafin;
	}

	public Candidato getCandidatoIdcandidato() {
		return candidatoIdcandidato;
	}

	public void setCandidatoIdcandidato(Candidato candidatoIdcandidato) {
		this.candidatoIdcandidato = candidatoIdcandidato;
	}

	public Configtipopru getConfigtipopruIdconftippru() {
		return configtipopruIdconftippru;
	}

	public void setConfigtipopruIdconftippru(Configtipopru configtipopruIdconftippru) {
		this.configtipopruIdconftippru = configtipopruIdconftippru;
	}

	public Vigencia getVigenciaIdvigencia() {
		return vigenciaIdvigencia;
	}

	public void setVigenciaIdvigencia(Vigencia vigenciaIdvigencia) {
		this.vigenciaIdvigencia = vigenciaIdvigencia;
	}

	public Resultadoipo getResultadoipo() {
		return resultadoipo;
	}

	public void setResultadoipo(Resultadoipo resultadoipo) {
		this.resultadoipo = resultadoipo;
	}

	public Algoritmoipo getAlgoritmoipo() {
		return algoritmoipo;
	}

	public void setAlgoritmoipo(Algoritmoipo algoritmoipo) {
		this.algoritmoipo = algoritmoipo;
	}

	public Alternativasejec getAlternativasejec() {
		return alternativasejec;
	}

	public void setAlternativasejec(Alternativasejec alternativasejec) {
		this.alternativasejec = alternativasejec;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idprupre != null ? idprupre.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Pruebapres)) {
			return false;
		}
		Pruebapres other = (Pruebapres) object;
		if ((this.idprupre == null && other.idprupre != null)
				|| (this.idprupre != null && !this.idprupre.equals(other.idprupre))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Pruebapres[ idprupre=" + idprupre + " ]";
	}

}
