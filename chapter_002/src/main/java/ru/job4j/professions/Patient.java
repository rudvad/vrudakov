package ru.job4j.professions;

public class Patient extends Profession {
    private Diagnose illness;

    public Patient(String name, Diagnose diag) {
        this.setName(name);
        this.setProfession("Patient");
        diag.setInfo("Some illness");
        this.setDiagnose(diag);
    }

    public Diagnose getDiagnose() {
        return this.illness;
    }

    public void setDiagnose(Diagnose illness) {
        this.illness = illness;
    }


}
