package com.spring.repository;

//import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends
        JpaRepository<Customer, Integer> {
}
