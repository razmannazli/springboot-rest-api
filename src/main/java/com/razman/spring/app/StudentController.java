package com.razman.spring.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/odm")
public class StudentController {
	
	@GetMapping("/student")
	public Student getStudent() {
		return new Student("Razman", "Nazli");
	}
	
	@GetMapping("/students")
	public List<Student> getStudents() {
		List<Student> students = new ArrayList<>();
		students.add(new Student("Razman1", "Nazli1"));
		students.add(new Student("Razman2", "Nazli2"));
		students.add(new Student("Razman3", "Nazli3"));
		return students;
	}
	
	// http://localhost:8080/student/razman/nazli
	
	@GetMapping("/student/{firstName}/{lastName}")
	public Student studentPathVariable(@PathVariable("firstName") String firstName,@PathVariable("lastName") String lastName) {
		return new Student(firstName+"123", lastName);
	}
	
	// build rest API to handle query parameters
	// http://localhost:8080/student/query?firstName=Razman&lastName=Name
	@GetMapping("/student/query")
	public Student studentQueryParam(@RequestParam(name = "firstName") String firstName, @RequestParam(name = "lastName") String lastName) {
		return new Student(firstName, lastName);
	}
}
