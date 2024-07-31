package com.sidar.telvan.Service.Impl;

import com.sidar.telvan.DbRepository.PatientRepository;
import com.sidar.telvan.Model.PatientDetails;
import com.sidar.telvan.Service.PatientService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {

    PatientRepository patientRepository;

    public PatientServiceImpl(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;

    }
    @Override
    public String createNewPatient(PatientDetails patientDetails) {
        patientRepository.save(patientDetails);
        return "User successfully created!";
    }

    @Override
    public String updatePatient(PatientDetails patientDetails) {
        patientRepository.save(patientDetails);
        return "User successfully updated!";
    }

    @Override
    public String deletePatient(int patientId) {
        patientRepository.deleteById(patientId);
        return "User successfully deleted!";
    }

    @Override
    public PatientDetails findPatient(int patientId) {
        return patientRepository.findById(patientId).get();
    }

    @Override
    public List<PatientDetails> findAllPatients() {
        return patientRepository.findAll();
    }
}
