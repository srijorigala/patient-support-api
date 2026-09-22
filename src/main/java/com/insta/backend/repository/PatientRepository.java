package com.insta.backend.repository;
import com.insta.backend.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
public interface PatientRepository extends JpaRepository<Patient, Long> {
    List<Patient> findByInsuranceTypeIgnoreCase(String insuranceType);
    
    
}