import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HWTest {

    int[] testArr = {4, 2, 3, 6, 5};


    @Test
    public void returnSmallestElementWorks() {
        Main test1 = new Main();
        assertEquals(2, test1.returnSmallest(testArr), "Nope! #1");
    }

    // Hogyan kellene megetetni? És toString() ?!
    @Test
    public void returnGreatestTwoWorks() {
        Main test2 = new Main();
        int[] expected = {2, 3};
        assertEquals(expected, test2.returnGreatestTwo(testArr), "Nope! #2");

    }

    @Test
    public void returnAverageWorks() {
        Main test3 = new Main();
        assertEquals(4.000, test3.average(testArr), "Nope! #3");
    }
}
