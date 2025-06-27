package tests;

import com.fasterxml.jackson.core.JsonProcessingException;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.Test;
import requests.CreateBooking;
import requests.GetBookingDetails;

public class testCreateBooking {
    @Test
    public  void testCreateBooking(ITestContext context) throws JsonProcessingException {
        Response response= CreateBooking.createnewBooking();
        Assert.assertEquals(response.statusCode(),200);
        String bookingId=response.jsonPath().getString("bookingid");
        System.out.println("Your Booking has been created with the id: "+bookingId);
        context.setAttribute("id",bookingId);
        Response res=GetBookingDetails.getBookingInfo(Integer.parseInt(bookingId));
        System.out.println(res.asPrettyString());


    }
}
