package Project;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class testcase {
    
    @Test
    public void testAddition() {
    	math t=new math();
   	    int actual=t.add(10, 5);
        int expected = 15;
        assertEquals(expected, actual);
    }

    @Test
    public void testSubtraction() {
    	math t=new math();
    	int actual=t.subtract(5, 10);
        int expected = -5;  
        assertEquals(expected, actual);
    }
    
    @Test
    public void testMultiplication() {
    	math t=new math();
   	    int actual=t.multiply(10, 5);
        int expected = 50;
        assertEquals(expected, actual);
    }
}
