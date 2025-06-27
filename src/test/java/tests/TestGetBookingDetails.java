package tests;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import requests.GetBookingDetails;
import requests.GetBookingId;

public class TestGetBookingDetails{

    @Test
    public  void testBookingDetailsById(){
        int bookingid= GetBookingId.getBookingId();
        System.out.println("Using the BookingID: "+bookingid);
        Response response= GetBookingDetails.getBookingInfo(bookingid);
        Assert.assertEquals(response.getStatusCode(),200);
        System.out.println(response.asPrettyString());

    }
}
