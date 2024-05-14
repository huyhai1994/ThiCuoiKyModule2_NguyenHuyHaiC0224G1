package patient.relatedinformations;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReasonTest {
    @Test
    public void getReason() {
        Reason reason = new Reason();
        reason.setReason("reason");
        assertEquals("reason", reason.getReason());
    }
    @Test
    public void setReason() {
        Reason reason = new Reason();
        reason.setReason("reason");
        assertEquals("reason", reason.getReason());
    }
    @Test
    public void toStringTest() {
        Reason reason = new Reason();
        reason.setReason("reason");
        assertEquals("reason", reason.toString());
    }
    @Test
    public void ReasonTest(){
        Reason reason = new Reason("reason");
        assertEquals("reason", reason.toString());
    }
}