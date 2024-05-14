package healthrecord.type;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VipITest {
    @Test
    public void getPayment() {
        VipI vipI = new VipI();
        assertEquals("VIPI", vipI.getPayment());
    }
}