package com.rest.data.util;

import java.util.ArrayList;
import java.util.List;

import com.rest.data.beans.Employee;

public class StudentUtil {

	public static List<Employee> getEmployeeList() {
		List<Employee> empDataList = new ArrayList<>();
		
		Employee employee = new Employee();
		employee.setId(100);
		employee.setName("Sunny");
		employee.setSalary(25000);
		employee.setAddress("Canada");
		
		Employee employee1 = new Employee();
		employee1.setId(101);
		employee1.setName("Sunny");
		employee1.setSalary(56000);
		employee1.setAddress("USA");
		
		Employee employee2 = new Employee();
		employee2.setId(102);
		employee2.setName("Sunny");
		employee2.setSalary(75000);
		employee2.setAddress("Japan");
		
		empDataList.add(employee);
		empDataList.add(employee1);
		empDataList.add(employee2);

		return empDataList;
	}
}
