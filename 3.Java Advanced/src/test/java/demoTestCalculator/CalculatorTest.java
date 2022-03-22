package demoTestCalculator;

import OOP.L10UnitTesting.Lab.demoTestCalculator.Calculator;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testSumWithPositiveNumbers() {
        //Arrange
        Calculator calculator = new Calculator(1,2);

        //Act
        int sum = calculator.sum(5, 6);

        //Assert
        Assert.assertEquals(11, sum);
    }

    @Test
    public void testMultiplicationWithNegativeNumbers() {
        int result = Calculator.multiplier(-3, -3);
        assertEquals(9, result);
    }

    //this is for throwing exception expectations
    @Test(expected = IllegalStateException.class)
    public void testDoSMThMethodException() {
        Calculator calculator = new Calculator(1, 2);
        calculator.doSomething();
    }
}