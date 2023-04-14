package com.cursed.Cursed.repositories;

import com.cursed.Cursed.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientsRepository extends JpaRepository<Patient, Integer> {
//    @Modifying
//    @Query("DELETE FROM Patient WHERE id = :id")
//    void deleteByIdPatient(int id);
}
