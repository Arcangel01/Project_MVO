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
import javax.persistence.ManyToMany;
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
@Table(name = "VIGENCIA")
public class Vigencia implements Serializable {

	private static final long serialVersionUID = 1L;
	// @Max(value=?) @Min(value=?)//if you know range of your decimal fields
	// consider using these annotations to enforce field validation
	@Id
	@Basic(optional = false)
	@NotNull
	@Column(name = "IDVIGENCIA")
	private BigDecimal idvigencia;

	@Size(max = 200)
	@Column(name = "NOMBREVIGENCIA")
	private String nombrevigencia;

	@Column(name = "ANIO")
	private BigInteger anio;

	@Size(max = 100)
	@Column(name = "ESTADO")
	private String estado;

	@Size(max = 100)
	@Column(name = "MODALIDAD")
	private String modalidad;

	@Column(name = "FECHAINICIO")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechainicio;

	@Column(name = "FECHAFIN")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechafin;

	@Size(max = 50)
	@Column(name = "FORMAPRESENTACION")
	private String formapresentacion;

	@Lob
	@Column(name = "ENCABEZADO")
	private String encabezado;

	@Column(name = "FECHAMAXCAMBIOS")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechamaxcambios;

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

	@ManyToMany(mappedBy = "vigenciaCollection")
	private Collection<Configtipopru> configtipopruCollection;

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "vigenciaIdvigencia")
	private Pruebapres pruebapres;

	public Vigencia() {
	}

	public Vigencia(BigDecimal idvigencia) {
		this.idvigencia = idvigencia;
	}

	public BigDecimal getIdvigencia() {
		return idvigencia;
	}

	public void setIdvigencia(BigDecimal idvigencia) {
		this.idvigencia = idvigencia;
	}

	public String getNombrevigencia() {
		return nombrevigencia;
	}

	public void setNombrevigencia(String nombrevigencia) {
		this.nombrevigencia = nombrevigencia;
	}

	public BigInteger getAnio() {
		return anio;
	}

	public void setAnio(BigInteger anio) {
		this.anio = anio;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getModalidad() {
		return modalidad;
	}

	public void setModalidad(String modalidad) {
		this.modalidad = modalidad;
	}

	public Date getFechainicio() {
		return fechainicio;
	}

	public void setFechainicio(Date fechainicio) {
		this.fechainicio = fechainicio;
	}

	public Date getFechafin() {
		return fechafin;
	}

	public void setFechafin(Date fechafin) {
		this.fechafin = fechafin;
	}

	public String getFormapresentacion() {
		return formapresentacion;
	}

	public void setFormapresentacion(String formapresentacion) {
		this.formapresentacion = formapresentacion;
	}

	public String getEncabezado() {
		return encabezado;
	}

	public void setEncabezado(String encabezado) {
		this.encabezado = encabezado;
	}

	public Date getFechamaxcambios() {
		return fechamaxcambios;
	}

	public void setFechamaxcambios(Date fechamaxcambios) {
		this.fechamaxcambios = fechamaxcambios;
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

	public Collection<Configtipopru> getConfigtipopruCollection() {
		return configtipopruCollection;
	}

	public void setConfigtipopruCollection(Collection<Configtipopru> configtipopruCollection) {
		this.configtipopruCollection = configtipopruCollection;
	}

	public Pruebapres getPruebapres() {
		return pruebapres;
	}

	public void setPruebapres(Pruebapres pruebapres) {
		this.pruebapres = pruebapres;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idvigencia != null ? idvigencia.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Vigencia)) {
			return false;
		}
		Vigencia other = (Vigencia) object;
		if ((this.idvigencia == null && other.idvigencia != null)
				|| (this.idvigencia != null && !this.idvigencia.equals(other.idvigencia))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Vigencia[ idvigencia=" + idvigencia + " ]";
	}

}
