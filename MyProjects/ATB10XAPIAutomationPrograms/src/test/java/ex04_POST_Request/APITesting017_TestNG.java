package ex04_POST_Request;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting017_TestNG {
    @Test(groups = { "reg","sanity"})
    public void test_SanityRun(){
        System.out.println("sanity");
        System.out.println("QA");
        Assert.assertTrue(true);
    }
    @Test(groups = {"sanity" ," P1"})
    public void test_regRun(){
        System.out.println("regression");
        Assert.assertFalse(false);

    }
    @Test(groups = {"sanity" ," reg"})
    public void test_smokeRun(){
        System.out.println("Smoke");
        Assert.assertFalse(false);

    }

}
