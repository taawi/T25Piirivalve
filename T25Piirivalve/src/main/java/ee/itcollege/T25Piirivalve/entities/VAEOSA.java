package ee.itcollege.T25Piirivalve.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.tostring.RooToString;
import ee.itcollege.T25Piirivalve.entities.PIIRILOIGU_HALDAJA;
import java.util.Set;
import ee.itcollege.T25Piirivalve.entities.AMET_VAEOSAS;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: VAEOSA
 *
 */
@Entity
@RooToString
@RooEntity

public class VAEOSA extends BaseEntity implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long vaeosa_ID;  
	@Size(min = 1, max = 20)
	@NotNull
	private String kood;
	@Size(min = 1, max = 100)
	@NotNull
	private String nimetus;
	@DateTimeFormat(pattern = "dd.MM.yyyy")
	@NotNull
	private Date alates;
	@DateTimeFormat(pattern = "dd.MM.yyyy")
	@NotNull
	private Date kuni;	
	private static final long serialVersionUID = 1L;
	@OneToMany(mappedBy = "vAEOSA")
	private Set<PIIRILOIGU_HALDAJA> pIIRILOIGU_HALDAJA;
	@OneToMany(mappedBy = "vAEOSA")
	private Set<AMET_VAEOSAS> aMET_VAEOSAS;
	public VAEOSA() {
		super();
	}
	
	public Long getVaeosa_ID() {
		return this.vaeosa_ID;
	}

	public String getKood() {
		return kood;
	}

	public void setKood(String kood) {
		this.kood = kood;
	}

	public String getNimetus() {
		return nimetus;
	}

	public void setNimetus(String nimetus) {
		this.nimetus = nimetus;
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

	public Set<PIIRILOIGU_HALDAJA> getPIIRILOIGU_HALDAJA() {
	    return pIIRILOIGU_HALDAJA;
	}

	public void setPIIRILOIGU_HALDAJA(Set<PIIRILOIGU_HALDAJA> param) {
	    this.pIIRILOIGU_HALDAJA = param;
	}

	public Set<AMET_VAEOSAS> getAMET_VAEOSAS() {
	    return aMET_VAEOSAS;
	}

	public void setAMET_VAEOSAS(Set<AMET_VAEOSAS> param) {
	    this.aMET_VAEOSAS = param;
	} 
	
   
}
