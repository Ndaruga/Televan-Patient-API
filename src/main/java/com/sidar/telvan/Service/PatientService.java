package com.sidar.telvan.Service;

import com.sidar.telvan.Model.PatientDetails;

import java.util.List;

public interface PatientService {
    public String createNewPatient(PatientDetails patientDetails);
    public String updatePatient(PatientDetails patientDetails);
    public String deletePatient(int patientId);
    public PatientDetails findPatient(int patientId);
    public List<PatientDetails> findAllPatients();

}
