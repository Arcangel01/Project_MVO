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
public class FuncionarioPK implements Serializable {

	@Basic(optional = false)
	@NotNull
	@Column(name = "IDFUNC")
	private BigInteger idfunc;

	@Basic(optional = false)
	@NotNull
	@Column(name = "TIPODOC_IDTIPODOC")
	private BigInteger tipodocIdtipodoc;

	public FuncionarioPK() {
	}

	public FuncionarioPK(BigInteger idfunc, BigInteger tipodocIdtipodoc) {
		this.idfunc = idfunc;
		this.tipodocIdtipodoc = tipodocIdtipodoc;
	}

	public BigInteger getIdfunc() {
		return idfunc;
	}

	public void setIdfunc(BigInteger idfunc) {
		this.idfunc = idfunc;
	}

	public BigInteger getTipodocIdtipodoc() {
		return tipodocIdtipodoc;
	}

	public void setTipodocIdtipodoc(BigInteger tipodocIdtipodoc) {
		this.tipodocIdtipodoc = tipodocIdtipodoc;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idfunc != null ? idfunc.hashCode() : 0);
		hash += (tipodocIdtipodoc != null ? tipodocIdtipodoc.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof FuncionarioPK)) {
			return false;
		}
		FuncionarioPK other = (FuncionarioPK) object;
		if ((this.idfunc == null && other.idfunc != null)
				|| (this.idfunc != null && !this.idfunc.equals(other.idfunc))) {
			return false;
		}
		if ((this.tipodocIdtipodoc == null && other.tipodocIdtipodoc != null)
				|| (this.tipodocIdtipodoc != null && !this.tipodocIdtipodoc.equals(other.tipodocIdtipodoc))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "FuncionarioPK[ idfunc=" + idfunc + ", tipodocIdtipodoc=" + tipodocIdtipodoc + " ]";
	}

}
