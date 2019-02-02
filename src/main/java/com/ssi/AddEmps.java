package com.ssi;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class AddEmps {

	public static void main(String[] args) {

		Session session=Data.getSF().openSession();
		
		Emp e1=new Emp();
		Emp e2=new Emp();
		
		e1.setEno(111); e1.setEname("AAA");
		ArrayList<Vehicle> list1=new ArrayList<Vehicle>(); 
		list1.add(new Vehicle("MP09CD1122"));
		list1.add(new Vehicle("MP09EF2233"));
		e1.setVehicles(list1);
		
		e2.setEno(112); e2.setEname("BBB");
		e2.getVehicles().add(new Vehicle("MP09GH4455"));
		e2.getVehicles().add(new Vehicle("MP09IJ6677"));
		
		Transaction tr=session.beginTransaction();
		session.save(e1); session.save(e2);
		
		tr.commit();
		
		session.close();
		
		System.out.println("Employee Data Added");
		
	}

}
