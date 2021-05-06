import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator testSubject;

    @Before
    public void setUp() throws Exception {
        this.testSubject = new Calculator();
    }

    @After
    public void tearDown() throws Exception {
        testSubject = null;
    }

    @Test
    public void testAdd() {
        assertEquals("Adding", 32, testSubject.add(12, 20));
    }

    @Test
    public void testAddNegativeNumbers() {
        assertEquals("Two Negative", -5, testSubject.add(-2, -3));
    }

    @Test
    public void testAddNegativePositiveNumbers() {
        assertEquals("Positive and Negative", 1, testSubject.add(-2, 3));
    }

    @Test
    public void testMultiplication(){
        assertEquals("Multiplication", 10, testSubject.multiplication(2, 5));
    }

    @Test
    public void testMultiplication2(){
        assertEquals("Multiplication", 15, testSubject.multiplication(3, 5));
    }

}