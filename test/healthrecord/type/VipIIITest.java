package healthrecord.type;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VipIIITest {
    @Test
    public void getPayment() {
        VipIII vipIII = new VipIII();
        assertEquals("VIPIII", vipIII.getPayment());
    }
}