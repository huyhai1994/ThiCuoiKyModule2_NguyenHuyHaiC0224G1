package healthrecord.type;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VipIITest {
    @Test
    public void getPayment() {
        VipII vipII = new VipII();
        assertEquals("VIPII", vipII.getPayment());
    }

}