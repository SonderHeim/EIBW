package com.cursed.Cursed.services;

import com.cursed.Cursed.models.Patient;
import com.cursed.Cursed.repositories.PatientsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class PatientsService {

    private final PatientsRepository patientsRepository;

    @Autowired
    public PatientsService(PatientsRepository patientsRepository) {
        this.patientsRepository = patientsRepository;
    }
    public List<Patient> findAll(){
        return patientsRepository.findAll();
    }

    public Patient findOne(int id){
        Optional<Patient> foundPerson = patientsRepository.findById(id);
        return foundPerson.orElse(null);
    }

    @Transactional
    public void save(Patient patient){
        patientsRepository.save(patient);
    }

    @Transactional
    public void update(int id, Patient updatedPatient){
        updatedPatient.setId(id);
        patientsRepository.save(updatedPatient);
    }

    @Transactional
    public void delete(int id){
        patientsRepository.deleteById(id);
    }
}