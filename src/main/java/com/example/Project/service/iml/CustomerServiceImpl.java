package com.example.Project.service.iml;

import com.example.Project.model.entity.Customer;
import com.example.Project.repository.CustomerDal;
import com.example.Project.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDal customerDal;

    @Override
    public List<Customer> getAllCustomers() {
        return customerDal.findAll();
    }

    @Override
    public void addCustomer(Customer customer) {
        customerDal.save(customer);
    }

    @Override
    public boolean deleteCustomer(Integer id) {
        customerDal.delete(getCustomerById(id));
        return true;
    }

    @Override
    public Customer getCustomerById(int id) {
        return customerDal.getById(id);
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        return null;
    }
}
