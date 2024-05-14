package patientmanager;

import org.junit.Test;
import patient.Patient;

import static org.junit.jupiter.api.Assertions.*;

public class PatientManagerTest {
    @Test
    public void addPatient() {
        PatientManager patientManager = new PatientManager();
        patientManager.addPatient(new Patient());
        assertEquals(1, patientManager.getSize());
    }
    @Test
    public void removePatient() {
        PatientManager patientManager = new PatientManager();
        patientManager.removePatient(new Patient());
        assertEquals(0, patientManager.getSize());
    }
    @Test
    public void getPatients() {
        PatientManager patientManager = new PatientManager();
        patientManager.getPatients();
    }
    @Test
    public void getPatient() {
        PatientManager patientManager = new PatientManager();
        patientManager.addPatient(new Patient());
        patientManager.getPatient(0);
    }



}