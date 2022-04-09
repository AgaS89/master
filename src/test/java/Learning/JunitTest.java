package Learning;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import szkolenie.SilniaR;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class JunitTest {
    SilniaR silniaR = new SilniaR();
    int example;

    @Test
    @DisplayName("Test for 4!")
    public void testSilniaR1() {
        example = silniaR.silnia(4);
        assertEquals(24, example, "Expected value: 24" + " Actual value: " + example);

    }

    @Test
    @DisplayName("Test for 1!")
    public void testSilniaR2() {
        example = silniaR.silnia(1);
        assertEquals(1, example, "Expected value: 1" + " Actual value: " + example);

    }

    @Test
    @DisplayName("Test for 0!")
    public void testSilniaR3() {
        example = silniaR.silnia(0);
        assertEquals(1, example, "Expected value: 1" + " Actual value: " + example);

     }

}
