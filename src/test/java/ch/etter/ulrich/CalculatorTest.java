package ch.etter.ulrich;

import junit.framework.Assert;
import org.junit.Test;

public class CalculatorTest {
    private Calculator sut = new Calculator();

    @Test
    public void testAdd() throws Exception {
        Assert.assertEquals(2, sut.add(1, 1));
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
        Assert.assertEquals(8, sut.divide(56, 7));
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
