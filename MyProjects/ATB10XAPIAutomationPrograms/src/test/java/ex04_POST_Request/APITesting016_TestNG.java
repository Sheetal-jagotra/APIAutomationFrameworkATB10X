package ex04_POST_Request;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class APITesting016_TestNG {
    @Test(priority = 3)
    public void getToken() {
        System.out.println("1");
    }

    @Test(priority = 2)
    public void getBookingId() {
        System.out.println("2");
    }

    @Test(priority = 1)
    public void test_Put() {
        System.out.println("3");
    }

    @Test(priority = 4)
    public void closeAllThings() {
        System.out.println("close");
    }
}