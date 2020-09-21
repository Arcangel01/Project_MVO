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
public class ContratistaPK implements Serializable {

	@Basic(optional = false)
	@NotNull
	@Column(name = "IDCONTRATISTA")
	private BigInteger idcontratista;

	@Basic(optional = false)
	@NotNull
	@Column(name = "TIPODOC_IDTIPODOC")
	private BigInteger tipodocIdtipodoc;

	public ContratistaPK() {
	}

	public ContratistaPK(BigInteger idcontratista, BigInteger tipodocIdtipodoc) {
		this.idcontratista = idcontratista;
		this.tipodocIdtipodoc = tipodocIdtipodoc;
	}

	public BigInteger getIdcontratista() {
		return idcontratista;
	}

	public void setIdcontratista(BigInteger idcontratista) {
		this.idcontratista = idcontratista;
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
		hash += (idcontratista != null ? idcontratista.hashCode() : 0);
		hash += (tipodocIdtipodoc != null ? tipodocIdtipodoc.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof ContratistaPK)) {
			return false;
		}
		ContratistaPK other = (ContratistaPK) object;
		if ((this.idcontratista == null && other.idcontratista != null)
				|| (this.idcontratista != null && !this.idcontratista.equals(other.idcontratista))) {
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
		return "ContratistaPK[ idcontratista=" + idcontratista + ", tipodocIdtipodoc=" + tipodocIdtipodoc + " ]";
	}

}
