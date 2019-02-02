package com.ssi;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vehicle {
	@Id
	private String regno;
	private String vtype;
	private String brand;
	public String getRegno() {
		return regno;
	}
	public void setRegno(String regno) {
		this.regno = regno;
	}
	public String getVtype() {
		return vtype;
	}
	public void setVtype(String vtype) {
		this.vtype = vtype;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Vehicle(String regno, String vtype, String brand) {
		super();
		this.regno = regno;
		this.vtype = vtype;
		this.brand = brand;
	}
	public Vehicle() {
		super();
	}
	public Vehicle(String regno) {
		super();
		this.regno = regno;
	}
	@Override
	public String toString() {
		return "Vehicle [regno=" + regno + ", vtype=" + vtype + ", brand="
				+ brand + "]";
	}
	
	
	
}
