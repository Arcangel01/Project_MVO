package com.project.mvo.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author jcatangu
 */
@Entity
@Table(name = "TIPODOC")
public class Tipodoc implements Serializable {

	private static final long serialVersionUID = 1L;
	// @Max(value=?) @Min(value=?)//if you know range of your decimal fields
	// consider using these annotations to enforce field validation
	@Id
	@Basic(optional = false)
	@NotNull
	@Column(name = "IDTIPODOC")
	private BigDecimal idtipodoc;
	
	@Size(max = 100)
	@Column(name = "TIPODOCUMENTO")
	private String tipodocumento;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "tipodocIdtipodoc")
	private Collection<Candidato> candidatoCollection;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "tipodoc")
	private Collection<Contratista> contratistaCollection;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "tipodoc")
	private Collection<Funcionario> funcionarioCollection;

	public Tipodoc() {
	}

	public Tipodoc(BigDecimal idtipodoc) {
		this.idtipodoc = idtipodoc;
	}

	public BigDecimal getIdtipodoc() {
		return idtipodoc;
	}

	public void setIdtipodoc(BigDecimal idtipodoc) {
		this.idtipodoc = idtipodoc;
	}

	public String getTipodocumento() {
		return tipodocumento;
	}

	public void setTipodocumento(String tipodocumento) {
		this.tipodocumento = tipodocumento;
	}

	public Collection<Candidato> getCandidatoCollection() {
		return candidatoCollection;
	}

	public void setCandidatoCollection(Collection<Candidato> candidatoCollection) {
		this.candidatoCollection = candidatoCollection;
	}

	public Collection<Contratista> getContratistaCollection() {
		return contratistaCollection;
	}

	public void setContratistaCollection(Collection<Contratista> contratistaCollection) {
		this.contratistaCollection = contratistaCollection;
	}

	public Collection<Funcionario> getFuncionarioCollection() {
		return funcionarioCollection;
	}

	public void setFuncionarioCollection(Collection<Funcionario> funcionarioCollection) {
		this.funcionarioCollection = funcionarioCollection;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idtipodoc != null ? idtipodoc.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Tipodoc)) {
			return false;
		}
		Tipodoc other = (Tipodoc) object;
		if ((this.idtipodoc == null && other.idtipodoc != null)
				|| (this.idtipodoc != null && !this.idtipodoc.equals(other.idtipodoc))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Tipodoc[ idtipodoc=" + idtipodoc + " ]";
	}

}
