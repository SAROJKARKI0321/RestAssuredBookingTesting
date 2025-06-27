package requests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import utils.EndPoints;

public class GetBookingDetails {


    public static Response  getBookingInfo(int bookingId){
         return  RestAssured.given()
                .baseUri(EndPoints.baseURI)
                .when()
                .get(EndPoints.GET_BOOKING+bookingId);


    }


}
