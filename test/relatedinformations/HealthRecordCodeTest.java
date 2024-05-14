package relatedinformations;

import org.junit.Test;
import patient.relatedinformations.HealthRecordCode;

import static org.junit.jupiter.api.Assertions.*;

public class HealthRecordCodeTest {
    @Test
    public void getRecordCode() {
        HealthRecordCode healthRecordCode = new HealthRecordCode();
        healthRecordCode.setRecordCode("RecordCode");
        assertEquals("RecordCode", healthRecordCode.getRecordCode());
    }
    @Test
    public void setRecordCode() {
        HealthRecordCode healthRecordCode = new HealthRecordCode();
        healthRecordCode.setRecordCode("RecordCode");
        assertEquals("RecordCode", healthRecordCode.getRecordCode());
    }
    @Test
    public void toStringTest() {
        HealthRecordCode healthRecordCode = new HealthRecordCode();
        healthRecordCode.setRecordCode("RecordCode");
        assertEquals("RecordCode", healthRecordCode.toString());
    }
    @Test
    public void HealthRecordCodeTest(){
        HealthRecordCode healthRecordCode = new HealthRecordCode("RecordCode");
        assertEquals("RecordCode", healthRecordCode.toString());
    }

}