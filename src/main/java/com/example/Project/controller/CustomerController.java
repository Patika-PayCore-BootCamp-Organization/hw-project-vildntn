package com.example.Project.controller;

import com.example.Project.model.Customer;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping ("/customer/")
public class CustomerController {
    private List<Customer> customers=new ArrayList<>();
    {

        customers.add(new Customer(1,"Will","Smith","1254845654","Male","will.smith@gmail.com"));
    }

    @GetMapping("getAll")
    public List<Customer> getAllCustomers() {
        return customers;
    }
    @PostMapping("add")
    public boolean add(@RequestBody Customer customer) {
        return customers.add(customer);
    }
}
