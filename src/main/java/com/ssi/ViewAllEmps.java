package com.ssi;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

public class ViewAllEmps {

	public static void main(String[] args) {

		Session session=Data.getSF().openSession();
		Criteria cr=session.createCriteria(Emp.class);
		List<Emp> empList=cr.list();
		
		for(Emp e:empList){
			
			System.out.println(e.getEno());
			System.out.println(e.getEname());
			
			List<Vehicle> vList=e.getVehicles();
			
			for(Vehicle v:vList){

				System.out.println(v.getRegno()+","+v.getBrand()+","+v.getVtype());
			}
			System.out.println("____________________________________________________");
		}
		
		session.close();
	}

}
