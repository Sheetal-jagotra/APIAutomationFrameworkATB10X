package ex05_Assertions;

import io.restassured.mapper.ObjectMapper;
import io.restassured.mapper.ObjectMapperDeserializationContext;
import io.restassured.mapper.ObjectMapperSerializationContext;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting_026_Payload_Jackson {
    RequestSpecification requestSpecification;
    ValidatableResponse validatableResponse;
    Response response;

    @Test
    public void test_Create_Booking_Positive(){
        Booking booking = new Booking();
        booking.setFirstname("sheetal");
        booking.setLastname("jagotra");
        booking.setTotalprice(2500);
        booking.setDepositpaid(false);

        Bookingdates bookingdates = new Bookingdates();
        bookingdates.setCheckin("2015-12-08");
        bookingdates.setCheckout("2025-12-12");
        booking.setBookingdates(bookingdates);
        booking.setAdditionalneeds("Breakfast");

        System.out.println(booking);

        ObjectMapper mapper = new ObjectMapper();
        String booking = mapper.writeValue(booking);
        System.out.println(booking);
        }
    }

