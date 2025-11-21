package com.Assignment.CarServices.Entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Ceo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ceoid;
	
	private  String ceoname;
	
	private String Email;
	

	
	@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "ceo_id")
	private List<Experience> experiences;

	
	
	
	public int getCeoid() {
		return ceoid;
	}

	public void setCeoid(int ceoid) {
		this.ceoid = ceoid;
	}

	public String getCeoname() {
		return ceoname;
	}

	public void setCeoname(String ceoname) {
		this.ceoname = ceoname;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public List<Experience> getExperiences() {
		return experiences;
	}

	public void setExperiences(List<Experience> experiences) {
		this.experiences = experiences;
	}

	public Ceo(int ceoid, String ceoname, String email, List<Experience> experiences) {
		super();
		this.ceoid = ceoid;
		this.ceoname = ceoname;
		Email = email;
		this.experiences = experiences;
	}

	public Ceo() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
