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
public class RolusuarioPK implements Serializable {

	@Basic(optional = false)
	@NotNull
	@Column(name = "USUARIO_IDUSUARIO")
	private BigInteger usuarioIdusuario;
	
	@Basic(optional = false)
	@NotNull
	@Column(name = "ROL_IDROL")
	private BigInteger rolIdrol;

	public RolusuarioPK() {
	}

	public RolusuarioPK(BigInteger usuarioIdusuario, BigInteger rolIdrol) {
		this.usuarioIdusuario = usuarioIdusuario;
		this.rolIdrol = rolIdrol;
	}

	public BigInteger getUsuarioIdusuario() {
		return usuarioIdusuario;
	}

	public void setUsuarioIdusuario(BigInteger usuarioIdusuario) {
		this.usuarioIdusuario = usuarioIdusuario;
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
		hash += (usuarioIdusuario != null ? usuarioIdusuario.hashCode() : 0);
		hash += (rolIdrol != null ? rolIdrol.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof RolusuarioPK)) {
			return false;
		}
		RolusuarioPK other = (RolusuarioPK) object;
		if ((this.usuarioIdusuario == null && other.usuarioIdusuario != null)
				|| (this.usuarioIdusuario != null && !this.usuarioIdusuario.equals(other.usuarioIdusuario))) {
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
		return "RolusuarioPK[ usuarioIdusuario=" + usuarioIdusuario + ", rolIdrol=" + rolIdrol + " ]";
	}

}
