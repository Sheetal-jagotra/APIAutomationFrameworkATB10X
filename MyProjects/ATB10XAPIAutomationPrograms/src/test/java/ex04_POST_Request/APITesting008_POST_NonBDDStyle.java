package ex04_POST_Request;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import jdk.jfr.Description;
import org.testng.annotations.Test;

public class APITesting008_POST_NonBDDStyle {

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;
    String payload = "{\n" +
            "    \"username\" : \"admin\",\n" +
            "    \"password\" : \"password123\"\n" +
            "}";
    @Test
    public void test_POST_NonBDDStyle(){
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/auth");
        r.contentType(".JSON");
        r.body(payload);

        response = r.when().log().all().post();

        vr = response.then().log().all().statusCode(200);

    }

}
