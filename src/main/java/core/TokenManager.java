package core;

import config.ConfigReader;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import utils.EndPoints;

public class TokenManager {

    public  static  String generateToken(){
        String username = ConfigReader.get("username");
        String password = ConfigReader.get("password");
        return RestAssured.given()
                .baseUri(ConfigReader.get("baseURI"))
                .contentType(ContentType.JSON)
                .body("{\n" +
                        "\"username\":\"" + username + "\",\n" +
                        "\"password\":\"" + password + "\"\n" +
                        "}")
                .when()
                .post(EndPoints.auth)
                .jsonPath().getString("token");











    }

}
