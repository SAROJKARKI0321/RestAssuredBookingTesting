package requests;

import core.TokenManager;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import utils.EndPoints;

public class DeleteBooking {

    public static Response delete(String id){


        Response response= RestAssured.given()
                .baseUri(EndPoints.baseURI)
                .contentType(ContentType.JSON)
                .header("Cookie","token="+ TokenManager.generateToken())

                .when()
                .delete(EndPoints.DELETE_BOOKING+id);

        return  response;


    }




}
