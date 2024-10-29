package com.cashpark.demo.models.repository;

import com.cashpark.demo.models.domain.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}
