package com.sidar.telvan.Controller;


import com.sidar.telvan.Model.PatientDetails;
import com.sidar.telvan.Service.PatientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/patient")
public class PatientAPIController {

    PatientService patientService;

    public PatientAPIController(PatientService patientService) {
        this.patientService = patientService;
    }

    //    Read specific patient
    @GetMapping("{id}")
    public PatientDetails getPatientDetails(@PathVariable("id") int id) {
        return patientService.findPatient(id);
    }

    //    Read all patients
    @GetMapping()
    public List<PatientDetails> getAllPatientDetails() {
        return patientService.findAllPatients();
    }

    @PostMapping
    public String createPatientDetails(@RequestBody PatientDetails patientDetails){
        patientService.createNewPatient(patientDetails);
        int patientId = patientDetails.getId();
        return "Patient ID: "+patientId+" created successfully";
    }

    @PutMapping
    public String updatePatientDetails(@RequestBody PatientDetails patientDetails){
        patientService.updatePatient(patientDetails);
        int patientId = patientDetails.getId();
        return "Patient ID: "+patientId+" updated successfully";
    }

    @DeleteMapping("{id}")
    public String deletePatientDetails(@PathVariable("id") int id){
        patientService.deletePatient(id);
        return "Patient ID: "+id+" deleted successfully";
    }
}
