package com.project.mvo.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
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
@Table(name = "ESTADO")
public class Estado implements Serializable {

	private static final long serialVersionUID = 1L;
	// @Max(value=?) @Min(value=?)//if you know range of your decimal fields
	// consider using these annotations to enforce field validation
	@Id
	@Basic(optional = false)
	@NotNull
	@Column(name = "IDESTADO")
	private BigDecimal idestado;

	@Size(max = 100)
	@Column(name = "NOMBREESTADO")
	private String nombreestado;

	@Column(name = "CREADOPOR")
	private BigInteger creadopor;

	@Column(name = "FECHACREADO")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechacreado;

	@Column(name = "MODIFICADOPOR")
	private BigInteger modificadopor;

	@Column(name = "FECHAMODIFICADO")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechamodificado;

	@JoinColumns({ @JoinColumn(name = "CONTRATISTA_IDCONTRATISTA", referencedColumnName = "IDCONTRATISTA"),
			@JoinColumn(name = "CONTRATISTA_TIPODOC_IDTIPODOC", referencedColumnName = "TIPODOC_IDTIPODOC") })
	@OneToOne(optional = false)
	private Contratista contratista;

	@JoinColumns({ @JoinColumn(name = "FUNCIONARIO_IDFUNC", referencedColumnName = "IDFUNC"),
			@JoinColumn(name = "FUNCIONARIO_TIPODOC_IDTIPODOC", referencedColumnName = "TIPODOC_IDTIPODOC") })
	@OneToOne(optional = false)
	private Funcionario funcionario;

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "estadoIdestado")
	private Tipopreg tipopreg;

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "estadoIdestado")
	private Configtipre configtipre;

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "estadoIdestado")
	private Alternaconfpre alternaconfpre;

	public Estado() {
	}

	public Estado(BigDecimal idestado) {
		this.idestado = idestado;
	}

	public BigDecimal getIdestado() {
		return idestado;
	}

	public void setIdestado(BigDecimal idestado) {
		this.idestado = idestado;
	}

	public String getNombreestado() {
		return nombreestado;
	}

	public void setNombreestado(String nombreestado) {
		this.nombreestado = nombreestado;
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

	public BigInteger getModificadopor() {
		return modificadopor;
	}

	public void setModificadopor(BigInteger modificadopor) {
		this.modificadopor = modificadopor;
	}

	public Date getFechamodificado() {
		return fechamodificado;
	}

	public void setFechamodificado(Date fechamodificado) {
		this.fechamodificado = fechamodificado;
	}

	public Contratista getContratista() {
		return contratista;
	}

	public void setContratista(Contratista contratista) {
		this.contratista = contratista;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Tipopreg getTipopreg() {
		return tipopreg;
	}

	public void setTipopreg(Tipopreg tipopreg) {
		this.tipopreg = tipopreg;
	}

	public Configtipre getConfigtipre() {
		return configtipre;
	}

	public void setConfigtipre(Configtipre configtipre) {
		this.configtipre = configtipre;
	}

	public Alternaconfpre getAlternaconfpre() {
		return alternaconfpre;
	}

	public void setAlternaconfpre(Alternaconfpre alternaconfpre) {
		this.alternaconfpre = alternaconfpre;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idestado != null ? idestado.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Estado)) {
			return false;
		}
		Estado other = (Estado) object;
		if ((this.idestado == null && other.idestado != null)
				|| (this.idestado != null && !this.idestado.equals(other.idestado))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Estado[ idestado=" + idestado + " ]";
	}

}
