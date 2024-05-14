package regex;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class DateRegexTest {
    @Test
    public void getRegex() {
        DateRegex dateRegex = new DateRegex();
        dateRegex.setRegex("");
        assertEquals("", dateRegex.getRegex());
    }
    @Test
    public void getErrorMessage() {
        DateRegex dateRegex = new DateRegex();
        dateRegex.setErrorMessage("");
        assertEquals("", dateRegex.getErrorMessage());
    }
    @Test
    @DisplayName("Truong hop dung...")
    public void validate(){
        DateRegex dateRegex = new DateRegex();
        assertTrue(dateRegex.validate("01/01/2020"));
        assertTrue(dateRegex.validate("31/12/2020"));
        assertTrue(dateRegex.validate("01/01/2020"));
        assertTrue(dateRegex.validate("31/12/2023"));
    }
    @Test
    @DisplayName("Truong hop sai...")
    public void validate1(){
        DateRegex dateRegex = new DateRegex();
        assertFalse(dateRegex.validate("01/01/202"));
        assertFalse(dateRegex.validate("01/13/2020"));
        assertFalse(dateRegex.validate("50/01/2020"));
        assertFalse(dateRegex.validate("13/15/2020"));
        assertFalse(dateRegex.validate("01/01/1"));
        assertFalse(dateRegex.validate("01/01/20200"));
        assertFalse(dateRegex.validate("//202"));
        assertFalse(dateRegex.validate("//"));
    }
}