package com.sdapps.repositories;

import org.springframework.data.repository.CrudRepository;

import com.sdapps.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Integer>{

}
