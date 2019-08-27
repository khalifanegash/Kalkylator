package se.utb_Khalifa;

import org.junit.Assert;
import org.junit.Test;

public class testKalkylator {
    @Test
    public void testAddtion(){
        int number1 = 9;
        int number2 = 3;
        int result = 12;
        Assert.assertEquals(result,Kalkylator.addetion(number1,number2));
    }
    @Test
    public void testSubtraction(){
        int number1 = 9;
        int number2 = 3;
        int result =  6;
        Assert.assertEquals(result,Kalkylator.substraction(number1,number2));

    }
    @Test
    public void testMultiplication(){
        int number1 = 9;
        int number2 = 3;
        int result  = 27;
        Assert.assertEquals(result,Kalkylator.multiplication(number1,number2));
    }
    @Test
    public void testDivision(){
        double number1 = 9;
        double number2 =3;
        double result = 3;
        Assert.assertEquals(result,Kalkylator.division(number1,number2),0);
    }
}
