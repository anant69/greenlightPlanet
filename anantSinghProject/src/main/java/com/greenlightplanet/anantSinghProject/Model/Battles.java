package com.greenlightplanet.anantSinghProject.Model;

import org.springframework.stereotype.Component;

import javax.persistence.*;


@Component
@Entity
public class Battles {

    private String name;
    private String year;
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long battle_number;
    private String attacker_king;
    private String defender_king;
    private String attacker_1;
    private String attacker_2;
    private String attacker_3;
    private String attacker_4;
    private String defender_1;
    private String defender_2;
    private String defender_3;
    private String defender_4;
    private String attacker_outcome;
    private String battle_type;

    public Battles() {
    }

    public Battles(String name, String year, Long battle_number, String attacker_king, String defender_king, String attacker_1, String attacker_2, String attacker_3, String attacker_4, String defender_1, String defender_2, String defender_3, String defender_4, String attacker_outcome, String battle_type, String major_death, String major_capture, String attacker_size, String defender_size, String attacker_commander, String defender_commander, String summer, String location, String region, String note) {
        this.name = name;
        this.year = year;
        this.battle_number = battle_number;
        this.attacker_king = attacker_king;
        this.defender_king = defender_king;
        this.attacker_1 = attacker_1;
        this.attacker_2 = attacker_2;
        this.attacker_3 = attacker_3;
        this.attacker_4 = attacker_4;
        this.defender_1 = defender_1;
        this.defender_2 = defender_2;
        this.defender_3 = defender_3;
        this.defender_4 = defender_4;
        this.attacker_outcome = attacker_outcome;
        this.battle_type = battle_type;
        this.major_death = major_death;
        this.major_capture = major_capture;
        this.attacker_size = attacker_size;
        this.defender_size = defender_size;
        this.attacker_commander = attacker_commander;
        this.defender_commander = defender_commander;
        this.summer = summer;
        this.location = location;
        this.region = region;
        this.note = note;
    }

    private String major_death;
    private String major_capture;
    private String attacker_size;
    private String defender_size;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Long getBattle_number() {
        return battle_number;
    }

    public void setBattle_number(Long battle_number) {
        this.battle_number = battle_number;
    }

    public String getAttacker_king() {
        return attacker_king;
    }

    public void setAttacker_king(String attacker_king) {
        this.attacker_king = attacker_king;
    }

    public String getDefender_king() {
        return defender_king;
    }

    public void setDefender_king(String defender_king) {
        this.defender_king = defender_king;
    }

    public String getAttacker_1() {
        return attacker_1;
    }

    public void setAttacker_1(String attacker_1) {
        this.attacker_1 = attacker_1;
    }

    public String getAttacker_2() {
        return attacker_2;
    }

    public void setAttacker_2(String attacker_2) {
        this.attacker_2 = attacker_2;
    }

    public String getAttacker_3() {
        return attacker_3;
    }

    public void setAttacker_3(String attacker_3) {
        this.attacker_3 = attacker_3;
    }

    public String getAttacker_4() {
        return attacker_4;
    }

    public void setAttacker_4(String attacker_4) {
        this.attacker_4 = attacker_4;
    }

    public String getDefender_1() {
        return defender_1;
    }

    public void setDefender_1(String defender_1) {
        this.defender_1 = defender_1;
    }

    public String getDefender_2() {
        return defender_2;
    }

    public void setDefender_2(String defender_2) {
        this.defender_2 = defender_2;
    }

    public String getDefender_3() {
        return defender_3;
    }

    public void setDefender_3(String defender_3) {
        this.defender_3 = defender_3;
    }

    public String getDefender_4() {
        return defender_4;
    }

    public void setDefender_4(String defender_4) {
        this.defender_4 = defender_4;
    }

    public String getAttacker_outcome() {
        return attacker_outcome;
    }

    public void setAttacker_outcome(String attacker_outcome) {
        this.attacker_outcome = attacker_outcome;
    }

    public String getBattle_type() {
        return battle_type;
    }

    public void setBattle_type(String battle_type) {
        this.battle_type = battle_type;
    }

    public String getMajor_death() {
        return major_death;
    }

    public void setMajor_death(String major_death) {
        this.major_death = major_death;
    }

    public String getMajor_capture() {
        return major_capture;
    }

    public void setMajor_capture(String major_capture) {
        this.major_capture = major_capture;
    }

    public String getAttacker_size() {
        return attacker_size;
    }

    public void setAttacker_size(String attacker_size) {
        this.attacker_size = attacker_size;
    }

    public String getDefender_size() {
        return defender_size;
    }

    public void setDefender_size(String defender_size) {
        this.defender_size = defender_size;
    }

    public String getAttacker_commander() {
        return attacker_commander;
    }

    public void setAttacker_commander(String attacker_commander) {
        this.attacker_commander = attacker_commander;
    }

    public String getDefender_commander() {
        return defender_commander;
    }

    public void setDefender_commander(String defender_commander) {
        this.defender_commander = defender_commander;
    }

    public String getSummer() {
        return summer;
    }

    public void setSummer(String summer) {
        this.summer = summer;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    private String attacker_commander;
    private String defender_commander;
    private String summer;
    private String location;
    private String region;
    @Column(length = 1000)
    private String note;

}