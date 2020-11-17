package com.rest.data.controller;

import java.util.List;
import java.util.Optional;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.data.beans.Employee;
import com.rest.data.util.StudentUtil;

@RestController
@RequestMapping("/employee/v1")
public class EmployeeController {

	@GetMapping("/getEmployeeInfo/{id}")
	@ResponseBody
	public Employee getEmployeeInfoById(@PathVariable int id) {
		Optional<Employee> filteredData = StudentUtil.getEmployeeList().stream().filter(data -> data.getId() == id)
				.findFirst();

		return filteredData.get();
	}

	@GetMapping("/getAllEmployees")
	@Produces(MediaType.APPLICATION_XML)
	public ResponseEntity<List<Employee>> getAllEmployees() {

		return ResponseEntity.ok(StudentUtil.getEmployeeList());
	}

	@PostMapping("/addEmployee")
	public List<Employee> addEmployee(@RequestBody Employee employee) {
		List<Employee> employeeList = StudentUtil.getEmployeeList();
		employeeList.add(employee);
		return employeeList;
	}

	@DeleteMapping("/deleteEmployee/{id}")
	public List<Employee> deleteEmployee(@PathVariable int id) {

		List<Employee> employeeList = StudentUtil.getEmployeeList();
		employeeList.removeIf(data -> data.getId() == id);

		return employeeList;
	}

}
