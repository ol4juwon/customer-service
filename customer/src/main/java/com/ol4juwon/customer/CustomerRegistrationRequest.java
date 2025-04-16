package com.ol4juwon.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email
) {

}
