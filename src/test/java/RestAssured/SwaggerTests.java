package RestAssured;

import groovyjarjarantlr4.v4.codegen.model.SrcOp;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;

public class SwaggerTests {
        @BeforeEach
        public void setup(){
            RestAssured.baseURI = "https://petstore.swagger.io";
        }
        @Test
        public void postRequest(){
            String json = """
                    {
                      "id": 0,
                      "category": {
                        "id": 0,
                        "name": "string"
                      },
                      "name": "doggie",
                      "photoUrls": [
                        "string"
                      ],
                      "tags": [
                        {
                          "id": 0,
                          "name": "string"
                        }
                      ],
                      "status": "available"
                    }
                """;
            given().body(json).contentType(ContentType.JSON).post("/v2/pet").then().statusCode(200).body("name", equalTo("doggie"));
        }
        @Test
        public void putRequest(){
            String json = """
                    {
                      "id": 0,
                      "category": {
                        "id": 0,
                        "name": "string"
                      },
                      "name": "doggie",
                      "photoUrls": [
                        "string"
                      ],
                      "tags": [
                        {
                          "id": 0,
                          "name": "string"
                        }
                      ],
                      "status": "available"
                    }""";
            given().body(json).contentType(ContentType.JSON).put("/v2/pet").then().statusCode(200);
        }
        @Test
        public void getStatusRequest(){
            given().when().get("v2/pet/findByStatus?status=available").then().statusCode(200);
            given().when().get("v2/pet/findByStatus?status=pending").then().statusCode(200);
            given().when().get("v2/pet/findByStatus?status=sold").then().statusCode(200);
        }
        @Test
        public void getPetId(){
            given().when().get("/v2/pet/2").then().statusCode(200).body("name", equalTo("doggie"));
        }
        @Test
        public void postPetId(){
            String json = """
                    {
                          "code": 200,
                          "type": "unknown",
                          "message": "1"
                        }
                """;
            given().when().get("/v2/pet/2").then().statusCode(200);
        }
        @Test
        public void deletePet(){
            String json = """
                    {
                      "code": 200,
                      "type": "unknown",
                      "message": "1"
                    }
                    """;
            given().when().delete("/v2/pet/1").then().statusCode(404);
        }
    // --------------------STORE----------------------------------------------

    @Test
    public void getStore(){
            given().when().get("/v2/store/inventory").then().statusCode(200).log().all();
    }
    @Test
    public void postStore(){
            String json = """
                    {
                      "id": 0,
                      "petId": 0,
                      "quantity": 0,
                      "shipDate": "2026-04-09T07:00:24.224Z",
                      "status": "placed",
                      "complete": true
                    }""";
            given().body(json).contentType(ContentType.JSON).post("/v2/store/order")
                    .then().statusCode(200).log().all().body("petId",equalTo(0));
    }
    @Test
    public void getStoreOrder1(){
            given().when().get("/v2/store/order/1").then().statusCode(200).log().all();
    }
    @Test
    public void deleteStoreByOrder(){
            given().when().delete("/v2/store/order/1").then().statusCode(404);
    }
    //------------------------------USER--------------------------------------
    @Test
    public void postCreatedList(){
        String json = """
                [
                  {
                    "id": 0,
                    "username": "string",
                    "firstName": "string",
                    "lastName": "string",
                    "email": "string",
                    "password": "string",
                    "phone": "string",
                    "userStatus": 0
                  }
                ]""";
        given().body(json).contentType(ContentType.JSON).post("/v2/user/createWithList")
                .then().statusCode(200).log().all().body("code", equalTo(200));
    }
    @Test
    public void getUserName(){
            given().when().get("/v2/user/string")
                    .then().statusCode(200).log().all().body("username", equalTo("string"));
    }
    @Test
    public void putUserName(){
            String json = """
                    {
                      "id": 0,
                      "username": "string",
                      "firstName": "string",
                      "lastName": "string",
                      "email": "string",
                      "password": "string",
                      "phone": "string",
                      "userStatus": 0
                    }""";
            given().body(json).contentType(ContentType.JSON).put("/v2/user/string")
                    .then().statusCode(200).log().all();
    }
    @Test
    public void deleteUserName(){
            given().when().delete("/v2/user/string").then().statusCode(200);
    }
    @Test
    public void getLoginPassUser(){
//            given().when().get("/v2/user/login?username=string&password=string")
//                    .then().statusCode(200).log().all();
        String username = "admin";
        String password = "qwe";
        given()
                .queryParam("username",username)
                .queryParam("password", password)
                .accept(ContentType.JSON)
                .when().get("/v2/user/login").then().statusCode(200).log().all();
    }
    @Test
    public void getUserLogout(){
            given().when().get("/v2/user/logout").then().statusCode(200).log().all();
    }
    @Test
    public void postUserCreate(){
            String json = """
                    {
                      "id": 0,
                      "username": "string",
                      "firstName": "string",
                      "lastName": "string",
                      "email": "string",
                      "password": "string",
                      "phone": "string",
                      "userStatus": 0
                    }""";
            given().body(json).contentType(ContentType.JSON).post("/v2/user")
                    .then().statusCode(200).log().all()
                    .body("code", equalTo(200));
    }
}
