package com.insta.backend.service;
import java.util.Optional;
import com.insta.backend.model.Patient;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import com.insta.backend.repository.PatientRepository;
import java.util.List;

@Service
public class PatientService {
     private final PatientRepository patientRepository;
     public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }
    public Patient createPatient(Patient patient) {
        Patient savedPatient = patientRepository.save(patient);
        return savedPatient;
    }

    // Get ALL patients
    public List<Patient> getPatients() {
        List<Patient> patients = patientRepository.findAll();
        return patients;
    }
    // Get ONE patient by ID
   public Patient getPatientById(Long id) {
    return patientRepository.findById(id)
        .orElseThrow(() -> new PatientNotFoundException(
            "Patient not found with id: " + id
        ));
}
    public Optional<Patient> updatePatient(Long id, Patient updatedPatient) {
     Optional<Patient> patient = patientRepository.findById(id);
      if (patient.isPresent()) {
        Patient existingPatient = patient.get();
        existingPatient.setFirstName(updatedPatient.getFirstName());
        existingPatient.setLastName(updatedPatient.getLastName());
        existingPatient.setEmail(updatedPatient.getEmail());
        existingPatient.setInsuranceType(updatedPatient.getInsuranceType());
        existingPatient.setAnnualIncome(updatedPatient.getAnnualIncome());
        patientRepository.save(existingPatient);
        return Optional.of(existingPatient);
    } else {
        throw new PatientNotFoundException("Patient not found with id: " + id);     
    }
    }
    public Optional<Patient> deletePatient(Long id) {
    Optional<Patient> patient = patientRepository.findById(id);
    if (patient.isPresent()) {
        patientRepository.deleteById(id);
        return patient;
    } else {
        throw new PatientNotFoundException("Patient not found with id: " + id);
    }
    }   
    public List<Patient> searchPatientsByInsurance(String insurance) {

    return patientRepository.findByInsuranceTypeIgnoreCase(insurance);
}
}