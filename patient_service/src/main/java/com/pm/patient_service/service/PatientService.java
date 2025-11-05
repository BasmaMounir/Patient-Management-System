package com.pm.patient_service.service;

import com.pm.patient_service.dto.PatientResponseDto;
import com.pm.patient_service.mapper.PatientMapper;
import com.pm.patient_service.model.Patient;
import com.pm.patient_service.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientService {

    private final PatientRepository patientRepository;

    public List<PatientResponseDto> getPatients(){
        List<Patient> patients = patientRepository.findAll();
        return  patients
                .stream()
                .map(PatientMapper::toDto)
                .toList();
    }
}
