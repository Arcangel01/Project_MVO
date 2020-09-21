package com.project.mvo.models;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author jcatangu
 */
@Entity
@Table(name = "AREAVOCACION")
public class Areavocacion implements Serializable {

	private static final long serialVersionUID = 1L;
	// @Max(value=?) @Min(value=?)//if you know range of your decimal fields
	// consider using these annotations to enforce field validation
	@Id
	@Basic(optional = false)
	@NotNull
	@Column(name = "IDAREAVOCACION")
	private BigDecimal idareavocacion;

	@Size(max = 100)
	@Column(name = "NOMBREAREA")
	private String nombrearea;

	@Lob
	@Column(name = "DESCRIPCIONAREA")
	private String descripcionarea;

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "areavocacionIdareavocacion")
	private Programaf programaf;

	public Areavocacion() {
	}

	public Areavocacion(BigDecimal idareavocacion) {
		this.idareavocacion = idareavocacion;
	}

	public BigDecimal getIdareavocacion() {
		return idareavocacion;
	}

	public void setIdareavocacion(BigDecimal idareavocacion) {
		this.idareavocacion = idareavocacion;
	}

	public String getNombrearea() {
		return nombrearea;
	}

	public void setNombrearea(String nombrearea) {
		this.nombrearea = nombrearea;
	}

	public String getDescripcionarea() {
		return descripcionarea;
	}

	public void setDescripcionarea(String descripcionarea) {
		this.descripcionarea = descripcionarea;
	}

	public Programaf getProgramaf() {
		return programaf;
	}

	public void setProgramaf(Programaf programaf) {
		this.programaf = programaf;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idareavocacion != null ? idareavocacion.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Areavocacion)) {
			return false;
		}
		Areavocacion other = (Areavocacion) object;
		if ((this.idareavocacion == null && other.idareavocacion != null)
				|| (this.idareavocacion != null && !this.idareavocacion.equals(other.idareavocacion))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Areavocacion[ idareavocacion=" + idareavocacion + " ]";
	}

}
