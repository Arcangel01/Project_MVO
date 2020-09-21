package com.project.mvo.models;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "CONTRATISTA")
public class Contratista implements Serializable {

	private static final long serialVersionUID = 1L;
	@EmbeddedId
	protected ContratistaPK contratistaPK;

	@Size(max = 100)
	@Column(name = "NOMBRECONTRATISTA")
	private String nombrecontratista;

	@Size(max = 100)
	@Column(name = "APELLIDOCONTRATISTA")
	private String apellidocontratista;

	@Basic(optional = false)
	@NotNull
	@Size(min = 1, max = 50)
	@Column(name = "NUMERODOCUMENTO")
	private String numerodocumento;

	@Column(name = "LUGAREXPEDOCCONTRAT")
	private BigInteger lugarexpedoccontrat;

	@Size(max = 100)
	@Column(name = "CORREOINSTITUCIONAL")
	private String correoinstitucional;

	@Size(max = 100)
	@Column(name = "CARGOCONTRATISTA")
	private String cargocontratista;

	@Size(max = 100)
	@Column(name = "NUMEROCONTRATO")
	private String numerocontrato;

	@Column(name = "FECHAINICIOCONTRATO")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechainiciocontrato;

	@Column(name = "FECHAFINCONTRATO")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechafincontrato;

	@JoinColumn(name = "MUNICIPIO_IDMPIO", referencedColumnName = "IDMPIO")
	@OneToOne(optional = false)
	private Municipio municipioIdmpio;

	@JoinColumn(name = "TIPODOC_IDTIPODOC", referencedColumnName = "IDTIPODOC", insertable = false, updatable = false)
	@ManyToOne(optional = false)
	private Tipodoc tipodoc;

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "contratista")
	private Estado estado;

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "contratista")
	private Usuario usuario;

	public Contratista() {
	}

	public Contratista(ContratistaPK contratistaPK) {
		this.contratistaPK = contratistaPK;
	}

	public Contratista(ContratistaPK contratistaPK, String numerodocumento) {
		this.contratistaPK = contratistaPK;
		this.numerodocumento = numerodocumento;
	}

	public Contratista(BigInteger idcontratista, BigInteger tipodocIdtipodoc) {
		this.contratistaPK = new ContratistaPK(idcontratista, tipodocIdtipodoc);
	}

	public ContratistaPK getContratistaPK() {
		return contratistaPK;
	}

	public void setContratistaPK(ContratistaPK contratistaPK) {
		this.contratistaPK = contratistaPK;
	}

	public String getNombrecontratista() {
		return nombrecontratista;
	}

	public void setNombrecontratista(String nombrecontratista) {
		this.nombrecontratista = nombrecontratista;
	}

	public String getApellidocontratista() {
		return apellidocontratista;
	}

	public void setApellidocontratista(String apellidocontratista) {
		this.apellidocontratista = apellidocontratista;
	}

	public String getNumerodocumento() {
		return numerodocumento;
	}

	public void setNumerodocumento(String numerodocumento) {
		this.numerodocumento = numerodocumento;
	}

	public BigInteger getLugarexpedoccontrat() {
		return lugarexpedoccontrat;
	}

	public void setLugarexpedoccontrat(BigInteger lugarexpedoccontrat) {
		this.lugarexpedoccontrat = lugarexpedoccontrat;
	}

	public String getCorreoinstitucional() {
		return correoinstitucional;
	}

	public void setCorreoinstitucional(String correoinstitucional) {
		this.correoinstitucional = correoinstitucional;
	}

	public String getCargocontratista() {
		return cargocontratista;
	}

	public void setCargocontratista(String cargocontratista) {
		this.cargocontratista = cargocontratista;
	}

	public String getNumerocontrato() {
		return numerocontrato;
	}

	public void setNumerocontrato(String numerocontrato) {
		this.numerocontrato = numerocontrato;
	}

	public Date getFechainiciocontrato() {
		return fechainiciocontrato;
	}

	public void setFechainiciocontrato(Date fechainiciocontrato) {
		this.fechainiciocontrato = fechainiciocontrato;
	}

	public Date getFechafincontrato() {
		return fechafincontrato;
	}

	public void setFechafincontrato(Date fechafincontrato) {
		this.fechafincontrato = fechafincontrato;
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

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
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
		hash += (contratistaPK != null ? contratistaPK.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Contratista)) {
			return false;
		}
		Contratista other = (Contratista) object;
		if ((this.contratistaPK == null && other.contratistaPK != null)
				|| (this.contratistaPK != null && !this.contratistaPK.equals(other.contratistaPK))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Contratista[ contratistaPK=" + contratistaPK + " ]";
	}

}
