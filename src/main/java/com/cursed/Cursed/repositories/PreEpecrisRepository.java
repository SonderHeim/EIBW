package com.cursed.Cursed.repositories;

import com.cursed.Cursed.models.PreEpecris;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PreEpecrisRepository extends JpaRepository<PreEpecris, Integer> {
}
