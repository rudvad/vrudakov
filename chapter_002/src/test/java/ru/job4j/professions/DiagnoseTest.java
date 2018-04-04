package ru.job4j.professions;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class DiagnoseTest {
    @Test
    public void checkInfoDiagnose() {
    Diagnose diag = new Diagnose("Illness");
    String expected = "Illness";
    String result = diag.getInfo();
    assertThat(result, is(expected));
    }
}
