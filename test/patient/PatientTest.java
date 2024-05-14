package patient;

import org.junit.Test;
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
    public void setHealthRecordCode(){
      Patient patient = new Patient();
      patient.setHealthRecordCode(new HealthRecordCode());
      assertEquals(new HealthRecordCode(), patient.getHealthRecordCode());
  }

}