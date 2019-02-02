package com.ssi;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class AddVehicles {

	public static void main(String[] args) {

		Session session=Data.getSF().openSession();
		
		Vehicle v1=new Vehicle("MP09CD1122","SUV","Maruti");
		Vehicle v2=new Vehicle("MP09EF2233","Sedan","Honda");
		Vehicle v3=new Vehicle("MP09GH4455","HB","BMW");
		Vehicle v4=new Vehicle("MP09IJ6677","Jeep","Honda");
		Vehicle v5=new Vehicle("MP09KL8899","SUV","Huyndai");
		Transaction tr=session.beginTransaction();
		session.save(v1); session.save(v2); session.save(v3);
		session.save(v4); session.save(v5); 
		tr.commit();
		System.out.println("Vehicles Added");
		
		
	}

}
