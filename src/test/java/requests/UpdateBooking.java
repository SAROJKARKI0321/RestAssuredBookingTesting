package requests;

import POJO.Booking;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import utils.EndPoints;
import  core.TokenManager;

public class UpdateBooking {

    public  static Response update(String id, Booking updatedBooking){





       Response response= RestAssured.given()
                .baseUri(EndPoints.baseURI)
                .contentType(ContentType.JSON)
                .header("Cookie","token="+TokenManager.generateToken())
                .body(updatedBooking)
                .when()
                .put(EndPoints.UPDATE_BOOKING+id);

       return  response;







    }


}
