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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 *
 * @author jcatangu
 */
@Entity
@Table(name = "ALGORITMOIPO")
public class Algoritmoipo implements Serializable {

	private static final long serialVersionUID = 1L;
	// @Max(value=?) @Min(value=?)//if you know range of your decimal fields
	// consider using these annotations to enforce field validation
	@Id
	@Basic(optional = false)
	@NotNull
	@Column(name = "IDALGORITMO")
	private BigDecimal idalgoritmo;

	@Column(name = "MODIFICADOPOR")
	private BigInteger modificadopor;

	@Column(name = "FECHAMODIFICADO")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechamodificado;

	@Column(name = "CREADOPOR_1")
	private BigInteger creadopor1;

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

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "algoritmoipoIdalgoritmo")
	private Collection<Programaf> programafCollection;

	@JoinColumn(name = "CONFIGTIPOPRU_IDCONFTIPPRU", referencedColumnName = "IDCONFTIPPRU")
	@OneToOne(optional = false)
	private Configtipopru configtipopruIdconftippru;

	@JoinColumn(name = "PRUEBAPRES_IDPRUPRE", referencedColumnName = "IDPRUPRE")
	@OneToOne(optional = false)
	private Pruebapres pruebapresIdprupre;

	public Algoritmoipo() {
	}

	public Algoritmoipo(BigDecimal idalgoritmo) {
		this.idalgoritmo = idalgoritmo;
	}

	public BigDecimal getIdalgoritmo() {
		return idalgoritmo;
	}

	public void setIdalgoritmo(BigDecimal idalgoritmo) {
		this.idalgoritmo = idalgoritmo;
	}

	public BigInteger getModificadopor() {
		return modificadopor;
	}

	public void setModificadopor(BigInteger modificadopor) {
		this.modificadopor = modificadopor;
	}

	public Date getFechamodificado() {
		return fechamodificado;
	}

	public void setFechamodificado(Date fechamodificado) {
		this.fechamodificado = fechamodificado;
	}

	public BigInteger getCreadopor1() {
		return creadopor1;
	}

	public void setCreadopor1(BigInteger creadopor1) {
		this.creadopor1 = creadopor1;
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

	public Collection<Programaf> getProgramafCollection() {
		return programafCollection;
	}

	public void setProgramafCollection(Collection<Programaf> programafCollection) {
		this.programafCollection = programafCollection;
	}

	public Configtipopru getConfigtipopruIdconftippru() {
		return configtipopruIdconftippru;
	}

	public void setConfigtipopruIdconftippru(Configtipopru configtipopruIdconftippru) {
		this.configtipopruIdconftippru = configtipopruIdconftippru;
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
		hash += (idalgoritmo != null ? idalgoritmo.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Algoritmoipo)) {
			return false;
		}
		Algoritmoipo other = (Algoritmoipo) object;
		if ((this.idalgoritmo == null && other.idalgoritmo != null)
				|| (this.idalgoritmo != null && !this.idalgoritmo.equals(other.idalgoritmo))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Algoritmoipo[ idalgoritmo=" + idalgoritmo + " ]";
	}

}
