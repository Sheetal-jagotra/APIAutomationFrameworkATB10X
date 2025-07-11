package com.SheetalJagotra.ex01_RA_Basics;

import io.restassured.RestAssured;

public class APITesting005_MultipleTestCases {
    public static void main(String[] args) {


        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/110059")
                .when()
                .get()
                .then()
                .log().all().statusCode(200);

        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/-1")
                .when()
                .get()
                .then()
                .log().all().statusCode(200);
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/@")
                .when()
                .get()
                .then()
                .log().all().statusCode(200);

    }
}
