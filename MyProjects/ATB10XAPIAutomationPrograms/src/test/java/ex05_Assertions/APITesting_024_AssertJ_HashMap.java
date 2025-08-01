package ex05_Assertions;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import java.util.LinkedHashMap;
import java.util.Map;

public class APITesting_024_AssertJ_HashMap {

    RequestSpecification requestSpecification;
    ValidatableResponse validatableResponse;
    Response response;
    String token;
    Integer bookingId;

    @Test
    public void test_POST() {
//
//        String payload_POST = "{\n" +
//                "    \"firstname\" : \"Jim\",\n" +
//                "    \"lastname\" : \"Brown\",\n" +
//                "    \"totalprice\" : 111,\n" +
//                "    \"depositpaid\" : true,\n" +
//                "    \"bookingdates\" : {\n" +
//                "        \"checkin\" : \"2018-01-01\",\n" +
//                "        \"checkout\" : \"2019-01-01\"\n" +
//                "    },\n" +
//                "    \"additionalneeds\" : \"Breakfast\"\n" +
//                "}";
        Map<String, Object> jSonBodyUsingMap = new LinkedHashMap<>();
        jSonBodyUsingMap.put("firstname","Sheetal");
        jSonBodyUsingMap.put("lastname","Jagotra");
        jSonBodyUsingMap.put("totalprice","123");
        jSonBodyUsingMap.put("depositpaid","false");

        Map<String, Object>bookingDatesMap = new LinkedHashMap<>();
        bookingDatesMap.put("checkin","2018-03-01");
        bookingDatesMap.put("checkout","2018-03-03");

        jSonBodyUsingMap.put("bookingdates",bookingDatesMap);
        jSonBodyUsingMap.put("additionalneeds","Breakfast");
        System.out.println(jSonBodyUsingMap);
    }
}