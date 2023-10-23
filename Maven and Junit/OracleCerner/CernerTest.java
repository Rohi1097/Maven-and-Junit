package OracleCerner;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class CernerTest {

    @Test
    public void testGetCerner() {
        Cerner cerner = new Cerner("Cerner Corporation", "Rohith", 2022);
        String cernerName = cerner.getCerner();
        assertEquals("Cerner Corporation", cernerName);
    }

    @Test
    public void testGetEmployee() {
        Cerner cerner = new Cerner("Cerner Corporation", "Raj", 2023);
        String employeeName = cerner.getemployee();
        assertEquals("Raj", employeeName);
    }

    @Test
    public void testGetYear() {
        Cerner cerner = new Cerner("Cerner Corporation", "Ram", 2021);
        int year = cerner.getYear();
        assertEquals(2021, year);
    }
}

