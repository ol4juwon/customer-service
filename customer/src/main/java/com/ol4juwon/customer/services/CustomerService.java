package com.ol4juwon.customer.services;

import com.ol4juwon.customer.CustomerRegistrationRequest;
import com.ol4juwon.customer.models.Customer;
import com.ol4juwon.customer.repos.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public record CustomerService(CustomerRepository customerRepository) {
    public void registerCustomer(CustomerRegistrationRequest customerRegistrationRequest){
        Customer customer = Customer.builder()
                .firstName(customerRegistrationRequest.firstName())
                .lastName(customerRegistrationRequest.lastName())
                .email(customerRegistrationRequest.email())
                .build();
        customerRepository.save(customer);
    }
}
