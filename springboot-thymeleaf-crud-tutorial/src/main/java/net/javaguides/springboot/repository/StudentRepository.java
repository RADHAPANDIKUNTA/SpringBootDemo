package net.javaguides.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.model.Student;


@Repository
public interface StudentRepository extends JpaRepository <Student, Long> { 
    List<Student> findByName(String name); 
}