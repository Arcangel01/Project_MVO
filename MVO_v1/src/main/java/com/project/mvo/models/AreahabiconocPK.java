package com.project.mvo.models;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author jcatangu
 */
@Embeddable
public class AreahabiconocPK implements Serializable {

	@Basic(optional = false)
	@NotNull
	@Column(name = "ITEM_IDITEM")
	private BigInteger itemIditem;

	@Basic(optional = false)
	@NotNull
	@Column(name = "ITEM_IDTIPOP")
	private BigInteger itemIdtipop;

	@Basic(optional = false)
	@NotNull
	@Column(name = "PARAMETROFUNC_IDPARFUNC")
	private BigInteger parametrofuncIdparfunc;

	public AreahabiconocPK() {
	}

	public AreahabiconocPK(BigInteger itemIditem, BigInteger itemIdtipop, BigInteger parametrofuncIdparfunc) {
		this.itemIditem = itemIditem;
		this.itemIdtipop = itemIdtipop;
		this.parametrofuncIdparfunc = parametrofuncIdparfunc;
	}

	public BigInteger getItemIditem() {
		return itemIditem;
	}

	public void setItemIditem(BigInteger itemIditem) {
		this.itemIditem = itemIditem;
	}

	public BigInteger getItemIdtipop() {
		return itemIdtipop;
	}

	public void setItemIdtipop(BigInteger itemIdtipop) {
		this.itemIdtipop = itemIdtipop;
	}

	public BigInteger getParametrofuncIdparfunc() {
		return parametrofuncIdparfunc;
	}

	public void setParametrofuncIdparfunc(BigInteger parametrofuncIdparfunc) {
		this.parametrofuncIdparfunc = parametrofuncIdparfunc;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (itemIditem != null ? itemIditem.hashCode() : 0);
		hash += (itemIdtipop != null ? itemIdtipop.hashCode() : 0);
		hash += (parametrofuncIdparfunc != null ? parametrofuncIdparfunc.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof AreahabiconocPK)) {
			return false;
		}
		AreahabiconocPK other = (AreahabiconocPK) object;
		if ((this.itemIditem == null && other.itemIditem != null)
				|| (this.itemIditem != null && !this.itemIditem.equals(other.itemIditem))) {
			return false;
		}
		if ((this.itemIdtipop == null && other.itemIdtipop != null)
				|| (this.itemIdtipop != null && !this.itemIdtipop.equals(other.itemIdtipop))) {
			return false;
		}
		if ((this.parametrofuncIdparfunc == null && other.parametrofuncIdparfunc != null)
				|| (this.parametrofuncIdparfunc != null
						&& !this.parametrofuncIdparfunc.equals(other.parametrofuncIdparfunc))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "AreahabiconocPK[ itemIditem=" + itemIditem + ", itemIdtipop=" + itemIdtipop
				+ ", parametrofuncIdparfunc=" + parametrofuncIdparfunc + " ]";
	}

}
