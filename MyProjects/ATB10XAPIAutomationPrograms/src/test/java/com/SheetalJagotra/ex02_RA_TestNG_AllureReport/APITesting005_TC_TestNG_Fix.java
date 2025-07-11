package com.SheetalJagotra.ex02_RA_TestNG_AllureReport;
import io.restassured.RestAssured;
import jdk.jfr.Description;
import org.testng.annotations.Test;
import org.testng.annotations.TestInstance;

public class APITesting005_TC_TestNG_Fix {

    @Test
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
    @Test
    public void test_GET_Negative_TC2(){
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/-1")
                .when()
                .get()
                .then()
                .log().all().statusCode(200);
    }
    @Test
    public void test_GET_Negative_TC3(){
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
