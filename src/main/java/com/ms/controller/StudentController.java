package com.ms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ms.entity.Student;
import com.ms.services.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService service;
	
	@GetMapping("/")
	public List<Student> getStudents() {
		return service.getAllStudents();
	}
	
	@GetMapping("/get/{id}")
	public Student getStudent(@PathVariable int id) {
		return service.getStudentById(id);
	}
	
	@PostMapping("/postStudent")
	public String saveStudent(@RequestBody Student student) {
		return service.saveStudent(student);
	}
	
	@DeleteMapping("/deleteStudent/{id}")
	public String removeStudent(@PathVariable int id) {
		return service.deleteStudentById(id);
	}
	
	@PutMapping("/putStudent/{id}")
	public String updateStudent(@RequestBody Student student, @PathVariable int id) {
		return service.updateStudentById(student, id);
	}
	
	
	
}
