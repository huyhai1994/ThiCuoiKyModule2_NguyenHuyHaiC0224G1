package regex;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class HealthRecordIdRegexTest {
    @Test
    public void getRegex() {
        HealthRecordIdRegex healthRecordIdRegex = new HealthRecordIdRegex();
        healthRecordIdRegex.setRegex("");
        assertEquals("", healthRecordIdRegex.getRegex());
    }
    @Test
    public void setRegex() {
        HealthRecordIdRegex healthRecordIdRegex = new HealthRecordIdRegex();
        healthRecordIdRegex.setRegex("");
        assertEquals("", healthRecordIdRegex.getRegex());
    }
    @Test
    @DisplayName("Truong hop dung...")
    public void validate() {
        HealthRecordIdRegex healthRecordIdRegex = new HealthRecordIdRegex();
        assertTrue(healthRecordIdRegex.validate("BN-123"));
    }
    @Test
    @DisplayName("Truong hop sai...")
    public void validate2() {
        HealthRecordIdRegex healthRecordIdRegex = new HealthRecordIdRegex();
        assertFalse(healthRecordIdRegex.validate("BN-12"));
    }
    @Test
    @DisplayName("Truong hop sai...")
    public void validate3() {
        HealthRecordIdRegex healthRecordIdRegex = new HealthRecordIdRegex();
        assertFalse(healthRecordIdRegex.validate("BN-1234"));
        assertFalse(healthRecordIdRegex.validate("BN-12345"));
        assertFalse(healthRecordIdRegex.validate("BN-123456"));
        assertFalse(healthRecordIdRegex.validate("BN-1234567"));
        assertFalse(healthRecordIdRegex.validate("-123"));
    }

}