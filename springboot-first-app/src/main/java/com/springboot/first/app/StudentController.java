package com.springboot.first.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	// http://localhost:8080/student
	@GetMapping("/student")
	public student getStudent() {
		return new student("Ramesh","Pradeep");
	}
	
	// http://localhost:8080/student
	@GetMapping("/students")
	public List<student> getStudents(){
		List<student> students = new ArrayList<>();
		students.add(new student("Ramesh","Pradeep"));
		students.add(new student("Praveen","kumar"));
		students.add(new student("Arun","Abdul"));
		students.add(new student("Ram","Abdul"));
		students.add(new student("Aravind","Pradeep"));
		return students;
		
	}
	
	// http://localhost:8080/student/1
	// @PathVarriable annotaion
	@GetMapping("/students/{FirstName}/{LastName}")
	public student studentPathVariable(@PathVariable("FirstName") String FirstName, @PathVariable("LastName") String LastName) {
		return new student(FirstName, LastName);
	}
	
	
	// Build RestAPI to handle Query Parameters
	// http://localhost:8080/student?FirstName=Ramesh&LastName=Pradeep
	
	@GetMapping("/student/quary")
	public student studentQueryParam(
			@RequestParam(name="FirstName") String FirstName, @RequestParam(name="LastName") String LastName) {
		return new student(FirstName, LastName);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
