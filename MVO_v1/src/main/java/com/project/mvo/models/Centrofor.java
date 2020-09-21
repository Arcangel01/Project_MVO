package com.project.mvo.models;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author jcatangu
 */
@Entity
@Table(name = "CENTROFOR")
public class Centrofor implements Serializable {

	private static final long serialVersionUID = 1L;
	// @Max(value=?) @Min(value=?)//if you know range of your decimal fields
	// consider using these annotations to enforce field validation
	@Id
	@Basic(optional = false)
	@NotNull
	@Column(name = "IDCENTROFORMACION")
	private BigDecimal idcentroformacion;
	
	@Size(max = 50)
	@Column(name = "CODIGOCENTROFORMACION")
	private String codigocentroformacion;
	
	@Size(max = 200)
	@Column(name = "NOMBRECENTROFORMACION")
	private String nombrecentroformacion;
	
	@JoinColumn(name = "PARAMETROFUNC_IDPARFUNC", referencedColumnName = "IDPARFUNC")
	@OneToOne(optional = false)
	private Parametrofunc parametrofuncIdparfunc;
	
	@JoinColumn(name = "REGIONAL_IDREGIONAL", referencedColumnName = "IDREGIONAL")
	@ManyToOne(optional = false)
	private Regional regionalIdregional;
	
	@JoinColumn(name = "USUARIO_IDUSUARIO", referencedColumnName = "IDUSUARIO")
	@OneToOne(optional = false)
	private Usuario usuarioIdusuario;

	public Centrofor() {
	}

	public Centrofor(BigDecimal idcentroformacion) {
		this.idcentroformacion = idcentroformacion;
	}

	public BigDecimal getIdcentroformacion() {
		return idcentroformacion;
	}

	public void setIdcentroformacion(BigDecimal idcentroformacion) {
		this.idcentroformacion = idcentroformacion;
	}

	public String getCodigocentroformacion() {
		return codigocentroformacion;
	}

	public void setCodigocentroformacion(String codigocentroformacion) {
		this.codigocentroformacion = codigocentroformacion;
	}

	public String getNombrecentroformacion() {
		return nombrecentroformacion;
	}

	public void setNombrecentroformacion(String nombrecentroformacion) {
		this.nombrecentroformacion = nombrecentroformacion;
	}

	public Parametrofunc getParametrofuncIdparfunc() {
		return parametrofuncIdparfunc;
	}

	public void setParametrofuncIdparfunc(Parametrofunc parametrofuncIdparfunc) {
		this.parametrofuncIdparfunc = parametrofuncIdparfunc;
	}

	public Regional getRegionalIdregional() {
		return regionalIdregional;
	}

	public void setRegionalIdregional(Regional regionalIdregional) {
		this.regionalIdregional = regionalIdregional;
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
		hash += (idcentroformacion != null ? idcentroformacion.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Centrofor)) {
			return false;
		}
		Centrofor other = (Centrofor) object;
		if ((this.idcentroformacion == null && other.idcentroformacion != null)
				|| (this.idcentroformacion != null && !this.idcentroformacion.equals(other.idcentroformacion))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Centrofor[ idcentroformacion=" + idcentroformacion + " ]";
	}

}
