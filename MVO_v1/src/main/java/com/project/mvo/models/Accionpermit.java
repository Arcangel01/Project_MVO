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
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

/**
 *
 * @author jcatangu
 */
@Entity
@Table(name = "ACCIONPERMIT")
public class Accionpermit implements Serializable {

	private static final long serialVersionUID = 1L;
	// @Max(value=?) @Min(value=?)//if you know range of your decimal fields
	// consider using these annotations to enforce field validation
	@Id
	@Basic(optional = false)
	@NotNull
	@Column(name = "IDACCION")
	private BigDecimal idaccion;

	@Size(max = 100)
	@Column(name = "NOMBREACCION")
	private String nombreaccion;

	@Lob
	@Column(name = "DESCRIPCION")
	private String descripcion;

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

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "accionpermit")
	private Collection<Accionesporrol> accionesporrolCollection;

	public Accionpermit() {
	}

	public Accionpermit(BigDecimal idaccion) {
		this.idaccion = idaccion;
	}

	public BigDecimal getIdaccion() {
		return idaccion;
	}

	public void setIdaccion(BigDecimal idaccion) {
		this.idaccion = idaccion;
	}

	public String getNombreaccion() {
		return nombreaccion;
	}

	public void setNombreaccion(String nombreaccion) {
		this.nombreaccion = nombreaccion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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

	public Collection<Accionesporrol> getAccionesporrolCollection() {
		return accionesporrolCollection;
	}

	public void setAccionesporrolCollection(Collection<Accionesporrol> accionesporrolCollection) {
		this.accionesporrolCollection = accionesporrolCollection;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idaccion != null ? idaccion.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Accionpermit)) {
			return false;
		}
		Accionpermit other = (Accionpermit) object;
		if ((this.idaccion == null && other.idaccion != null)
				|| (this.idaccion != null && !this.idaccion.equals(other.idaccion))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Accionpermit[ idaccion=" + idaccion + " ]";
	}

}