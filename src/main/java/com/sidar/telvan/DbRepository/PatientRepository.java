package com.sidar.telvan.DbRepository;

import com.sidar.telvan.Model.PatientDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<PatientDetails, Integer> {
}
