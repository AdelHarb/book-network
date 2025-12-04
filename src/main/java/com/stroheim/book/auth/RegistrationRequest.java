package com.stroheim.book.auth;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Builder
public class RegistrationRequest {

    @NotEmpty(message = "Firstname is Mandatory")
    @NotBlank(message = "Firstname is Mandatory")
    private String firstName;
    @NotBlank(message = "Lastname is Mandatory")
    @NotBlank(message = "Lastname is Mandatory")
    private String lastName;
    @Email(message = "Email is not well formated")
    @NotBlank(message = "Email is Mandatory")
    @NotBlank(message = "Email is Mandatory")
    private String email;
    @NotBlank(message = "password is Mandatory")
    @NotBlank(message = "password is Mandatory")
    @Size(min = 8, message = "Password should be 8 characters minimum.")
    private String password;
}
