package ex04_POST_Request;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class APITesting015_All_Annotations {
    @BeforeTest
    public void getToken(){
        System.out.println("1");
    }
    @BeforeTest
    public void getBookingId(){
        System.out.println("2");
    }
    @Test
    public void test_Put(){
        System.out.println("3");
    }
    @AfterTest
    public void closeAllThings(){
        System.out.println("close");
    }

}
