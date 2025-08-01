package ex05_Assertions;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;

public class APITesting_021_RestAssured_Assertion {

    RequestSpecification requestSpecification;
    ValidatableResponse validatableResponse;
    Response response;
    String token;
    Integer bookingId;


    public void test_POST(){

        String payload_POST = "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";
        requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com");
        requestSpecification.basePath("/auth");
        requestSpecification.contentType(".JSON");
        requestSpecification.body(payload_POST);

        response = requestSpecification.when().log().all().post();

        validatableResponse = response.then().log().all().statusCode(200);
        validatableResponse.body("username", Matchers.equalTo("admin"));
        validatableResponse.body("password", Matchers.equalTo("password123"));
    }
}
