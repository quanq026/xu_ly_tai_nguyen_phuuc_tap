package com.rikkei.course141.ss1;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;
@RestController
@RequestMapping("/api/v1/patients")
@RequiredArgsConstructor
public class PatientController {
    private final PatientService patientService;

    @PostMapping
    public ResponseEntity<ApiResponse<Patient>> create(@Valid @RequestBody PatientCreateDTO dto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(ApiResponse.success(patientService.create(dto)));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse<Patient>> get(@PathVariable Long id) {
        return ResponseEntity.ok(ApiResponse.success(patientService.findById(id)));
    }
}
