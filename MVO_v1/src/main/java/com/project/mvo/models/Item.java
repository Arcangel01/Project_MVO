package com.project.mvo.models;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

/**
 *
 * @author jcatangu
 */
@Entity
@Table(name = "ITEM")
public class Item implements Serializable {

	private static final long serialVersionUID = 1L;
	@EmbeddedId
	protected ItemPK itemPK;

	@Column(name = "TIEMPOESTIMADO")
	private BigInteger tiempoestimado;

	@Size(max = 500)
	@Column(name = "CITA")
	private String cita;

	@Lob
	@Column(name = "ENUNCIADO")
	private String enunciado;

	@Size(max = 100)
	@Column(name = "GRADO")
	private String grado;

	@Size(max = 500)
	@Column(name = "BIBLIOGRAFIA")
	private String bibliografia;

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

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "item")
	private Collection<Areahabiconoc> areahabiconocCollection;

	@JoinColumn(name = "CONFIGTIPOPRU_IDCONFTIPPRU", referencedColumnName = "IDCONFTIPPRU")
	@ManyToOne(optional = false)
	private Configtipopru configtipopruIdconftippru;

	@JoinColumn(name = "TIPOPREG_IDTIPOP", referencedColumnName = "IDTIPOP", insertable = false, updatable = false)
	@ManyToOne(optional = false)
	private Tipopreg tipopreg;

	public Item() {
	}

	public Item(ItemPK itemPK) {
		this.itemPK = itemPK;
	}

	public Item(BigInteger iditem, BigInteger tipopregIdtipop) {
		this.itemPK = new ItemPK(iditem, tipopregIdtipop);
	}

	public ItemPK getItemPK() {
		return itemPK;
	}

	public void setItemPK(ItemPK itemPK) {
		this.itemPK = itemPK;
	}

	public BigInteger getTiempoestimado() {
		return tiempoestimado;
	}

	public void setTiempoestimado(BigInteger tiempoestimado) {
		this.tiempoestimado = tiempoestimado;
	}

	public String getCita() {
		return cita;
	}

	public void setCita(String cita) {
		this.cita = cita;
	}

	public String getEnunciado() {
		return enunciado;
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}

	public String getGrado() {
		return grado;
	}

	public void setGrado(String grado) {
		this.grado = grado;
	}

	public String getBibliografia() {
		return bibliografia;
	}

	public void setBibliografia(String bibliografia) {
		this.bibliografia = bibliografia;
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

	public Collection<Areahabiconoc> getAreahabiconocCollection() {
		return areahabiconocCollection;
	}

	public void setAreahabiconocCollection(Collection<Areahabiconoc> areahabiconocCollection) {
		this.areahabiconocCollection = areahabiconocCollection;
	}

	public Configtipopru getConfigtipopruIdconftippru() {
		return configtipopruIdconftippru;
	}

	public void setConfigtipopruIdconftippru(Configtipopru configtipopruIdconftippru) {
		this.configtipopruIdconftippru = configtipopruIdconftippru;
	}

	public Tipopreg getTipopreg() {
		return tipopreg;
	}

	public void setTipopreg(Tipopreg tipopreg) {
		this.tipopreg = tipopreg;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (itemPK != null ? itemPK.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Item)) {
			return false;
		}
		Item other = (Item) object;
		if ((this.itemPK == null && other.itemPK != null)
				|| (this.itemPK != null && !this.itemPK.equals(other.itemPK))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Item[ itemPK=" + itemPK + " ]";
	}

}
