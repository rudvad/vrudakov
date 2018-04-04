package ru.job4j.professions;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PatientTest {
    @Test
    public void checkPatientsDiagnose() {
        Diagnose diag = new Diagnose("Psycho");
        Patient pat = new Patient("George", diag);
        String expected = "Psycho";
        String result = pat.getDiagnose().getInfo();
        assertEquals(result,expected);
    }
   
}
