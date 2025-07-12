package ex03_GEt_Request;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import jdk.jfr.Description;
import org.testng.annotations.Test;

public class APITesting007_GET_NonBDDStyle {

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;
    @Test
    @Description("Verify the valid testcase")
    public void test_NonBDD_Get(){
        String pincode = "110059";
        r= RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/"+pincode);

        response = r.when().log().all().get();

        vr = response.then().log().all().statusCode(200);
    }
    @Test
    @Description("Verify the invalid testcase")
    public void test_NonBDD_Get_Negative(){
        String pincode = "-1";
        r= RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/"+pincode);

        response = r.when().log().all().get();

        vr = response.then().log().all().statusCode(404);
    }
}
