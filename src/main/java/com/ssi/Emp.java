package com.ssi;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Emp {
	@Id
	private int eno;
	private String ename;
	
	@OneToMany
	private List<Vehicle> vehicles=new ArrayList<Vehicle>();
		
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public List<Vehicle> getVehicles() {
		return vehicles;
	}
	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}
	public Emp(int eno, String ename, List<Vehicle> vehicles) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.vehicles = vehicles;
	}
	public Emp() {
		super();
	}
	public Emp(int eno) {
		super();
		this.eno = eno;
	}
	@Override
	public String toString() {
		return "Emp [eno=" + eno + ", ename=" + ename + ", vehicles="
				+ vehicles + "]";
	}
	
	
}
