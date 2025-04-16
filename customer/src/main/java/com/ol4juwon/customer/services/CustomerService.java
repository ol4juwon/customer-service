package com.ol4juwon.customer.services;

import com.ol4juwon.customer.CustomerApplication;
import com.ol4juwon.customer.CustomerRegistrationRequest;
import com.ol4juwon.customer.models.Customer;

public record CustomerService() {
    public void registerCustomer(CustomerRegistrationRequest customerRegistrationRequest){
        Customer customer = Customer.builder()
                .firstName(customerRegistrationRequest.firstName())
                .lastName(customerRegistrationRequest.lastName())
                .email(customerRegistrationRequest.email())
                .build();

    }
}
