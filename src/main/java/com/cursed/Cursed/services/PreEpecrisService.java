package com.cursed.Cursed.services;

import com.cursed.Cursed.models.Patient;
import com.cursed.Cursed.models.PreEpecris;
import com.cursed.Cursed.repositories.PreEpecrisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class PreEpecrisService {

    private final PreEpecrisRepository preEpecrisRepository;

    @Autowired
    public PreEpecrisService(PreEpecrisRepository preEpecrisRepository) {
        this.preEpecrisRepository = preEpecrisRepository;
    }

    public List<PreEpecris> findAll(){
        return preEpecrisRepository.findAll();
    }

    public PreEpecris findOne(int pe_id){
        Optional<PreEpecris> foundPerson = preEpecrisRepository.findById(pe_id);
        return foundPerson.orElse(null);
    }

    @Transactional
    public void save(PreEpecris preEpecris){
        preEpecrisRepository.save(preEpecris);
    }

    @Transactional
    public void update(int pe_id, PreEpecris updatedPreEpecris){
        updatedPreEpecris.setPe_id(pe_id);
        preEpecrisRepository.save(updatedPreEpecris);
    }

    @Transactional
    public void delete(int pe_id){
        preEpecrisRepository.deleteById(pe_id);
    }

}
