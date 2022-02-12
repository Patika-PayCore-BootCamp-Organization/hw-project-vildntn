package com.example.Project.controller;


import com.example.Project.model.entity.Customer;
import com.example.Project.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping ("/api/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("getAll")
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }
    @PostMapping("/add")
    public void add(@RequestBody Customer customer) {

        customerService.addCustomer(customer);
    }

        @GetMapping(value="/{id}")
        public Customer getCustomerById(@PathVariable Integer id){
            return customerService.getCustomerById(id);
        }

    }
