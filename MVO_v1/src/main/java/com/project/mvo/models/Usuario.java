package com.project.mvo.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author jcatangu
 */
@Entity
@Table(name = "USUARIO")
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;
	// @Max(value=?) @Min(value=?)//if you know range of your decimal fields
	// consider using these annotations to enforce field validation
	@Id
	@Basic(optional = false)
	@NotNull
	@Column(name = "IDUSUARIO")
	private BigDecimal idusuario;

	@Basic(optional = false)
	@NotNull
	@Size(min = 1, max = 50)
	@Column(name = "IDCONTRATISTAOFUNCIONARIO")
	private String idcontratistaofuncionario;

	@Column(name = "TIPOVINCULACION")
	private BigInteger tipovinculacion;

	@Column(name = "CREADOPOR")
	private BigInteger creadopor;

	@Column(name = "FECHACREADO")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechacreado;

	@Column(name = "ACTUALIZADOPOR")
	private BigInteger actualizadopor;

	@Column(name = "FECHAACTUALIZADO")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaactualizado;

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "usuarioIdusuario")
	private Centrofor centrofor;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "usuario")
	private Collection<Rolusuario> rolusuarioCollection;

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "usuarioIdusuario")
	private Funcionario funcionario;

	@JoinColumns({ @JoinColumn(name = "CONTRATISTA_IDCONTRATISTA", referencedColumnName = "IDCONTRATISTA"),
			@JoinColumn(name = "CONTRATISTA_IDTIPODOC", referencedColumnName = "TIPODOC_IDTIPODOC") })
	@OneToOne(optional = false)
	private Contratista contratista;

	public Usuario() {
	}

	public Usuario(BigDecimal idusuario) {
		this.idusuario = idusuario;
	}

	public Usuario(BigDecimal idusuario, String idcontratistaofuncionario) {
		this.idusuario = idusuario;
		this.idcontratistaofuncionario = idcontratistaofuncionario;
	}

	public BigDecimal getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(BigDecimal idusuario) {
		this.idusuario = idusuario;
	}

	public String getIdcontratistaofuncionario() {
		return idcontratistaofuncionario;
	}

	public void setIdcontratistaofuncionario(String idcontratistaofuncionario) {
		this.idcontratistaofuncionario = idcontratistaofuncionario;
	}

	public BigInteger getTipovinculacion() {
		return tipovinculacion;
	}

	public void setTipovinculacion(BigInteger tipovinculacion) {
		this.tipovinculacion = tipovinculacion;
	}

	public BigInteger getCreadopor() {
		return creadopor;
	}

	public void setCreadopor(BigInteger creadopor) {
		this.creadopor = creadopor;
	}

	public Date getFechacreado() {
		return fechacreado;
	}

	public void setFechacreado(Date fechacreado) {
		this.fechacreado = fechacreado;
	}

	public BigInteger getActualizadopor() {
		return actualizadopor;
	}

	public void setActualizadopor(BigInteger actualizadopor) {
		this.actualizadopor = actualizadopor;
	}

	public Date getFechaactualizado() {
		return fechaactualizado;
	}

	public void setFechaactualizado(Date fechaactualizado) {
		this.fechaactualizado = fechaactualizado;
	}

	public Centrofor getCentrofor() {
		return centrofor;
	}

	public void setCentrofor(Centrofor centrofor) {
		this.centrofor = centrofor;
	}

	public Collection<Rolusuario> getRolusuarioCollection() {
		return rolusuarioCollection;
	}

	public void setRolusuarioCollection(Collection<Rolusuario> rolusuarioCollection) {
		this.rolusuarioCollection = rolusuarioCollection;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Contratista getContratista() {
		return contratista;
	}

	public void setContratista(Contratista contratista) {
		this.contratista = contratista;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idusuario != null ? idusuario.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Usuario)) {
			return false;
		}
		Usuario other = (Usuario) object;
		if ((this.idusuario == null && other.idusuario != null)
				|| (this.idusuario != null && !this.idusuario.equals(other.idusuario))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Usuario[ idusuario=" + idusuario + " ]";
	}

}
