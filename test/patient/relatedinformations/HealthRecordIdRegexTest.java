package patient.relatedinformations;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
/*Test Ma Benh Nhan*/
public class HealthRecordIdRegexTest {
    @Test
    public void getId() {
        HealthRecordId healthRecordId = new HealthRecordId();
        healthRecordId.setId("BN-435");
        assertEquals("BN-435", healthRecordId.getId());
    }
    @Test
    public void setId() {
        HealthRecordId healthRecordId = new HealthRecordId();
        healthRecordId.setId("BN-435");
        assertEquals("BN-435", healthRecordId.getId());
    }
    @Test
    public void toStringTest() {
        HealthRecordId healthRecordId = new HealthRecordId();
        healthRecordId.setId("BN-435");
        assertEquals("BN-435", healthRecordId.toString());
    }
    @Test
    public void HealthRecordIdTest(){
        HealthRecordId healthRecordId = new HealthRecordId("BN-435");
        assertEquals("BN-435", healthRecordId.toString());
    }


}