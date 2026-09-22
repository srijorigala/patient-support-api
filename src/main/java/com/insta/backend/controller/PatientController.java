package com.insta.backend.controller;
import com.insta.backend.model.Patient;
import com.insta.backend.service.PatientService;
import java.util.Optional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PutMapping;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
@RestController
public class PatientController {

    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping("/patients")
    public List<Patient> getPatients() {
        return patientService.getPatients();
    }
    @GetMapping("/patients/{id}")
    public Optional<Patient> getPatientById(@PathVariable Long id) {
        return patientService.getPatientById(id);
    }
    @GetMapping("patients/search")
    public List<Patient> searchPatients(@RequestParam String insurance) {
    return patientService.searchPatientsByInsurance(insurance);
    }
    @PostMapping("/patients")
    public Patient createPatient(@RequestBody Patient patient) {
    return patientService.createPatient(patient);
    }
    @PutMapping("/patients/{id}")
    public Optional<Patient> updatePatient(@PathVariable Long id, @RequestBody Patient updatedPatient) {
        return patientService.updatePatient(id, updatedPatient);
    }
    @DeleteMapping("/patients/{id}")
    public Optional<Patient> deletePatient(@PathVariable Long id) {
        return patientService.deletePatient(id);        
    }
}
