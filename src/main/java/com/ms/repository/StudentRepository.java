package com.ms.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ms.entity.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer>{

}
