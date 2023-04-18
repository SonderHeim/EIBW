package com.cursed.Cursed.services;

import com.cursed.Cursed.models.Doctor;
import com.cursed.Cursed.repositories.DoctorRepository;
import com.cursed.Cursed.security.DoctorDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DoctorDetailsService implements UserDetailsService {
    private final DoctorRepository doctorRepository;

    @Autowired
    public DoctorDetailsService(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Optional<Doctor> doctor = doctorRepository.findByUsername(s);
        if (doctor.isEmpty())
            throw new UsernameNotFoundException("User not found!");

        return new DoctorDetails(doctor.get());
    }
}
