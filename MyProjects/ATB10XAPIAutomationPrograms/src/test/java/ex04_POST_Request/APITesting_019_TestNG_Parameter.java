package ex04_POST_Request;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class APITesting_019_TestNG_Parameter {
    @Parameters("browser")
    @Test
    public void demo1(String value){
        System.out.println("Demo 1");

        if(value.equalsIgnoreCase("chrome")){
            System.out.println("Start the chrome Browser");
        }
        if(value.equalsIgnoreCase("firefox")){
            System.out.println("Start the firefox Browser");
        }
    }
}
