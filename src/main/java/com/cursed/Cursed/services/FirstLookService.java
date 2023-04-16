package com.cursed.Cursed.services;

import com.cursed.Cursed.models.FirstLook;
import com.cursed.Cursed.models.Patient;
import com.cursed.Cursed.repositories.FirstLookReposytory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class FirstLookService {
    private final FirstLookReposytory firstLookReposytory;

    public FirstLookService(FirstLookReposytory firstLookReposytory) {
        this.firstLookReposytory = firstLookReposytory;
    }

    public List<FirstLook> findAll(){
        return firstLookReposytory.findAll();
    }

    public FirstLook findOne(int id){
        Optional<FirstLook> firstLook = firstLookReposytory.findById(id);
        return firstLook.orElse(null);
    }

    @Transactional
    public void save(FirstLook firstLook){
        firstLookReposytory.save(firstLook);
    }

    @Transactional
    public void update(int fl_id, FirstLook updatedFirstLook){
        updatedFirstLook.setFl_id(fl_id);
        firstLookReposytory.save(updatedFirstLook);
    }

    @Transactional
    public void delete(int id){
        firstLookReposytory.deleteById(id);
    }
}
