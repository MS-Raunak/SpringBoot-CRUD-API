package com.ms.services;

import java.util.List;
import com.ms.entity.Student;


public interface StudentService {
	Student getStudentById(int id);
	List<Student> getAllStudents();
	String saveStudent(Student student);
	String updateStudentById(Student student, int id);
	String deleteStudentById(int id);

}
