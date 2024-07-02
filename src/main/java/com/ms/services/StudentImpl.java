package com.ms.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.entity.Student;
import com.ms.repository.StudentRepository;

@Service
public class StudentImpl implements StudentService{
	@Autowired
	StudentRepository repository;
	
	@Override
	public Student getStudentById(int id) {
		Optional<Student> optional = repository.findById(id);
		return optional.orElse(null); //if object found then return obj otherwise return null
	}

	@Override
	public List<Student> getAllStudents() {
		List<Student> students = (List<Student>) repository.findAll();
		return students;
	}

	@Override
	public String saveStudent(Student student) {
		repository.save(student);
		return "Student saved successfully";
	}

	@Override
	public String deleteStudentById(int id) {
		repository.deleteById(id);
		return "Student deleted successfully";
	}

	@Override
	public String updateStudentById(Student student, int id) {
	    Optional<Student> optional = repository.findById(id);

	    if (optional.isPresent()) {
	        Student student2 = optional.get();
	        student2.setName(student.getName());
	        student2.setAge(student.getAge());
	        repository.save(student2); // Save the updated student back to the repository
	        return "Student data updated successfully";
	    } else {
	        return "Student with ID " + id + " not found";
	    }
	}


}
