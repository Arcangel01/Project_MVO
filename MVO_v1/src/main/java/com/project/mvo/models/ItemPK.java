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
public class ItemPK implements Serializable {

	@Basic(optional = false)
	@NotNull
	@Column(name = "IDITEM")
	private BigInteger iditem;

	@Basic(optional = false)
	@NotNull
	@Column(name = "TIPOPREG_IDTIPOP")
	private BigInteger tipopregIdtipop;

	public ItemPK() {
	}

	public ItemPK(BigInteger iditem, BigInteger tipopregIdtipop) {
		this.iditem = iditem;
		this.tipopregIdtipop = tipopregIdtipop;
	}

	public BigInteger getIditem() {
		return iditem;
	}

	public void setIditem(BigInteger iditem) {
		this.iditem = iditem;
	}

	public BigInteger getTipopregIdtipop() {
		return tipopregIdtipop;
	}

	public void setTipopregIdtipop(BigInteger tipopregIdtipop) {
		this.tipopregIdtipop = tipopregIdtipop;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (iditem != null ? iditem.hashCode() : 0);
		hash += (tipopregIdtipop != null ? tipopregIdtipop.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof ItemPK)) {
			return false;
		}
		ItemPK other = (ItemPK) object;
		if ((this.iditem == null && other.iditem != null)
				|| (this.iditem != null && !this.iditem.equals(other.iditem))) {
			return false;
		}
		if ((this.tipopregIdtipop == null && other.tipopregIdtipop != null)
				|| (this.tipopregIdtipop != null && !this.tipopregIdtipop.equals(other.tipopregIdtipop))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "ItemPK[ iditem=" + iditem + ", tipopregIdtipop=" + tipopregIdtipop + " ]";
	}

}
