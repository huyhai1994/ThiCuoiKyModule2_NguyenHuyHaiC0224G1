package patient.relatedinformations;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HospitalizationDateTest {
    @Test
    public void getDate() {
        HospitalizationDate hospitalizationDate = new HospitalizationDate();
        hospitalizationDate.setDate("07/08/2016");
        assertEquals("07/08/2016", hospitalizationDate.getDate());
    }
    @Test
    public void setDate() {
        HospitalizationDate hospitalizationDate = new HospitalizationDate();
        hospitalizationDate.setDate("07/08/2016");
        assertEquals("07/08/2016", hospitalizationDate.getDate());
    }
    @Test
    public void toStringTest() {
        HospitalizationDate hospitalizationDate = new HospitalizationDate();
        hospitalizationDate.setDate("07/08/2016");
        assertEquals("07/08/2016", hospitalizationDate.toString());
    }
    @Test
    public void HospitalizationDateTest(){
        HospitalizationDate hospitalizationDate = new HospitalizationDate("07/08/2016");
        assertEquals("07/08/2016", hospitalizationDate.toString());
    }

}