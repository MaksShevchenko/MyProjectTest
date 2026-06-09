package petStore.config;

import io.restassured.RestAssured;
import io.restassured.config.RestAssuredConfig;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.apiguardian.api.API;

import static io.restassured.RestAssured.config;
import static io.restassured.RestAssured.given;

public final class RestAssuredProvider {
    private RestAssuredProvider(){}
    public static RequestSpecification requestSpec(ApiConfig apiConfig){
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
        return given().baseUri(apiConfig.getBASE_URL()).contentType(ContentType.JSON).accept(ContentType.JSON).relaxedHTTPSValidation();
    }

}
