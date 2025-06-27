package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import requests.GetBookingDetails;
import requests.GetBookingId;

public class BookingIdsTest {
    @Test
    public  void testAnyBookingId(){
        int bookingId= GetBookingId.getBookingId();
        System.out.println("Retrived Booking Id is :"+bookingId);
        Assert.assertTrue(bookingId>0,"Invalid Booking id");
    }


}
