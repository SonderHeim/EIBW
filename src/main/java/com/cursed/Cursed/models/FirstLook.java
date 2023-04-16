package com.cursed.Cursed.models;

import javax.persistence.*;

import javax.persistence.*;

@Entity
@Table(name = "First_Look")
public class FirstLook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fl_id")
    private int fl_id;

    @Column(name = "fl_data")
    private String fl_data;

    @Column(name = "fl_Time")
    private String fl_time;

    @Column(name = "Complaints", length = 600)
    private String complaints;

    @Column(name = "anamnesis_dis")
    private String anamnesis_dis;

    @Column(name = "anamnesis_life")
    private String anamnesis_life;

    @Column(name = "Phisical_research")
    private String phisical_research;

    @Column(name = "Ophthalmological_status")
    private String ophthalmological_status;

    @Column(name = "Basis_dis")
    private String basis_dis;

    @Column(name = "hard_basis_dis")
    private String hard_basis_dis;

    @Column(name = "outside_dis")
    private String outside_dis;

    @Column(name = "with_dis")
    private String with_dis;

    @Column(name = "additional_nformation")
    private String additional_information;

    @Column(name = "reason_dis")
    private String reason_dis;

    @Column(name = "treatment")
    private String treatment;

    @Column(name = "interventions")
    private String interventions;

    @Column(name = "plan_obsl")
    private String plan_obsl;

    @Column(name = "plan_heal")
    private String plan_heal;

    public FirstLook() {
    }

    public FirstLook(String fl_data, String fl_time, String complaints, String anamnesis_dis, String anamnesis_life, String phisical_research, String ophthalmological_status, String basis_dis, String hard_basis_dis, String outside_dis, String with_dis, String additional_information, String reason_dis, String treatment, String interventions, String plan_obsl, String plan_heal) {
        this.fl_data = fl_data;
        this.fl_time = fl_time;
        this.complaints = complaints;
        this.anamnesis_dis = anamnesis_dis;
        this.anamnesis_life = anamnesis_life;
        this.phisical_research = phisical_research;
        this.ophthalmological_status = ophthalmological_status;
        this.basis_dis = basis_dis;
        this.hard_basis_dis = hard_basis_dis;
        this.outside_dis = outside_dis;
        this.with_dis = with_dis;
        this.additional_information = additional_information;
        this.reason_dis = reason_dis;
        this.treatment = treatment;
        this.interventions = interventions;
        this.plan_obsl = plan_obsl;
        this.plan_heal = plan_heal;
    }

    public int getFl_id() {
        return fl_id;
    }

    public void setFl_id(int fl_id) {
        this.fl_id = fl_id;
    }

    public String getFl_data() {
        return fl_data;
    }

    public void setFl_data(String fl_data) {
        this.fl_data = fl_data;
    }

    public String getFl_time() {
        return fl_time;
    }

    public void setFl_time(String fl_time) {
        this.fl_time = fl_time;
    }

    public String getComplaints() {
        return complaints;
    }

    public void setComplaints(String complaints) {
        this.complaints = complaints;
    }

    public String getAnamnesis_dis() {
        return anamnesis_dis;
    }

    public void setAnamnesis_dis(String anamnesis_dis) {
        this.anamnesis_dis = anamnesis_dis;
    }

    public String getAnamnesis_life() {
        return anamnesis_life;
    }

    public void setAnamnesis_life(String anamnesis_life) {
        this.anamnesis_life = anamnesis_life;
    }

    public String getPhisical_research() {
        return phisical_research;
    }

    public void setPhisical_research(String phisical_research) {
        this.phisical_research = phisical_research;
    }

    public String getOphthalmological_status() {
        return ophthalmological_status;
    }

    public void setOphthalmological_status(String ophthalmological_status) {
        this.ophthalmological_status = ophthalmological_status;
    }

    public String getBasis_dis() {
        return basis_dis;
    }

    public void setBasis_dis(String basis_dis) {
        this.basis_dis = basis_dis;
    }

    public String getHard_basis_dis() {
        return hard_basis_dis;
    }

    public void setHard_basis_dis(String hard_basis_dis) {
        this.hard_basis_dis = hard_basis_dis;
    }

    public String getOutside_dis() {
        return outside_dis;
    }

    public void setOutside_dis(String outside_dis) {
        this.outside_dis = outside_dis;
    }

    public String getWith_dis() {
        return with_dis;
    }

    public void setWith_dis(String with_dis) {
        this.with_dis = with_dis;
    }

    public String getAdditional_information() {
        return additional_information;
    }

    public void setAdditional_information(String additional_information) {
        this.additional_information = additional_information;
    }

    public String getReason_dis() {
        return reason_dis;
    }

    public void setReason_dis(String reason_dis) {
        this.reason_dis = reason_dis;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public String getInterventions() {
        return interventions;
    }

    public void setInterventions(String interventions) {
        this.interventions = interventions;
    }

    public String getPlan_obsl() {
        return plan_obsl;
    }

    public void setPlan_obsl(String plan_obsl) {
        this.plan_obsl = plan_obsl;
    }

    public String getPlan_heal() {
        return plan_heal;
    }

    public void setPlan_heal(String plan_heal) {
        this.plan_heal = plan_heal;
    }
}

