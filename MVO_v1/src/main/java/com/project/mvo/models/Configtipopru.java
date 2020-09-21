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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
@Table(name = "CONFIGTIPOPRU")
public class Configtipopru implements Serializable {

	private static final long serialVersionUID = 1L;
	// @Max(value=?) @Min(value=?)//if you know range of your decimal fields
	// consider using these annotations to enforce field validation
	@Id
	@Basic(optional = false)
	@NotNull
	@Column(name = "IDCONFTIPPRU")
	private BigDecimal idconftippru;

	@Size(max = 200)
	@Column(name = "NOMBRECONFTIPPRU")
	private String nombreconftippru;

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

	@JoinTable(name = "PRUEBASXVIGEN", joinColumns = {
			@JoinColumn(name = "CONFIGTIPOPRU_IDCONFTIPPRU", referencedColumnName = "IDCONFTIPPRU") }, inverseJoinColumns = {
					@JoinColumn(name = "VIGENCIA_IDVIGENCIA", referencedColumnName = "IDVIGENCIA") })
	@ManyToMany
	private Collection<Vigencia> vigenciaCollection;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "configtipopruIdconftippru")
	private Collection<Pruebapres> pruebapresCollection;

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "configtipopruIdconftippru")
	private Algoritmoipo algoritmoipo;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "configtipopruIdconftippru")
	private Collection<Item> itemCollection;

	public Configtipopru() {
	}

	public Configtipopru(BigDecimal idconftippru) {
		this.idconftippru = idconftippru;
	}

	public BigDecimal getIdconftippru() {
		return idconftippru;
	}

	public void setIdconftippru(BigDecimal idconftippru) {
		this.idconftippru = idconftippru;
	}

	public String getNombreconftippru() {
		return nombreconftippru;
	}

	public void setNombreconftippru(String nombreconftippru) {
		this.nombreconftippru = nombreconftippru;
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

	public Collection<Vigencia> getVigenciaCollection() {
		return vigenciaCollection;
	}

	public void setVigenciaCollection(Collection<Vigencia> vigenciaCollection) {
		this.vigenciaCollection = vigenciaCollection;
	}

	public Collection<Pruebapres> getPruebapresCollection() {
		return pruebapresCollection;
	}

	public void setPruebapresCollection(Collection<Pruebapres> pruebapresCollection) {
		this.pruebapresCollection = pruebapresCollection;
	}

	public Algoritmoipo getAlgoritmoipo() {
		return algoritmoipo;
	}

	public void setAlgoritmoipo(Algoritmoipo algoritmoipo) {
		this.algoritmoipo = algoritmoipo;
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
		hash += (idconftippru != null ? idconftippru.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Configtipopru)) {
			return false;
		}
		Configtipopru other = (Configtipopru) object;
		if ((this.idconftippru == null && other.idconftippru != null)
				|| (this.idconftippru != null && !this.idconftippru.equals(other.idconftippru))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Configtipopru[ idconftippru=" + idconftippru + " ]";
	}

}
