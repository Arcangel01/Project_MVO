package com.project.mvo.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 *
 * @author jcatangu
 */
@Entity
@Table(name = "ALTERNATIVASEJEC")
public class Alternativasejec implements Serializable {

	private static final long serialVersionUID = 1L;
	// @Max(value=?) @Min(value=?)//if you know range of your decimal fields
	// consider using these annotations to enforce field validation
	@Id
	@Basic(optional = false)
	@NotNull
	@Column(name = "IDALTERNEJEC")
	private BigDecimal idalternejec;

	@Lob
	@Column(name = "ORDENITEMSPRESENTADOS")
	private String ordenitemspresentados;

	@Lob
	@Column(name = "ITEMSDILIGENCIADOS")
	private String itemsdiligenciados;

	@Lob
	@Column(name = "ALTERNATIVASDILIGENCIADAS")
	private String alternativasdiligenciadas;

	@Column(name = "FECHAYHORAEJECUCIONINICIO")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechayhoraejecucioninicio;

	@Column(name = "FECHAYHORAEJECUCIONFIN")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechayhoraejecucionfin;

	@JoinColumn(name = "PRUEBAPRES_IDPRUPRE", referencedColumnName = "IDPRUPRE")
	@OneToOne(optional = false)
	private Pruebapres pruebapresIdprupre;

	public Alternativasejec() {
	}

	public Alternativasejec(BigDecimal idalternejec) {
		this.idalternejec = idalternejec;
	}

	public BigDecimal getIdalternejec() {
		return idalternejec;
	}

	public void setIdalternejec(BigDecimal idalternejec) {
		this.idalternejec = idalternejec;
	}

	public String getOrdenitemspresentados() {
		return ordenitemspresentados;
	}

	public void setOrdenitemspresentados(String ordenitemspresentados) {
		this.ordenitemspresentados = ordenitemspresentados;
	}

	public String getItemsdiligenciados() {
		return itemsdiligenciados;
	}

	public void setItemsdiligenciados(String itemsdiligenciados) {
		this.itemsdiligenciados = itemsdiligenciados;
	}

	public String getAlternativasdiligenciadas() {
		return alternativasdiligenciadas;
	}

	public void setAlternativasdiligenciadas(String alternativasdiligenciadas) {
		this.alternativasdiligenciadas = alternativasdiligenciadas;
	}

	public Date getFechayhoraejecucioninicio() {
		return fechayhoraejecucioninicio;
	}

	public void setFechayhoraejecucioninicio(Date fechayhoraejecucioninicio) {
		this.fechayhoraejecucioninicio = fechayhoraejecucioninicio;
	}

	public Date getFechayhoraejecucionfin() {
		return fechayhoraejecucionfin;
	}

	public void setFechayhoraejecucionfin(Date fechayhoraejecucionfin) {
		this.fechayhoraejecucionfin = fechayhoraejecucionfin;
	}

	public Pruebapres getPruebapresIdprupre() {
		return pruebapresIdprupre;
	}

	public void setPruebapresIdprupre(Pruebapres pruebapresIdprupre) {
		this.pruebapresIdprupre = pruebapresIdprupre;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idalternejec != null ? idalternejec.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Alternativasejec)) {
			return false;
		}
		Alternativasejec other = (Alternativasejec) object;
		if ((this.idalternejec == null && other.idalternejec != null)
				|| (this.idalternejec != null && !this.idalternejec.equals(other.idalternejec))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Alternativasejec[ idalternejec=" + idalternejec + " ]";
	}

}
