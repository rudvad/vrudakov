package ru.job4j.professions;

public class Doctor extends Profession {

    public Doctor(String name) {
     this.setName(name);
     this.setProfession("Doctor");
    }

    public Diagnose heal(Patient patient) {
        return patient.getDiagnose();
    }
}
