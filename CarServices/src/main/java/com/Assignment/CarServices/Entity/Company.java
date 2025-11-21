package com.Assignment.CarServices.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Company {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cid;
	
	private String cname;
	
	private double valuation;

	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ceo_id")
    private Ceo ceo;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "hq_id")
    private Hq hq;
	
	
	
	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Company(int cid, String cname, double valuation, Ceo ceo, Hq hq) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.valuation = valuation;
		this.ceo = ceo;
		this.hq = hq;
	}

	public Ceo getCeo() {
		return ceo;
	}

	public void setCeo(Ceo ceo) {
		this.ceo = ceo;
	}

	public Hq getHq() {
		return hq;
	}

	public void setHq(Hq hq) {
		this.hq = hq;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public double getValuation() {
		return valuation;
	}

	public void setValuation(double valuation) {
		this.valuation = valuation;
	}
	
	
	
	
	
	
	
}
