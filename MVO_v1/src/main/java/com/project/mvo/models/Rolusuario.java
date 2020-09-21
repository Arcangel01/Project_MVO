package com.project.mvo.models;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author jcatangu
 */
@Entity
@Table(name = "ROLUSUARIO")
public class Rolusuario implements Serializable {

	private static final long serialVersionUID = 1L;
	@EmbeddedId
	protected RolusuarioPK rolusuarioPK;
	
	@JoinColumn(name = "USUARIO_IDUSUARIO", referencedColumnName = "IDUSUARIO", insertable = false, updatable = false)
	@ManyToOne(optional = false)
	private Usuario usuario;

	public Rolusuario() {
	}

	public Rolusuario(RolusuarioPK rolusuarioPK) {
		this.rolusuarioPK = rolusuarioPK;
	}

	public Rolusuario(BigInteger usuarioIdusuario, BigInteger rolIdrol) {
		this.rolusuarioPK = new RolusuarioPK(usuarioIdusuario, rolIdrol);
	}

	public RolusuarioPK getRolusuarioPK() {
		return rolusuarioPK;
	}

	public void setRolusuarioPK(RolusuarioPK rolusuarioPK) {
		this.rolusuarioPK = rolusuarioPK;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (rolusuarioPK != null ? rolusuarioPK.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Rolusuario)) {
			return false;
		}
		Rolusuario other = (Rolusuario) object;
		if ((this.rolusuarioPK == null && other.rolusuarioPK != null)
				|| (this.rolusuarioPK != null && !this.rolusuarioPK.equals(other.rolusuarioPK))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Rolusuario[ rolusuarioPK=" + rolusuarioPK + " ]";
	}

}
