package RestAssured;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class BaseTest {
    @BeforeEach
    public void setup(){
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com/";
    }
    @Test
    public void getRequest(){
        given().when().get("/posts")
                .then().statusCode(200);
    }
    @Test
    public void getRequestTest(){
        given().when().get("/posts/1")
                .then().statusCode(200).body("userId", equalTo(1)).body("title",equalTo("sunt aut facere repellat provident occaecati excepturi optio reprehenderit"));
    }
    @Test
    public void postRequest(){
        String json = """
                {
                		"userId": 1,
                		"id": 1,
                		"title": "TEST",
                		"body": "TEST2"
                	}
                """;
        given().body(json).contentType(ContentType.JSON).post("/posts").then().statusCode(201).body("body", equalTo("TEST2"));
    }
    @AfterEach
    @Test
    public void putRequest(){
        String json = """
                {
                		"userId": 1,
                		"id": 1,
                		"title": "BOOK",
                		"body": "TEST2"
                	}
                """;
        given().log().all().body(json).contentType(ContentType.JSON).put("/posts/1").then().log().all().statusCode(200).body("title", equalTo("BOOK"));
    }
    @Test
    public void getAllRequest(){
        given().when().get("/posts").then().statusCode(200).log().all().body("title[0]",equalTo("sunt aut facere repellat provident occaecati excepturi optio reprehenderit"));
    }
}

