package com.SheetalJagotra.asserts;

import com.beust.jcommander.StringKey;
import io.restassured.response.Response;


import java.security.KeyException;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.testng.Assert.assertEquals;

public class AssertionActions {

    public void verifyResponseBody(String actual, String expected, String description) {
        assertEquals(actual, expected, description);
    }

    public void verifyResponseBody(int actual, int expected, int description) {
        assertEquals(actual, expected, description);
    }

    public void verifyStatusCode(Response response, Integer expected) {
        assertEquals(response.getStatusCode(), expected);
    }
    public void verifyStringKey(String KeyExpected , StringKey KeyActual) {
        //Assert J

      assertThat(KeyExpected).isNotNull();
      assertThat(KeyExpected).isNotEmpty();


    }
    public void verifyStringKeyNotNull(String KeyExpect){
        assertThat(KeyExpect).isNotNull();
    }

    public static  AssertionActions getInstance(){
        return new AssertionActions();
    }


}
