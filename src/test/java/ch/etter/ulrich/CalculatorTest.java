package ch.etter.ulrich;

import junit.framework.Assert;
import org.junit.Test;

public class CalculatorTest {
    private Calculator sut = new Calculator();

    @Test
    public void testAdd() throws Exception {
        Assert.assertEquals(17, sut.add(8, 9));
    }

    @Test
    public void testSubtract() throws Exception {
        Assert.assertEquals(47, sut.subtract(53, 6));
    }

    @Test
    public void testMultiply() throws Exception {
        Assert.assertEquals(49, sut.multiply(7, 7));
    }

    @Test
    public void testDivide() throws Exception {
<<<<<<< HEAD
        Assert.assertEquals(9, sut.divide(81, 9));
=======
        Assert.assertEquals(8, sut.divide(56, 7));
>>>>>>> a6a785f4ce02f5fd461cb650d5fb4b330aaa50f7
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() throws Exception {
        sut.divide(49, 0);
    }

    @Test
    public void testFac() throws Exception {
        Assert.assertEquals(120, sut.fac(5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFacOfNegativeNumber() throws Exception {
        sut.fac(-5);
    }
}
