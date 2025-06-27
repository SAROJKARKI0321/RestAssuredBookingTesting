package requests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import utils.EndPoints;

import java.util.List;
import java.util.Map;

public class GetBookingId {


    public static int getBookingId(){

        Response response= RestAssured.given()
                .baseUri(EndPoints.baseURI)
                .when()
                .get(EndPoints.GET_ALL_BOOKING_IDS);

        if(response.statusCode() !=200){
            System.out.println("Failed to fetch BookingIds");
        }

        List<Map<String,Integer>> allBookings=response.jsonPath().getList("");
        if(allBookings.isEmpty()){
            System.out.println("No Booking id found");
        }

        int firstBookingId= allBookings.get(0).get("bookingid");
        return firstBookingId;




    }

}
