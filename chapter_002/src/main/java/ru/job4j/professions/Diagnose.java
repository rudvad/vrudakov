package ru.job4j.professions;

public class Diagnose {
   private String nameDiag;

   public Diagnose(String nameDiag) {
     this.setInfo(nameDiag);  
   }

    public String getInfo() {
        return this.nameDiag;
    }

    public void setInfo(String nameDiag) {
        this.nameDiag = nameDiag;
    }
}
