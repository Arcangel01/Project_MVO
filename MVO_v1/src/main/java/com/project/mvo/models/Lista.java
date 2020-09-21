package com.project.mvo.models;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

/**
 *
 * @author jcatangu
 */
@Entity
@Table(name = "LISTA")
public class Lista implements Serializable {

	private static final long serialVersionUID = 1L;
	@EmbeddedId
	protected ListaPK listaPK;

	@Size(max = 100)
	@Column(name = "NOMBRELISTA")
	private String nombrelista;

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

	@JoinColumn(name = "PARAMETROFUNC_IDPARFUNC", referencedColumnName = "IDPARFUNC", insertable = false, updatable = false)
	@ManyToOne(optional = false)
	private Parametrofunc parametrofunc;

	public Lista() {
	}

	public Lista(ListaPK listaPK) {
		this.listaPK = listaPK;
	}

	public Lista(BigInteger idlista, BigInteger parametrofuncIdparfunc) {
		this.listaPK = new ListaPK(idlista, parametrofuncIdparfunc);
	}

	public ListaPK getListaPK() {
		return listaPK;
	}

	public void setListaPK(ListaPK listaPK) {
		this.listaPK = listaPK;
	}

	public String getNombrelista() {
		return nombrelista;
	}

	public void setNombrelista(String nombrelista) {
		this.nombrelista = nombrelista;
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

	public Parametrofunc getParametrofunc() {
		return parametrofunc;
	}

	public void setParametrofunc(Parametrofunc parametrofunc) {
		this.parametrofunc = parametrofunc;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (listaPK != null ? listaPK.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Lista)) {
			return false;
		}
		Lista other = (Lista) object;
		if ((this.listaPK == null && other.listaPK != null)
				|| (this.listaPK != null && !this.listaPK.equals(other.listaPK))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Lista[ listaPK=" + listaPK + " ]";
	}

}
