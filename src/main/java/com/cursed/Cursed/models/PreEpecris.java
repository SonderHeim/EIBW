package com.cursed.Cursed.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PreEpecris")
public class PreEpecris {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pe_id;

    private String ost_opht_stat;

    private String ost_basis_dis;

    private String ost_hard_dis;

    private String ost_addit_inf;

    private String ost_anam_dis;

    private String blood_group;

    private String blood_resus;

    private String blood_stats;

    private String ost_with_dis;

    private String ost_allerg_anam;

    private String operention_type;

    private String eye_type;

    private String anastesia;

    private String Premedic;

    private String obosnovanie;

    private String riski;

    private String uchitdobat;

    public PreEpecris() {
    }

    public PreEpecris(String ost_opht_stat, String ost_basis_dis, String ost_hard_dis, String ost_addit_inf, String ost_anam_dis, String blood_group, String blood_resus, String blood_stats, String ost_with_dis, String ost_allerg_anam, String operention_type, String eye_type, String anastesia, String premedic, String obosnovanie, String riski, String uchitdobat) {
        this.ost_opht_stat = ost_opht_stat;
        this.ost_basis_dis = ost_basis_dis;
        this.ost_hard_dis = ost_hard_dis;
        this.ost_addit_inf = ost_addit_inf;
        this.ost_anam_dis = ost_anam_dis;
        this.blood_group = blood_group;
        this.blood_resus = blood_resus;
        this.blood_stats = blood_stats;
        this.ost_with_dis = ost_with_dis;
        this.ost_allerg_anam = ost_allerg_anam;
        this.operention_type = operention_type;
        this.eye_type = eye_type;
        this.anastesia = anastesia;
        this.Premedic = premedic;
        this.obosnovanie = obosnovanie;
        this.riski = riski;
        this.uchitdobat = uchitdobat;
    }

    public int getPe_id() {
        return pe_id;
    }

    public void setPe_id(int pe_id) {
        this.pe_id = pe_id;
    }

    public String getOst_opht_stat() {
        return ost_opht_stat;
    }

    public void setOst_opht_stat(String ost_opht_stat) {
        this.ost_opht_stat = ost_opht_stat;
    }

    public String getOst_basis_dis() {
        return ost_basis_dis;
    }

    public void setOst_basis_dis(String ost_basis_dis) {
        this.ost_basis_dis = ost_basis_dis;
    }

    public String getOst_hard_dis() {
        return ost_hard_dis;
    }

    public void setOst_hard_dis(String ost_hard_dis) {
        this.ost_hard_dis = ost_hard_dis;
    }

    public String getOst_addit_inf() {
        return ost_addit_inf;
    }

    public void setOst_addit_inf(String ost_addit_inf) {
        this.ost_addit_inf = ost_addit_inf;
    }

    public String getOst_anam_dis() {
        return ost_anam_dis;
    }

    public void setOst_anam_dis(String ost_anam_dis) {
        this.ost_anam_dis = ost_anam_dis;
    }

    public String getBlood_group() {
        return blood_group;
    }

    public void setBlood_group(String blood_group) {
        this.blood_group = blood_group;
    }

    public String getBlood_resus() {
        return blood_resus;
    }

    public void setBlood_resus(String blood_resus) {
        this.blood_resus = blood_resus;
    }

    public String getBlood_stats() {
        return blood_stats;
    }

    public void setBlood_stats(String blood_stats) {
        this.blood_stats = blood_stats;
    }

    public String getOst_with_dis() {
        return ost_with_dis;
    }

    public void setOst_with_dis(String ost_with_dis) {
        this.ost_with_dis = ost_with_dis;
    }

    public String getOst_allerg_anam() {
        return ost_allerg_anam;
    }

    public void setOst_allerg_anam(String ost_allerg_anam) {
        this.ost_allerg_anam = ost_allerg_anam;
    }

    public String getOperention_type() {
        return operention_type;
    }

    public void setOperention_type(String operention_type) {
        this.operention_type = operention_type;
    }

    public String getEye_type() {
        return eye_type;
    }

    public void setEye_type(String eye_type) {
        this.eye_type = eye_type;
    }

    public String getAnastesia() {
        return anastesia;
    }

    public void setAnastesia(String anastesia) {
        this.anastesia = anastesia;
    }

    public String getPremedic() {
        return Premedic;
    }

    public void setPremedic(String premedic) {
        Premedic = premedic;
    }

    public String getObosnovanie() {
        return obosnovanie;
    }

    public void setObosnovanie(String obosnovanie) {
        this.obosnovanie = obosnovanie;
    }

    public String getRiski() {
        return riski;
    }

    public void setRiski(String riski) {
        this.riski = riski;
    }

    public String getUchitdobat() {
        return uchitdobat;
    }

    public void setUchitdobat(String uchitdobat) {
        this.uchitdobat = uchitdobat;
    }
}