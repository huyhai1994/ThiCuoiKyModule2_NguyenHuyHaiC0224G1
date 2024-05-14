package regex;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;
public class HealthRecordCodeRegexTest {

    @Test
    public void getRegex() {
        HealthRecordCodeRegex healthRecordCodeRegex = new HealthRecordCodeRegex();
        healthRecordCodeRegex.setRegex("");
        assertEquals("", healthRecordCodeRegex.getRegex());
    }
    @Test
    public void setRegex() {
        HealthRecordCodeRegex healthRecordCodeRegex = new HealthRecordCodeRegex();
        healthRecordCodeRegex.setRegex("");
    }
    @Test
    @DisplayName("Truong hop dung .. ")
    public void validate() {
        HealthRecordCodeRegex healthRecordCodeRegex = new HealthRecordCodeRegex();
        assertTrue(healthRecordCodeRegex.validate("BA-112"));
    }
    @Test
    @DisplayName("Truong hop sai.. ")
    public void validate1() {
        HealthRecordCodeRegex healthRecordCodeRegex = new HealthRecordCodeRegex();
        assertFalse(healthRecordCodeRegex.validate("BA-11"));
    }
    @Test
    @DisplayName("Truong hop sai.. ")
    public void validate2() {
        HealthRecordCodeRegex healthRecordCodeRegex = new HealthRecordCodeRegex();
        assertFalse(healthRecordCodeRegex.validate("-113"));
    }
    @Test
    @DisplayName("Truong hop sai.. ")
    public void validate3() {
        HealthRecordCodeRegex healthRecordCodeRegex = new HealthRecordCodeRegex();
        assertFalse(healthRecordCodeRegex.validate("113"));
    }
    @Test
    @DisplayName("Truong hop sai.. ")
    public void validate4() {
        HealthRecordCodeRegex healthRecordCodeRegex = new HealthRecordCodeRegex();
        assertFalse(healthRecordCodeRegex.validate("BA113"));
    }
    @Test
    public void getErrorMessage(){
        HealthRecordCodeRegex healthRecordCodeRegex = new HealthRecordCodeRegex();
        assertEquals("Ban da nhap sai vui long nhap lai", healthRecordCodeRegex.getErrorMessage());
    }
    @Test
    public void setErrorMessage(){
        HealthRecordCodeRegex healthRecordCodeRegex = new HealthRecordCodeRegex();
        healthRecordCodeRegex.setErrorMessage("Ban da nhap sai vui long nhap lai [Dang can nhap BA-XXX, voi XXX la so]");
        assertEquals("Ban da nhap sai vui long nhap lai [Dang can nhap BA-XXX, voi XXX la so]", healthRecordCodeRegex.getErrorMessage());
    }
}