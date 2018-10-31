package org.wecancodeit.ajaxdemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.wecancodeit.ajaxdemo.models.Student;
import org.wecancodeit.ajaxdemo.repositories.StudentRepository;

@RestController
public class ApiController {
	
	@Autowired
	StudentRepository studentRepo;

	@GetMapping("/api/students")
	public Iterable<Student> getStudents() {
		return studentRepo.findAll();
	}
	
	@GetMapping("/api/students/{id}")
	public Student getStudent(@PathVariable(value = "id") Long id) {
		return studentRepo.findById(id).get();
	}
}
