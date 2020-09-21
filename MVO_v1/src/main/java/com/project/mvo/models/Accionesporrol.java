package com.project.mvo.models;

import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
*
* @author jcatangu
* 
*/
@Entity
@Table(name = "ACCIONESPORROL")
public class Accionesporrol implements Serializable {

   private static final long serialVersionUID = 1L;
   @EmbeddedId
   protected AccionesporrolPK accionesporrolPK;
   
   @JoinColumn(name = "ACCIONPERMIT_IDACCION", referencedColumnName = "IDACCION", insertable = false, updatable = false)
   @ManyToOne(optional = false)
   private Accionpermit accionpermit;

   public Accionesporrol() {
   }

   public Accionesporrol(AccionesporrolPK accionesporrolPK) {
       this.accionesporrolPK = accionesporrolPK;
   }

   public Accionesporrol(BigInteger accionpermitIdaccion, BigInteger rolIdrol) {
       this.accionesporrolPK = new AccionesporrolPK(accionpermitIdaccion, rolIdrol);
   }

   public AccionesporrolPK getAccionesporrolPK() {
       return accionesporrolPK;
   }

   public void setAccionesporrolPK(AccionesporrolPK accionesporrolPK) {
       this.accionesporrolPK = accionesporrolPK;
   }

   public Accionpermit getAccionpermit() {
       return accionpermit;
   }

   public void setAccionpermit(Accionpermit accionpermit) {
       this.accionpermit = accionpermit;
   }

   @Override
   public int hashCode() {
       int hash = 0;
       hash += (accionesporrolPK != null ? accionesporrolPK.hashCode() : 0);
       return hash;
   }

   @Override
   public boolean equals(Object object) {
       // TODO: Warning - this method won't work in the case the id fields are not set
       if (!(object instanceof Accionesporrol)) {
           return false;
       }
       Accionesporrol other = (Accionesporrol) object;
       if ((this.accionesporrolPK == null && other.accionesporrolPK != null) || (this.accionesporrolPK != null && !this.accionesporrolPK.equals(other.accionesporrolPK))) {
           return false;
       }
       return true;
   }

   @Override
   public String toString() {
       return "Accionesporrol[ accionesporrolPK=" + accionesporrolPK + " ]";
   }
   
}
