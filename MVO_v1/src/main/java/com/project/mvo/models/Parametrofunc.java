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
import javax.persistence.Lob;
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
@Table(name = "PARAMETROFUNC")
public class Parametrofunc implements Serializable {

	private static final long serialVersionUID = 1L;
	// @Max(value=?) @Min(value=?)//if you know range of your decimal fields
	// consider using these annotations to enforce field validation
	@Id
	@Basic(optional = false)
	@NotNull
	@Column(name = "IDPARFUNC")
	private BigDecimal idparfunc;

	@Size(max = 200)
	@Column(name = "NOMBREPARFUNC")
	private String nombreparfunc;

	@Lob
	@Column(name = "DESCRIPCIONPARFUNC")
	private String descripcionparfunc;

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

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "parametrofuncIdparfunc")
	private Tipopoblacion tipopoblacion;

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "parametrofuncIdparfunc")
	private Departamento departamento;

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "parametrofuncIdparfunc")
	private Centrofor centrofor;

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "parametrofuncIdparfunc")
	private Regional regional;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "parametrofunc")
	private Collection<Areahabiconoc> areahabiconocCollection;

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "parametrofuncIdparfunc")
	private Municipio municipio;

	@JoinColumn(name = "TIPOPARAFUNC_IDTIPOP", referencedColumnName = "IDTIPOP")
	@OneToOne(optional = false)
	private Tipoparafunc tipoparafuncIdtipop;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "parametrofunc")
	private Collection<Lista> listaCollection;

	public Parametrofunc() {
	}

	public Parametrofunc(BigDecimal idparfunc) {
		this.idparfunc = idparfunc;
	}

	public BigDecimal getIdparfunc() {
		return idparfunc;
	}

	public void setIdparfunc(BigDecimal idparfunc) {
		this.idparfunc = idparfunc;
	}

	public String getNombreparfunc() {
		return nombreparfunc;
	}

	public void setNombreparfunc(String nombreparfunc) {
		this.nombreparfunc = nombreparfunc;
	}

	public String getDescripcionparfunc() {
		return descripcionparfunc;
	}

	public void setDescripcionparfunc(String descripcionparfunc) {
		this.descripcionparfunc = descripcionparfunc;
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

	public Tipopoblacion getTipopoblacion() {
		return tipopoblacion;
	}

	public void setTipopoblacion(Tipopoblacion tipopoblacion) {
		this.tipopoblacion = tipopoblacion;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public Centrofor getCentrofor() {
		return centrofor;
	}

	public void setCentrofor(Centrofor centrofor) {
		this.centrofor = centrofor;
	}

	public Regional getRegional() {
		return regional;
	}

	public void setRegional(Regional regional) {
		this.regional = regional;
	}

	public Collection<Areahabiconoc> getAreahabiconocCollection() {
		return areahabiconocCollection;
	}

	public void setAreahabiconocCollection(Collection<Areahabiconoc> areahabiconocCollection) {
		this.areahabiconocCollection = areahabiconocCollection;
	}

	public Municipio getMunicipio() {
		return municipio;
	}

	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}

	public Tipoparafunc getTipoparafuncIdtipop() {
		return tipoparafuncIdtipop;
	}

	public void setTipoparafuncIdtipop(Tipoparafunc tipoparafuncIdtipop) {
		this.tipoparafuncIdtipop = tipoparafuncIdtipop;
	}

	public Collection<Lista> getListaCollection() {
		return listaCollection;
	}

	public void setListaCollection(Collection<Lista> listaCollection) {
		this.listaCollection = listaCollection;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idparfunc != null ? idparfunc.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Parametrofunc)) {
			return false;
		}
		Parametrofunc other = (Parametrofunc) object;
		if ((this.idparfunc == null && other.idparfunc != null)
				|| (this.idparfunc != null && !this.idparfunc.equals(other.idparfunc))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Parametrofunc[ idparfunc=" + idparfunc + " ]";
	}

}
