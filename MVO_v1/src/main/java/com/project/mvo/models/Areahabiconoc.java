package com.project.mvo.models;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author jcatangu
 */
@Entity
@Table(name = "AREAHABICONOC")
public class Areahabiconoc implements Serializable {

	private static final long serialVersionUID = 1L;
	@EmbeddedId
	protected AreahabiconocPK areahabiconocPK;

	@Column(name = "IDRELACION")
	private BigInteger idrelacion;

	@Column(name = "IDPARAMETRO")
	private BigInteger idparametro;

	@Column(name = "IDITEM")
	private BigInteger iditem;

	@Size(max = 200)
	@Column(name = "AREACONOCIMIENTO")
	private String areaconocimiento;

	@Size(max = 200)
	@Column(name = "HABILIDADAMEDIR")
	private String habilidadamedir;

	@JoinColumns({
			@JoinColumn(name = "ITEM_IDITEM", referencedColumnName = "IDITEM", insertable = false, updatable = false),
			@JoinColumn(name = "ITEM_IDTIPOP", referencedColumnName = "TIPOPREG_IDTIPOP", insertable = false, updatable = false) })
	@ManyToOne(optional = false)
	private Item item;

	@JoinColumn(name = "PARAMETROFUNC_IDPARFUNC", referencedColumnName = "IDPARFUNC", insertable = false, updatable = false)
	@ManyToOne(optional = false)
	private Parametrofunc parametrofunc;

	public Areahabiconoc() {
	}

	public Areahabiconoc(AreahabiconocPK areahabiconocPK) {
		this.areahabiconocPK = areahabiconocPK;
	}

	public Areahabiconoc(BigInteger itemIditem, BigInteger itemIdtipop, BigInteger parametrofuncIdparfunc) {
		this.areahabiconocPK = new AreahabiconocPK(itemIditem, itemIdtipop, parametrofuncIdparfunc);
	}

	public AreahabiconocPK getAreahabiconocPK() {
		return areahabiconocPK;
	}

	public void setAreahabiconocPK(AreahabiconocPK areahabiconocPK) {
		this.areahabiconocPK = areahabiconocPK;
	}

	public BigInteger getIdrelacion() {
		return idrelacion;
	}

	public void setIdrelacion(BigInteger idrelacion) {
		this.idrelacion = idrelacion;
	}

	public BigInteger getIdparametro() {
		return idparametro;
	}

	public void setIdparametro(BigInteger idparametro) {
		this.idparametro = idparametro;
	}

	public BigInteger getIditem() {
		return iditem;
	}

	public void setIditem(BigInteger iditem) {
		this.iditem = iditem;
	}

	public String getAreaconocimiento() {
		return areaconocimiento;
	}

	public void setAreaconocimiento(String areaconocimiento) {
		this.areaconocimiento = areaconocimiento;
	}

	public String getHabilidadamedir() {
		return habilidadamedir;
	}

	public void setHabilidadamedir(String habilidadamedir) {
		this.habilidadamedir = habilidadamedir;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
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
		hash += (areahabiconocPK != null ? areahabiconocPK.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Areahabiconoc)) {
			return false;
		}
		Areahabiconoc other = (Areahabiconoc) object;
		if ((this.areahabiconocPK == null && other.areahabiconocPK != null)
				|| (this.areahabiconocPK != null && !this.areahabiconocPK.equals(other.areahabiconocPK))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Areahabiconoc[ areahabiconocPK=" + areahabiconocPK + " ]";
	}

}
