package patient;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import patient.relatedinformations.HealthRecordCode;
import patient.relatedinformations.HealthRecordId;

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

}