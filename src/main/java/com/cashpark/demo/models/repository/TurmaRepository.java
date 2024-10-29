package com.cashpark.demo.models.repository;

import com.cashpark.demo.models.domain.Classroom;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TurmaRepository extends JpaRepository<Classroom, Long> {}
