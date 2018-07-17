package com.sample.mains;

import com.sample.pojos.Department;
import com.sample.pojos.Employee;

public class Office {

	public static void main(String[] args){
		
		Employee e1 = new Employee();
		e1.seteId("1234");
		e1.setName("Alice");
		
		Department d1 = new Department();
		d1.setDeptId("3456");
		d1.setDeptName("Chemistry");
		
		System.out.println("The employee name is " + e1.getName());
		System.out.println("The department name is " + d1.getDeptName());
	}
	
}
