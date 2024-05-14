package regex;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class NameRegexTest {
    @Test
    public void getRegex() {
        NameRegex nameRegex = new NameRegex();
        nameRegex.setRegex("");
        assertEquals("", nameRegex.getRegex());
    }
    @Test
    @DisplayName("Truong Hop Dung...")
    public void validate(){
        NameRegex nameRegex = new NameRegex();
        assertEquals(true, nameRegex.validate("codeGym"));
        assertEquals(true, nameRegex.validate("CodeGym"));
        assertEquals(true, nameRegex.validate("Code Gym"));
        assertEquals(true, nameRegex.validate("Codegym"));
        assertEquals(true, nameRegex.validate("CodeGym"));
        assertEquals(true, nameRegex.validate("Nguyen Huy Hai"));
        assertEquals(true, nameRegex.validate("NguyenHuyHai"));
    }
    @Test
    @DisplayName("Truong Hop Sai...")
    public void validate2(){
        NameRegex nameRegex = new NameRegex();
        assertEquals(true, nameRegex.validate("coddadddddddddddasasdadawdawdawd"));
        assertEquals(true, nameRegex.validate("codeGymadwdawdawdawdawdawdawdawd"));
        assertEquals(true, nameRegex.validate("codegyawdawasdawdawddawdawdawdawdawdawdawdm"));
        assertEquals(true, nameRegex.validate("codeGyawdawdawdawdawdawdawdadawdawddwm"));
    }
}