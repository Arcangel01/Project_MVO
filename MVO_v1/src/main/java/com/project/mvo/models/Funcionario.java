package com.project.mvo.models;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author jcatangu
 */
@Entity
@Table(name = "FUNCIONARIO")
public class Funcionario implements Serializable {

	private static final long serialVersionUID = 1L;
	@EmbeddedId
	protected FuncionarioPK funcionarioPK;

	@Size(max = 200)
	@Column(name = "NOMBREFUNC")
	private String nombrefunc;

	@Size(max = 200)
	@Column(name = "APELIIDOFUNC")
	private String apeliidofunc;

	@Size(max = 50)
	@Column(name = "NUMERODOCUMENTO")
	private String numerodocumento;

	@Column(name = "LUGAREXPEDICION")
	private BigInteger lugarexpedicion;

	@Size(max = 100)
	@Column(name = "CORREOINSTITUCIONAL")
	private String correoinstitucional;

	@Size(max = 100)
	@Column(name = "CARGOFUNCIONARIO")
	private String cargofuncionario;

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "funcionario")
	private Estado estado;

	@JoinColumn(name = "MUNICIPIO_IDMPIO", referencedColumnName = "IDMPIO")
	@OneToOne(optional = false)
	private Municipio municipioIdmpio;

	@JoinColumn(name = "TIPODOC_IDTIPODOC", referencedColumnName = "IDTIPODOC", insertable = false, updatable = false)
	@ManyToOne(optional = false)
	private Tipodoc tipodoc;

	@JoinColumn(name = "USUARIO_IDUSUARIO", referencedColumnName = "IDUSUARIO")
	@OneToOne(optional = false)
	private Usuario usuarioIdusuario;

	public Funcionario() {
	}

	public Funcionario(FuncionarioPK funcionarioPK) {
		this.funcionarioPK = funcionarioPK;
	}

	public Funcionario(BigInteger idfunc, BigInteger tipodocIdtipodoc) {
		this.funcionarioPK = new FuncionarioPK(idfunc, tipodocIdtipodoc);
	}

	public FuncionarioPK getFuncionarioPK() {
		return funcionarioPK;
	}

	public void setFuncionarioPK(FuncionarioPK funcionarioPK) {
		this.funcionarioPK = funcionarioPK;
	}

	public String getNombrefunc() {
		return nombrefunc;
	}

	public void setNombrefunc(String nombrefunc) {
		this.nombrefunc = nombrefunc;
	}

	public String getApeliidofunc() {
		return apeliidofunc;
	}

	public void setApeliidofunc(String apeliidofunc) {
		this.apeliidofunc = apeliidofunc;
	}

	public String getNumerodocumento() {
		return numerodocumento;
	}

	public void setNumerodocumento(String numerodocumento) {
		this.numerodocumento = numerodocumento;
	}

	public BigInteger getLugarexpedicion() {
		return lugarexpedicion;
	}

	public void setLugarexpedicion(BigInteger lugarexpedicion) {
		this.lugarexpedicion = lugarexpedicion;
	}

	public String getCorreoinstitucional() {
		return correoinstitucional;
	}

	public void setCorreoinstitucional(String correoinstitucional) {
		this.correoinstitucional = correoinstitucional;
	}

	public String getCargofuncionario() {
		return cargofuncionario;
	}

	public void setCargofuncionario(String cargofuncionario) {
		this.cargofuncionario = cargofuncionario;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Municipio getMunicipioIdmpio() {
		return municipioIdmpio;
	}

	public void setMunicipioIdmpio(Municipio municipioIdmpio) {
		this.municipioIdmpio = municipioIdmpio;
	}

	public Tipodoc getTipodoc() {
		return tipodoc;
	}

	public void setTipodoc(Tipodoc tipodoc) {
		this.tipodoc = tipodoc;
	}

	public Usuario getUsuarioIdusuario() {
		return usuarioIdusuario;
	}

	public void setUsuarioIdusuario(Usuario usuarioIdusuario) {
		this.usuarioIdusuario = usuarioIdusuario;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (funcionarioPK != null ? funcionarioPK.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Funcionario)) {
			return false;
		}
		Funcionario other = (Funcionario) object;
		if ((this.funcionarioPK == null && other.funcionarioPK != null)
				|| (this.funcionarioPK != null && !this.funcionarioPK.equals(other.funcionarioPK))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Funcionario[ funcionarioPK=" + funcionarioPK + " ]";
	}

}
