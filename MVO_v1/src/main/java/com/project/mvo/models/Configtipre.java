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
import javax.persistence.Lob;
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
@Table(name = "CONFIGTIPRE")
public class Configtipre implements Serializable {

	private static final long serialVersionUID = 1L;
	// @Max(value=?) @Min(value=?)//if you know range of your decimal fields
	// consider using these annotations to enforce field validation
	@Id
	@Basic(optional = false)
	@NotNull
	@Column(name = "IDCONFTIPOP")
	private BigDecimal idconftipop;
	
	@Size(max = 100)
	@Column(name = "NOMBRECONF")
	private String nombreconf;
	
	@Lob
	@Column(name = "DESCRIPCION")
	private String descripcion;
	
	@JoinColumn(name = "ESTADO_IDESTADO", referencedColumnName = "IDESTADO")
	@OneToOne(optional = false)
	private Estado estadoIdestado;
	
	@JoinColumn(name = "TIPOPREG_IDTIPOP", referencedColumnName = "IDTIPOP")
	@ManyToOne(optional = false)
	private Tipopreg tipopregIdtipop;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "configtipreIdconftipop")
	private Collection<Alternaconfpre> alternaconfpreCollection;

	public Configtipre() {
	}

	public Configtipre(BigDecimal idconftipop) {
		this.idconftipop = idconftipop;
	}

	public BigDecimal getIdconftipop() {
		return idconftipop;
	}

	public void setIdconftipop(BigDecimal idconftipop) {
		this.idconftipop = idconftipop;
	}

	public String getNombreconf() {
		return nombreconf;
	}

	public void setNombreconf(String nombreconf) {
		this.nombreconf = nombreconf;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Estado getEstadoIdestado() {
		return estadoIdestado;
	}

	public void setEstadoIdestado(Estado estadoIdestado) {
		this.estadoIdestado = estadoIdestado;
	}

	public Tipopreg getTipopregIdtipop() {
		return tipopregIdtipop;
	}

	public void setTipopregIdtipop(Tipopreg tipopregIdtipop) {
		this.tipopregIdtipop = tipopregIdtipop;
	}

	public Collection<Alternaconfpre> getAlternaconfpreCollection() {
		return alternaconfpreCollection;
	}

	public void setAlternaconfpreCollection(Collection<Alternaconfpre> alternaconfpreCollection) {
		this.alternaconfpreCollection = alternaconfpreCollection;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idconftipop != null ? idconftipop.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Configtipre)) {
			return false;
		}
		Configtipre other = (Configtipre) object;
		if ((this.idconftipop == null && other.idconftipop != null)
				|| (this.idconftipop != null && !this.idconftipop.equals(other.idconftipop))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Configtipre[ idconftipop=" + idconftipop + " ]";
	}

}
