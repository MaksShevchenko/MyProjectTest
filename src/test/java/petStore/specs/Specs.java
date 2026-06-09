package petStore.specs;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.http.ContentType.JSON;

public class Specs {
    public static RequestSpecification requestSpec(){
        return new RequestSpecBuilder()
                .setBaseUri("https://petstore.swagger.io/v2")
                .setContentType(JSON)
                .setAccept(JSON)
                .log(LogDetail.METHOD)
                .log(LogDetail.URI)
                .log(LogDetail.BODY)
                .build();
    }
    public static ResponseSpecification responseSpec (int statusCode){
        return new ResponseSpecBuilder()
                .expectStatusCode(statusCode)
                .expectContentType(JSON)
                .log(LogDetail.BODY)
                .build();
    }

}
