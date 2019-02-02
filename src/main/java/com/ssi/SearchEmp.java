package com.ssi;

import java.util.List;

import org.hibernate.Session;

public class SearchEmp {

	public static void main(String[] args) {

		Session session=Data.getSF().openSession();
		Emp emp=session.get(Emp.class, 111);
		System.out.println(emp.getEno());
		System.out.println(emp.getEname());
		
		List<Vehicle> list=emp.getVehicles();
		
		for(Vehicle v:list){
			System.out.println(v.getRegno()+","+v.getBrand()+","+v.getVtype());
		}
		

	}

}
