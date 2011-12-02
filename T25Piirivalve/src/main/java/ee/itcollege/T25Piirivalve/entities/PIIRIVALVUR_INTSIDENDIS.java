package ee.itcollege.T25Piirivalve.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.tostring.RooToString;
import ee.itcollege.T25Piirivalve.entities.INTSIDENT;
import ee.itcollege.T25Piirivalve.entities.PIIRIVALVURI_SEADUS_INTSIDENDIS;
import java.util.Set;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: PIRIVALVUR_INTSIDENDIS
 *
 */
@Entity
@RooToString
@RooEntity

public class PIIRIVALVUR_INTSIDENDIS extends BaseEntity implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long piirivalvur_intsidendis_ID;
	@DateTimeFormat(pattern = "dd.MM.yyyy")
	@NotNull
	private Date alates;
	@DateTimeFormat(pattern = "dd.MM.yyyy")
	@NotNull
	private Date kuni;
	@NotNull
	private String kirjeldus;
	private static final long serialVersionUID = 1L;
	@ManyToOne
	private PIIRIVALVUR pIIRIVALVUR;
	@ManyToOne
	private VAHTKOND_INTSIDENDIS vAHTKOND_INTSIDENDIS;
	@ManyToOne
	private INTSIDENT iNTSIDENT;
	@OneToMany(mappedBy = "pIIRIVALVUR_INTSIDENDIS")
	private Set<PIIRIVALVURI_SEADUS_INTSIDENDIS> pIIRIVALVURI_SEADUS_INTSIDENDIS;

	public PIIRIVALVUR_INTSIDENDIS() {
		super();
	}   
	public Long getPiirivalvur_intsidendis_ID() {
		return this.piirivalvur_intsidendis_ID;
	}

	public void setPiirivalvur_intsidendis_ID(Long piirivalvur_intsidendis_ID) {
		this.piirivalvur_intsidendis_ID = piirivalvur_intsidendis_ID;
	}
	public Date getAlates() {
		return alates;
	}
	public void setAlates(Date alates) {
		this.alates = alates;
	}
	public Date getKuni() {
		return kuni;
	}
	public void setKuni(Date kuni) {
		this.kuni = kuni;
	}
	public String getKirjeldus() {
		return kirjeldus;
	}
	public void setKirjeldus(String kirjeldus) {
		this.kirjeldus = kirjeldus;
	}
	public PIIRIVALVUR getPIIRIVALVUR() {
	    return pIIRIVALVUR;
	}
	public void setPIIRIVALVUR(PIIRIVALVUR param) {
	    this.pIIRIVALVUR = param;
	}
	public VAHTKOND_INTSIDENDIS getVAHTKOND_INTSIDENDIS() {
	    return vAHTKOND_INTSIDENDIS;
	}
	public void setVAHTKOND_INTSIDENDIS(VAHTKOND_INTSIDENDIS param) {
	    this.vAHTKOND_INTSIDENDIS = param;
	}
	public INTSIDENT getINTSIDENT() {
	    return iNTSIDENT;
	}
	public void setINTSIDENT(INTSIDENT param) {
	    this.iNTSIDENT = param;
	}
	public Set<PIIRIVALVURI_SEADUS_INTSIDENDIS> getPIIRIVALVURI_SEADUS_INTSIDENDIS() {
	    return pIIRIVALVURI_SEADUS_INTSIDENDIS;
	}
	public void setPIIRIVALVURI_SEADUS_INTSIDENDIS(Set<PIIRIVALVURI_SEADUS_INTSIDENDIS> param) {
	    this.pIIRIVALVURI_SEADUS_INTSIDENDIS = param;
	}
   
}
