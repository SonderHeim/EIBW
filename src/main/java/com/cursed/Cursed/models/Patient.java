package com.cursed.Cursed.models;

import javax.persistence.*;

@Entity
@Table(name = "Patients")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "patient_id")
    private int id;

    @Column(name = "p_firstname")
    private String firstName;

    @Column(name = "p_secondname")
    private String secondName;

    @Column(name = "p_thirdname")
    private String thirdName;

    @Column(name = "p_birth_data")
    private String birthDate;

    @Column(name = "p_gender")
    private String gender;

    @Column(name = "p_data_postuplenia")
    private String admissionDate;

    public Patient() {
    }

    public Patient(int id, String firstName, String secondName, String thirdName, String birthDate, String gender, String admissionDate) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.thirdName = thirdName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.admissionDate = admissionDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getThirdName() {
        return thirdName;
    }

    public void setThirdName(String thirdName) {
        this.thirdName = thirdName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(String admissionDate) {
        this.admissionDate = admissionDate;
    }
}
