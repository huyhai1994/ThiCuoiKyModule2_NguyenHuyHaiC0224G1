package patient;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import patient.relatedinformations.HealthRecordCode;

import static org.junit.jupiter.api.Assertions.*;

public class PatientTest {
  @Test
  public void getName() {
    Patient patient = new Patient();
    patient.setName("name");
    assertEquals("name", patient.getName());
  }
  @Test
    public void setName() {
    Patient patient = new Patient();
    patient.setName("name");
    assertEquals("name", patient.getName());
  }
  @Test
  public void setName1() {
      Patient patient = new Patient();
      patient.setName("name");
      assertEquals("name", patient.getName());
  }
  @Test
  @DisplayName("Right cases...->return true")
  public void getHealthRecordCode() {
    Patient patient = new Patient("Nguyen Van A");
    HealthRecordCode healthRecordCode = new HealthRecordCode();
    patient.setHealthRecordCode("BA-123");
    assertEquals("BA-123", patient.getHealthRecordCode());
  }
  @Test
  @DisplayName("Right cases...->return true")
  public void setHealthRecordCode() {
    Patient patient = new Patient("Nguyen Van A");
    patient.setHealthRecordCode("BA-123");
    assertEquals("BA-123", patient.getHealthRecordCode());

  }
  @Test
  @DisplayName("Right cases...->return true")
  public void setHealthRecordId() {
    Patient patient = new Patient();
    patient.setHealthRecordId("BN-123");
    assertEquals("BN-123", patient.getHealthRecordId());
  }
  @Test
  @DisplayName("Right cases...->return true")
  public void getHealthRecordId() {
    Patient patient = new Patient();
    patient.setHealthRecordId("BN-123");
    assertEquals("BN-123", patient.getHealthRecordId());
  }
  @Test
  @DisplayName("Right cases...->return true")
  public void getHospitalizaionDate(){
    Patient patient = new Patient();
    patient.setHospitalizationDateIn("01-01-2021");
    assertEquals("01-01-2021", patient.getHospitalizationDateIn());
  }
  @Test
  @DisplayName("Right cases...->return true")
  public void setHospitalizationDateIn() {
    Patient patient = new Patient();
    patient.setHospitalizationDateIn("21-01-2021");
    assertEquals("21-01-2021", patient.getHospitalizationDateIn());
  }
  @Test
  @DisplayName("Right cases ...-> return true")
  public void getHositalizationDateout(){
    Patient patient = new Patient();
    patient.setHospitalizationDateOut("24-02-2024");
    assertEquals("24-02-2024", patient.getHospitalizationDateOut());
  }
  @Test
  @DisplayName("it's healhRecord not null")
  public void checkHealthRecordNonull(){
    Patient patient = new Patient();
    assertNotNull(patient.getHealthRecords(1));
    assertNotNull( patient.getHealthRecords(2));
    assertNotNull( patient.getHealthRecords(3));
    assertNotNull( patient.getHealthRecords(4));
    Patient patient2 = new Patient("Nguyen Van A");
    assertNotNull(patient2.getHealthRecords(1));
    assertNotNull( patient2.getHealthRecords(2));
    assertNotNull( patient2.getHealthRecords(3));
    assertNotNull( patient2.getHealthRecords(4));
  }

}