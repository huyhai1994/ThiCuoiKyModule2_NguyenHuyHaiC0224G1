package patient.relatedinformations;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PatientIdTest {
    @Test
    public void getId() {
        PatientId patientId = new PatientId();
        patientId.setId(1);
        assertEquals(1, patientId.getId());
    }
    @Test
    public void setId() {
        PatientId patientId = new PatientId();
        patientId.setId(1);
        assertEquals(1, patientId.getId());
    }
    @Test
    public void toStringTest() {
        PatientId patientId = new PatientId();
        patientId.setId(1);
        assertEquals("1", patientId.toString());
    }
    @Test
    public void PatientIdTest(){
        PatientId patientId = new PatientId(1);
        assertEquals("1", patientId.toString());
    }

}