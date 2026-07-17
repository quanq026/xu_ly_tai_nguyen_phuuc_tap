package com.rikkei.course141.ss1;

import jakarta.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class DoctorUpdateDTO {
    @NotBlank
    private String firstName;
    private String lastName;
    private String specializationName;
}
