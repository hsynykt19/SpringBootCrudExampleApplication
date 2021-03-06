package com.example.springbootcrudexampleapplication.service;

import com.example.springbootcrudexampleapplication.entity.Customer;
import com.example.springbootcrudexampleapplication.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer addCustomer(Customer customer){
        return customerRepository.save(customer);
    }

    public List<Customer> findAllCustomer(){
        return customerRepository.findAll();
    }

    public Customer getCustomerById(Long customerId){
        return customerRepository.findById(customerId).get();
    }

    public void deleteCustomerById(Long customerId){
        customerRepository.deleteById(customerId);
    }

}
