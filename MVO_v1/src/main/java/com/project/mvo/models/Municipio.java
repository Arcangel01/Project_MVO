package com.project.mvo.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author jcatangu
 */
@Entity
@Table(name = "MUNICIPIO")
public class Municipio implements Serializable {

	private static final long serialVersionUID = 1L;
	// @Max(value=?) @Min(value=?)//if you know range of your decimal fields
	// consider using these annotations to enforce field validation
	@Id
	@Basic(optional = false)
	@NotNull
	@Column(name = "IDMPIO")
	private BigDecimal idmpio;

	@Size(max = 200)
	@Column(name = "NOMBREMUNICIPIO")
	private String nombremunicipio;

	@Size(max = 20)
	@Column(name = "CODIGODANE")
	private String codigodane;

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "municipioIdmpio")
	private Candidato candidato;

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "municipioIdmpio")
	private Contratista contratista;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "municipio")
	private Collection<Departamento> departamentoCollection;

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "municipioIdmpio")
	private Funcionario funcionario;

	@JoinColumn(name = "PARAMETROFUNC_IDPARFUNC", referencedColumnName = "IDPARFUNC")
	@OneToOne(optional = false)
	private Parametrofunc parametrofuncIdparfunc;

	public Municipio() {
	}

	public Municipio(BigDecimal idmpio) {
		this.idmpio = idmpio;
	}

	public BigDecimal getIdmpio() {
		return idmpio;
	}

	public void setIdmpio(BigDecimal idmpio) {
		this.idmpio = idmpio;
	}

	public String getNombremunicipio() {
		return nombremunicipio;
	}

	public void setNombremunicipio(String nombremunicipio) {
		this.nombremunicipio = nombremunicipio;
	}

	public String getCodigodane() {
		return codigodane;
	}

	public void setCodigodane(String codigodane) {
		this.codigodane = codigodane;
	}

	public Candidato getCandidato() {
		return candidato;
	}

	public void setCandidato(Candidato candidato) {
		this.candidato = candidato;
	}

	public Contratista getContratista() {
		return contratista;
	}

	public void setContratista(Contratista contratista) {
		this.contratista = contratista;
	}

	public Collection<Departamento> getDepartamentoCollection() {
		return departamentoCollection;
	}

	public void setDepartamentoCollection(Collection<Departamento> departamentoCollection) {
		this.departamentoCollection = departamentoCollection;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Parametrofunc getParametrofuncIdparfunc() {
		return parametrofuncIdparfunc;
	}

	public void setParametrofuncIdparfunc(Parametrofunc parametrofuncIdparfunc) {
		this.parametrofuncIdparfunc = parametrofuncIdparfunc;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idmpio != null ? idmpio.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Municipio)) {
			return false;
		}
		Municipio other = (Municipio) object;
		if ((this.idmpio == null && other.idmpio != null)
				|| (this.idmpio != null && !this.idmpio.equals(other.idmpio))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Municipio[ idmpio=" + idmpio + " ]";
	}

}
