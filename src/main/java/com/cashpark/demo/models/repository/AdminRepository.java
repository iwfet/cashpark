package com.cashpark.demo.models.repository;

import com.cashpark.demo.models.domain.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface AdminRepository extends JpaRepository<Admin, Long> {}
