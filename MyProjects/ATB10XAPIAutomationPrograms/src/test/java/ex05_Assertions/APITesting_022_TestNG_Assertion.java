package ex05_Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class APITesting_022_TestNG_Assertion {
    //Hard Assertion
    @Test
    public void hard_Assertion_Example() {
        System.out.println("Start the program");
        Assert.assertEquals("Pramod", "Pramod");
        System.out.println("End of the program");
    }


    //Soft Assertion
    @Test
    public void soft_Assertion_Example() {

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertAll();
    }
}

