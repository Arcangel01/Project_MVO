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
import javax.persistence.ManyToOne;
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
@Table(name = "CANDIDATO")
public class Candidato implements Serializable {

	private static final long serialVersionUID = 1L;
	// @Max(value=?) @Min(value=?)//if you know range of your decimal fields
	// consider using these annotations to enforce field validation
	@Id
	@Basic(optional = false)
	@NotNull
	@Column(name = "IDCANDIDATO")
	private BigDecimal idcandidato;

	@Size(max = 100)
	@Column(name = "NOMBRE_CANDIDATO")
	private String nombreCandidato;

	@Size(max = 100)
	@Column(name = "APELLIDO_CANDIDATO")
	private String apellidoCandidato;

	@Size(max = 50)
	@Column(name = "NUMERODOCUMENTO")
	private String numerodocumento;

	@Size(max = 20)
	@Column(name = "TELEFONO")
	private String telefono;

	@Size(max = 100)
	@Column(name = "CORREOELECTRONICO")
	private String correoelectronico;

	@JoinColumn(name = "MUNICIPIO_IDMPIO", referencedColumnName = "IDMPIO")
	@OneToOne(optional = false)
	private Municipio municipioIdmpio;

	@JoinColumn(name = "TIPODOC_IDTIPODOC", referencedColumnName = "IDTIPODOC")
	@ManyToOne(optional = false)
	private Tipodoc tipodocIdtipodoc;

	@JoinColumn(name = "TIPOPOBLACION_IDTIPOPOB", referencedColumnName = "IDTIPOPOB")
	@OneToOne(optional = false)
	private Tipopoblacion tipopoblacionIdtipopob;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "candidatoIdcandidato")
	private Collection<Pruebapres> pruebapresCollection;

	public Candidato() {
	}

	public Candidato(BigDecimal idcandidato) {
		this.idcandidato = idcandidato;
	}

	public BigDecimal getIdcandidato() {
		return idcandidato;
	}

	public void setIdcandidato(BigDecimal idcandidato) {
		this.idcandidato = idcandidato;
	}

	public String getNombreCandidato() {
		return nombreCandidato;
	}

	public void setNombreCandidato(String nombreCandidato) {
		this.nombreCandidato = nombreCandidato;
	}

	public String getApellidoCandidato() {
		return apellidoCandidato;
	}

	public void setApellidoCandidato(String apellidoCandidato) {
		this.apellidoCandidato = apellidoCandidato;
	}

	public String getNumerodocumento() {
		return numerodocumento;
	}

	public void setNumerodocumento(String numerodocumento) {
		this.numerodocumento = numerodocumento;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreoelectronico() {
		return correoelectronico;
	}

	public void setCorreoelectronico(String correoelectronico) {
		this.correoelectronico = correoelectronico;
	}

	public Municipio getMunicipioIdmpio() {
		return municipioIdmpio;
	}

	public void setMunicipioIdmpio(Municipio municipioIdmpio) {
		this.municipioIdmpio = municipioIdmpio;
	}

	public Tipodoc getTipodocIdtipodoc() {
		return tipodocIdtipodoc;
	}

	public void setTipodocIdtipodoc(Tipodoc tipodocIdtipodoc) {
		this.tipodocIdtipodoc = tipodocIdtipodoc;
	}

	public Tipopoblacion getTipopoblacionIdtipopob() {
		return tipopoblacionIdtipopob;
	}

	public void setTipopoblacionIdtipopob(Tipopoblacion tipopoblacionIdtipopob) {
		this.tipopoblacionIdtipopob = tipopoblacionIdtipopob;
	}

	public Collection<Pruebapres> getPruebapresCollection() {
		return pruebapresCollection;
	}

	public void setPruebapresCollection(Collection<Pruebapres> pruebapresCollection) {
		this.pruebapresCollection = pruebapresCollection;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idcandidato != null ? idcandidato.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Candidato)) {
			return false;
		}
		Candidato other = (Candidato) object;
		if ((this.idcandidato == null && other.idcandidato != null)
				|| (this.idcandidato != null && !this.idcandidato.equals(other.idcandidato))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Candidato[ idcandidato=" + idcandidato + " ]";
	}

}