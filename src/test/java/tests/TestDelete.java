package tests;

import io.restassured.response.Response;
import org.testng.ITestContext;
import org.testng.annotations.Test;
import requests.DeleteBooking;

public class TestDelete {

    @Test
    public void deleteBookings(ITestContext context){
        String id= (String) context.getAttribute("id");
        Response response= DeleteBooking.delete(id);
        response.then().statusCode(201);
        System.out.println("Deleted Booking with id :"+ id);

    }
}
