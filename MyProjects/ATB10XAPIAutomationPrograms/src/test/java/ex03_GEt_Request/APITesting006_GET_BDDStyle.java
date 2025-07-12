package ex03_GEt_Request;

import io.restassured.RestAssured;

public class APITesting006_GET_BDDStyle {
    public void test_GET_Positive_TC1(){
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/110059")
                .when()
                .get()
                .then()
                .log().all().statusCode(200);

    }
}
