package ru.iooko.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email
) {

}
