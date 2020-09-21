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
public class ListaPK implements Serializable {

	@Basic(optional = false)
	@NotNull
	@Column(name = "IDLISTA")
	private BigInteger idlista;

	@Basic(optional = false)
	@NotNull
	@Column(name = "PARAMETROFUNC_IDPARFUNC")
	private BigInteger parametrofuncIdparfunc;

	public ListaPK() {
	}

	public ListaPK(BigInteger idlista, BigInteger parametrofuncIdparfunc) {
		this.idlista = idlista;
		this.parametrofuncIdparfunc = parametrofuncIdparfunc;
	}

	public BigInteger getIdlista() {
		return idlista;
	}

	public void setIdlista(BigInteger idlista) {
		this.idlista = idlista;
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
		hash += (idlista != null ? idlista.hashCode() : 0);
		hash += (parametrofuncIdparfunc != null ? parametrofuncIdparfunc.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof ListaPK)) {
			return false;
		}
		ListaPK other = (ListaPK) object;
		if ((this.idlista == null && other.idlista != null)
				|| (this.idlista != null && !this.idlista.equals(other.idlista))) {
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
		return "ListaPK[ idlista=" + idlista + ", parametrofuncIdparfunc=" + parametrofuncIdparfunc + " ]";
	}

}
