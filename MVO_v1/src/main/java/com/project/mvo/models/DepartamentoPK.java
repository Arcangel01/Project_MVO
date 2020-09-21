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
public class DepartamentoPK implements Serializable {

	@Basic(optional = false)
	@NotNull
	@Column(name = "IDDEPTO")
	private BigInteger iddepto;

	@Basic(optional = false)
	@NotNull
	@Column(name = "MUNICIPIO_IDMPIO")
	private BigInteger municipioIdmpio;

	public DepartamentoPK() {
	}

	public DepartamentoPK(BigInteger iddepto, BigInteger municipioIdmpio) {
		this.iddepto = iddepto;
		this.municipioIdmpio = municipioIdmpio;
	}

	public BigInteger getIddepto() {
		return iddepto;
	}

	public void setIddepto(BigInteger iddepto) {
		this.iddepto = iddepto;
	}

	public BigInteger getMunicipioIdmpio() {
		return municipioIdmpio;
	}

	public void setMunicipioIdmpio(BigInteger municipioIdmpio) {
		this.municipioIdmpio = municipioIdmpio;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (iddepto != null ? iddepto.hashCode() : 0);
		hash += (municipioIdmpio != null ? municipioIdmpio.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof DepartamentoPK)) {
			return false;
		}
		DepartamentoPK other = (DepartamentoPK) object;
		if ((this.iddepto == null && other.iddepto != null)
				|| (this.iddepto != null && !this.iddepto.equals(other.iddepto))) {
			return false;
		}
		if ((this.municipioIdmpio == null && other.municipioIdmpio != null)
				|| (this.municipioIdmpio != null && !this.municipioIdmpio.equals(other.municipioIdmpio))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "DepartamentoPK[ iddepto=" + iddepto + ", municipioIdmpio=" + municipioIdmpio + " ]";
	}

}
