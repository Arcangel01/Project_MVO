package com.project.mvo.models;

import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

import com.sun.istack.NotNull;

/**
 *
 * @author jcatangu
 */
@Embeddable
public class AccionesporrolPK implements Serializable {

	@Basic(optional = false)
	@NotNull
	@Column(name = "ACCIONPERMIT_IDACCION")
	private BigInteger accionpermitIdaccion;

	@Basic(optional = false)
	@NotNull
	@Column(name = "ROL_IDROL")
	private BigInteger rolIdrol;

	public AccionesporrolPK() {
	}

	public AccionesporrolPK(BigInteger accionpermitIdaccion, BigInteger rolIdrol) {
		this.accionpermitIdaccion = accionpermitIdaccion;
		this.rolIdrol = rolIdrol;
	}

	public BigInteger getAccionpermitIdaccion() {
		return accionpermitIdaccion;
	}

	public void setAccionpermitIdaccion(BigInteger accionpermitIdaccion) {
		this.accionpermitIdaccion = accionpermitIdaccion;
	}

	public BigInteger getRolIdrol() {
		return rolIdrol;
	}

	public void setRolIdrol(BigInteger rolIdrol) {
		this.rolIdrol = rolIdrol;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (accionpermitIdaccion != null ? accionpermitIdaccion.hashCode() : 0);
		hash += (rolIdrol != null ? rolIdrol.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof AccionesporrolPK)) {
			return false;
		}
		AccionesporrolPK other = (AccionesporrolPK) object;
		if ((this.accionpermitIdaccion == null && other.accionpermitIdaccion != null)
				|| (this.accionpermitIdaccion != null
						&& !this.accionpermitIdaccion.equals(other.accionpermitIdaccion))) {
			return false;
		}
		if ((this.rolIdrol == null && other.rolIdrol != null)
				|| (this.rolIdrol != null && !this.rolIdrol.equals(other.rolIdrol))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "AccionesporrolPK[ accionpermitIdaccion=" + accionpermitIdaccion + ", rolIdrol=" + rolIdrol + " ]";
	}

}
