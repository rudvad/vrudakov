package main.java;

public class Doctor extends Profession {

    public Doctor() {
     this.setName("doctor");
    }

    public Diagnose heal (Patient patient) {
        return patient.illness;
    }
}
