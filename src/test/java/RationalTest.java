import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RationalTest {
    Rational r1;
    Rational r2;

    /***
     * This method will be called every time before the other @Test method
     * is called.
     */
    @Before
    public void createRationals() {
        System.out.println("Initializing the two Rational numbers.");
        r1 = new Rational();
        r2 = new Rational();
    }

    /***
     * For this test case, we want to check the add() method
     * by calculating the summation of 1/2 and 1/4.
     * The expected result must be 3/4.
     */
    @Test
    public void testAdd() {
        r1.numerator = 1;     // r1 = 1/2
        r1.denominator = 2;
        r2.numerator = 1;      // r2 =  1/4
        r2.denominator = 4;
        r1.add(r2);
        Assert.assertEquals(3, r1.numerator);
        Assert.assertEquals(4, r1.denominator);
    }

    @Test
    public void testSubstract() {
        r1.numerator = 1;            // r1 = 1/2
        r1.denominator = 2;
        r2.numerator = 1;       // r2 = 1/4
        r2.denominator = 4;
        r1.subtract(r2);       // 1/2 - 1/4   = 2/4 - 1/4 = 1/4
        Assert.assertEquals(1, r1.numerator);
        Assert.assertEquals(4, r1.denominator);
    }

    @Test
    public void testMultiply() {
        r1.numerator = 6;            // r1 = 6/5
        r1.denominator = 5;
        r2.numerator = 4;       //  r2 = 4/3
        r2.denominator = 3;
        r1.multiply(r2);       // 6/5 x 4/3 = 24/15 = 8/5
        Assert.assertEquals(8, r1.numerator);
        Assert.assertEquals(5, r1.denominator);
    }

    @Test
    public void testDevide() {
        r1.numerator = 6;            // r1 = 6/4
        r1.denominator = 4;
        r2.numerator = 3;       //  r2 = 3/2
        r2.denominator = 2;
        r1.divide(r2);       // 6/4 / 3/2 = 6/4 x 2/3 = 12/12 = 1/1
        Assert.assertEquals(1, r1.numerator);
        Assert.assertEquals(1, r1.denominator);
    }

    /***
     * This method will be called every time after the other @Test method
     * is called.
     */
    @After
    public void clearUp() {
        System.out.println("Clear up the two Rational numbers.");
        r1 = null;
        r2 = null;
    }
}
