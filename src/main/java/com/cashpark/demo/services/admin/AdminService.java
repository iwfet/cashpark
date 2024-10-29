package com.cashpark.demo.services.admin;

import com.cashpark.demo.models.domain.Admin;

import java.util.List;
import java.util.Optional;


public interface AdminService {


    List<Admin> findAll();

    Optional<Admin> findById(Long id);

    Admin save(Admin admin);

    void delete(Long id);
}

