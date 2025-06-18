package com.SheetalJagotra.ex01_RA_Basics;

import io.restassured.RestAssured;

public class APITesting001 {
    public static void main(String[] args) {


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
