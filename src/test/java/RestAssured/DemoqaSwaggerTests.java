package RestAssured;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class DemoqaSwaggerTests {
    @BeforeEach
    public void setup(){
        RestAssured.baseURI = "https://demoqa.com/Account";
    }
    @Test
    public void authorizedRequest(){
        String json = """
                    {
                      "userName": "string",
                      "password": "string"
                    }
                    """;
        given().log().all().body(json).contentType(ContentType.JSON).post("/v1/Authorized").
                then().statusCode(200);
    }
}
