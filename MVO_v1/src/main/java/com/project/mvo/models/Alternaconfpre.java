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
@Table(name = "ALTERNACONFPRE")
public class Alternaconfpre implements Serializable {

	private static final long serialVersionUID = 1L;
	// @Max(value=?) @Min(value=?)//if you know range of your decimal fields
	// consider using these annotations to enforce field validation
	@Id
	@Basic(optional = false)
	@NotNull
	@Column(name = "IDALTERCONFTP")
	private BigDecimal idalterconftp;

	@Size(max = 100)
	@Column(name = "ALTERNATIVA")
	private String alternativa;

	@Column(name = "VALOR")
	private BigInteger valor;

	@Column(name = "ESTADO")
	private BigInteger estado;

	@Column(name = "REQUIEREORDEN")
	private BigInteger requiereorden;

	@Column(name = "ORDEN")
	private BigInteger orden;

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

	@JoinColumn(name = "CONFIGTIPRE_IDCONFTIPOP", referencedColumnName = "IDCONFTIPOP")
	@ManyToOne(optional = false)
	private Configtipre configtipreIdconftipop;

	@JoinColumn(name = "ESTADO_IDESTADO", referencedColumnName = "IDESTADO")
	@OneToOne(optional = false)
	private Estado estadoIdestado;

	public Alternaconfpre() {
	}

	public Alternaconfpre(BigDecimal idalterconftp) {
		this.idalterconftp = idalterconftp;
	}

	public BigDecimal getIdalterconftp() {
		return idalterconftp;
	}

	public void setIdalterconftp(BigDecimal idalterconftp) {
		this.idalterconftp = idalterconftp;
	}

	public String getAlternativa() {
		return alternativa;
	}

	public void setAlternativa(String alternativa) {
		this.alternativa = alternativa;
	}

	public BigInteger getValor() {
		return valor;
	}

	public void setValor(BigInteger valor) {
		this.valor = valor;
	}

	public BigInteger getEstado() {
		return estado;
	}

	public void setEstado(BigInteger estado) {
		this.estado = estado;
	}

	public BigInteger getRequiereorden() {
		return requiereorden;
	}

	public void setRequiereorden(BigInteger requiereorden) {
		this.requiereorden = requiereorden;
	}

	public BigInteger getOrden() {
		return orden;
	}

	public void setOrden(BigInteger orden) {
		this.orden = orden;
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

	public Configtipre getConfigtipreIdconftipop() {
		return configtipreIdconftipop;
	}

	public void setConfigtipreIdconftipop(Configtipre configtipreIdconftipop) {
		this.configtipreIdconftipop = configtipreIdconftipop;
	}

	public Estado getEstadoIdestado() {
		return estadoIdestado;
	}

	public void setEstadoIdestado(Estado estadoIdestado) {
		this.estadoIdestado = estadoIdestado;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idalterconftp != null ? idalterconftp.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Alternaconfpre)) {
			return false;
		}
		Alternaconfpre other = (Alternaconfpre) object;
		if ((this.idalterconftp == null && other.idalterconftp != null)
				|| (this.idalterconftp != null && !this.idalterconftp.equals(other.idalterconftp))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Alternaconfpre[ idalterconftp=" + idalterconftp + " ]";
	}

}
