package com.cashpark.demo.models.repository;

import com.cashpark.demo.models.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface StudentRepository extends JpaRepository<Student, Long> {
}
