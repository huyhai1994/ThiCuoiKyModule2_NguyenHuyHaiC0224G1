package healthrecord.type;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NormalTest {
    @Test
    public void getPayment() {
        Normal normal = new Normal();
        normal.setPayment(100000);
        assertEquals("100000VND", normal.getPayment());
    }
    @Test
    public void setPayment() {
        Normal normal = new Normal();
        normal.setPayment(100000);
        assertNotEquals(100000, normal.getPayment());
    }

}