package com.rikkei.course141.ss1;

import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class PatientService {
    private final PatientRepository patientRepository;

    public Patient create(PatientCreateDTO dto) {
        Patient p = Patient.builder()
            .fullName(dto.getFullName())
            .age(dto.getAge())
            .phoneNumber(dto.getPhoneNumber())
            .build();
        return patientRepository.save(p);
    }

    public Patient findById(Long id) {
        return patientRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Không tìm thấy bệnh nhân với ID: " + id));
    }
}
