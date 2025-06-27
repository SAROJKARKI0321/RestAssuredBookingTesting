package tests;

import POJO.Booking;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.equalTo;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.Test;
import requests.CreateBooking;
import requests.UpdateBooking;

public class TestUpdatedBooking {
    Booking updatedBooking= CreateBooking.createBookingData();


    @Test
    public  void testUpdate(ITestContext context){
        updatedBooking.setAdditionalneeds("Holy water and peace");
        updatedBooking.setFirstname("Jesus");
        updatedBooking.setLastname("Christ");
        String id=String.valueOf(context.getAttribute("id"));

        Response response= UpdateBooking.update(id,updatedBooking);
        response.then().
         statusCode(200)
        .assertThat()
                .body("firstname",equalTo("Jesus"));
        System.out.println(response.asPrettyString());




    }
}
