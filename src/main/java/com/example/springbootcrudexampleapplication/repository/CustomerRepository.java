package com.example.springbootcrudexampleapplication.repository;

import com.example.springbootcrudexampleapplication.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository  extends JpaRepository<Customer,Long> {
}
