package ex05_Assertions;

import Manual_Pojo.Booking;
import Manual_Pojo.Bookingdates;
import com.google.gson.Gson;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting_025_Payload_Gson {

    RequestSpecification requestSpecification;
    ValidatableResponse validatableResponse;
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

        // example of request using gson
        Gson gson = new Gson();
        String jsonBooking = gson.toJson(booking);
        System.out.println(jsonBooking);

        //  example of response using gson
        String jsonInput = "{"
                + "\"firstname\":\"sheetal\","
                + "\"lastname\":\"jagotra\","
                + "\"totalprice\":2500,"
                + "\"depositpaid\":false,"
                + "\"bookingdates\":{"
                + "\"checkin\":\"2015-12-08\","
                + "\"checkout\":\"2025-12-12\""
                + "},"
                + "\"additionalneeds\":\"Breakfast\""
                + "}";
        Booking output = gson.fromJson(jsonInput, Booking.class);
        System.out.println(output.getFirstname());


    }
}
