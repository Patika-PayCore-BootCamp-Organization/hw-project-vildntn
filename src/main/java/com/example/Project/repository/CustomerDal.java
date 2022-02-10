package com.example.Project.repository;

import com.example.Project.model.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerDal extends JpaRepository<Customer,Integer> {

}
