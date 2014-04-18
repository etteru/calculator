package ch.etter.ulrich;

import junit.framework.Assert;
import org.junit.Test;

public class CalculatorTest {
    private Calculator sut = new Calculator();

    @Test
    public void testAdd() throws Exception {
        Assert.assertEquals(7, sut.add(3, 4));
    }

    @Test
    public void testSubtract() throws Exception {
        Assert.assertEquals(4, sut.subtract(10, 6));
    }

    @Test
    public void testMultiply() throws Exception {
        Assert.assertEquals(48, sut.multiply(6, 8));
    }

    @Test
    public void testDivide() throws Exception {
        Assert.assertEquals(7, sut.divide(49, 7));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() throws Exception {
        sut.divide(49, 0);
    }
}
