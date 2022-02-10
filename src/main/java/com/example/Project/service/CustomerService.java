package com.example.Project.service;

import com.example.Project.model.entity.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    List<Customer> getAllCustomers();
    void addCustomer(Customer customer);
    boolean deleteCustomer(Integer id);
    Customer getCustomerById(int id);
    Customer updateCustomer(Customer customer);
}
