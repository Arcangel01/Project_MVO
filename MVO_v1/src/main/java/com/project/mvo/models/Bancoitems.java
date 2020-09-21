package com.project.mvo.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
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
@Table(name = "BANCOITEMS")
public class Bancoitems implements Serializable {

	private static final long serialVersionUID = 1L;
	// @Max(value=?) @Min(value=?)//if you know range of your decimal fields
	// consider using these annotations to enforce field validation
	@Id
	@Basic(optional = false)
	@NotNull
	@Column(name = "IDBANCO")
	private BigDecimal idBanco;

	@Size(max = 100)
	@Column(name = "NOMBREBANCO")
	private String nombreBanco;

	@Lob
	@Column(name = "DESCRIPCIONBANCO")
	private String descripcionBanco;

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

	@JoinColumn(name = "CONFIGTIPOPRU_IDCONFTIPPRU", referencedColumnName = "IDCONFTIPPRU", insertable = false, updatable = false)
	@ManyToOne(optional = false)
	private Configtipopru configtipopru;

	public Bancoitems() {
		super();
	}

	public Bancoitems(@NotNull BigDecimal idBanco, @Size(max = 100) String nombreBanco, String descripcionBanco,
			BigInteger creadopor, Date fechacreado, BigInteger actualizadopor, Date fechaactualizado,
			Configtipopru configtipopru) {
		super();
		this.idBanco = idBanco;
		this.nombreBanco = nombreBanco;
		this.descripcionBanco = descripcionBanco;
		this.creadopor = creadopor;
		this.fechacreado = fechacreado;
		this.actualizadopor = actualizadopor;
		this.fechaactualizado = fechaactualizado;
		this.configtipopru = configtipopru;
	}

	public BigDecimal getIdBanco() {
		return idBanco;
	}

	public void setIdBanco(BigDecimal idBanco) {
		this.idBanco = idBanco;
	}

	public String getNombreBanco() {
		return nombreBanco;
	}

	public void setNombreBanco(String nombreBanco) {
		this.nombreBanco = nombreBanco;
	}

	public String getDescripcionBanco() {
		return descripcionBanco;
	}

	public void setDescripcionBanco(String descripcionBanco) {
		this.descripcionBanco = descripcionBanco;
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

	public Configtipopru getConfigtipopru() {
		return configtipopru;
	}

	public void setConfigtipopru(Configtipopru configtipopru) {
		this.configtipopru = configtipopru;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((actualizadopor == null) ? 0 : actualizadopor.hashCode());
		result = prime * result + ((configtipopru == null) ? 0 : configtipopru.hashCode());
		result = prime * result + ((creadopor == null) ? 0 : creadopor.hashCode());
		result = prime * result + ((descripcionBanco == null) ? 0 : descripcionBanco.hashCode());
		result = prime * result + ((fechaactualizado == null) ? 0 : fechaactualizado.hashCode());
		result = prime * result + ((fechacreado == null) ? 0 : fechacreado.hashCode());
		result = prime * result + ((idBanco == null) ? 0 : idBanco.hashCode());
		result = prime * result + ((nombreBanco == null) ? 0 : nombreBanco.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bancoitems other = (Bancoitems) obj;
		if (actualizadopor == null) {
			if (other.actualizadopor != null)
				return false;
		} else if (!actualizadopor.equals(other.actualizadopor))
			return false;
		if (configtipopru == null) {
			if (other.configtipopru != null)
				return false;
		} else if (!configtipopru.equals(other.configtipopru))
			return false;
		if (creadopor == null) {
			if (other.creadopor != null)
				return false;
		} else if (!creadopor.equals(other.creadopor))
			return false;
		if (descripcionBanco == null) {
			if (other.descripcionBanco != null)
				return false;
		} else if (!descripcionBanco.equals(other.descripcionBanco))
			return false;
		if (fechaactualizado == null) {
			if (other.fechaactualizado != null)
				return false;
		} else if (!fechaactualizado.equals(other.fechaactualizado))
			return false;
		if (fechacreado == null) {
			if (other.fechacreado != null)
				return false;
		} else if (!fechacreado.equals(other.fechacreado))
			return false;
		if (idBanco == null) {
			if (other.idBanco != null)
				return false;
		} else if (!idBanco.equals(other.idBanco))
			return false;
		if (nombreBanco == null) {
			if (other.nombreBanco != null)
				return false;
		} else if (!nombreBanco.equals(other.nombreBanco))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Bancoitems [idBanco=" + idBanco + ", nombreBanco=" + nombreBanco + ", descripcionBanco="
				+ descripcionBanco + ", creadopor=" + creadopor + ", fechacreado=" + fechacreado + ", actualizadopor="
				+ actualizadopor + ", fechaactualizado=" + fechaactualizado + ", configtipopru=" + configtipopru + "]";
	}

	
}
