package pl.sda.spring;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pl.sda.spring.exception.DivisionByZeroException;
import pl.sda.spring.operation.OperationType;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class})
public class CalculatorTest {

    @Autowired
    private Calculator calculator;

    @Test
    public void shouldReturnFiveForGivenArgumentsOnAdditionOperation() {
        //given
        double arg1 = 2.0;
        double arg2 = 3.0;

        //when
        double actual = calculator.calculate(OperationType.ADDITION, arg1, arg2);

        //then
        Assert.assertEquals(5.0, actual, 0.00000001);
    }
    @Test
    public void shouldReturnFiveForGivenArgumentsOnSupportedOperation() {
        //given
        double arg1 = 10.0;
        double arg2 = 5.0;

        //when
        double actual = calculator.calculate(OperationType.SUBTRACTION, arg1, arg2);

        //then
        Assert.assertEquals(5.0, actual, 0.00000001);
    }
    @Test
    public void shouldReturnFiftyFiveForGivenArgumentsOnMultiplicationOperation() {
        //given
        double arg1 = 11.0;
        double arg2 = 5.0;

        //when
        double actual = calculator.calculate(OperationType.MULTIPLICATION, arg1, arg2);

        //then
        Assert.assertEquals(55.0, actual, 0.00000001);
    }
    @Test
    public void shouldReturnFiveForGivenArgumentsOnDivisionOperation() {
        //given
        double arg1 = 55.0;
        double arg2 = 11.0;

        //when
        double actual = calculator.calculate(OperationType.DIVISION, arg1, arg2);

        //then
        Assert.assertEquals(5.0, actual, 0.00000001);
    }
    @Test(expected = DivisionByZeroException.class)
    public void shouldDivisionByZero(){
        //given
        double arg1 = 55.0;
        double arg2 = 0.0;

        //when
        double actual = calculator.calculate(OperationType.DIVISION, arg1, arg2);

        //then
        Assert.assertEquals(5.0, actual, 0.00000001);

    }
    @Test
    public void shouldReturnFivePercentForGivenArgumentsOnDivisionOperation() {
        //given
        double arg1 = 100.0;
        double arg2 = 5.0;

        //when
        double actual = calculator.calculate(OperationType.PERCENT, arg1, arg2);

        //then
        Assert.assertEquals(5.0, actual, 0.00000001);
    }
    @Test
    public void shouldReturnTwentyFiveForGivenArgumentsOnPowerOperation() {
        //given
        double arg1 = 5.0;
        double arg2 = 2.0;

        //when
        double actual = calculator.calculate(OperationType.POWER, arg1, arg2);

        //then
        Assert.assertEquals(25.0, actual, 0.00000001);
    }
}
