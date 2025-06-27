package base;

import config.ConfigReader;
import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;

public class TestBase {
    @BeforeClass
    public void  setUp(){
        RestAssured.baseURI= ConfigReader.get("baseURI");
    }
}
