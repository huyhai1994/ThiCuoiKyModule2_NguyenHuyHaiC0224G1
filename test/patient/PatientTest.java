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

}