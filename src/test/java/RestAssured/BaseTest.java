package RestAssured;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.Validatable;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.maxim.Posts;

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
        RequestSpecification request = given().log().all();
        ResponseSpecification responsespec = given().then().statusCode(200);
        ValidatableResponse response = given().spec(request).get("/posts/1").then().spec(responsespec);
        response.body("userId", equalTo(1)).body("title",equalTo("sunt aut facere repellat provident occaecati excepturi optio reprehenderit"));
//        given().when().get("/posts/1")
//                .then().statusCode(200).body("userId", equalTo(1)).body("title",equalTo("sunt aut facere repellat provident occaecati excepturi optio reprehenderit"));
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
        RequestSpecification request = given().contentType(ContentType.JSON).body(json);
        ResponseSpecification responsespec = given().then().statusCode(201).body("body",equalTo("TEST2"));
        ValidatableResponse response =  given().spec(request).post("/posts").then().spec(responsespec); //.then().statusCode(201).body("body", equalTo("TEST2"));


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
        RequestSpecification request = given().log().all();
        ResponseSpecification responsespec = given().then().statusCode(200).body("title[0]",equalTo("sunt aut facere repellat provident occaecati excepturi optio reprehenderit"));
        ValidatableResponse response = given().spec(request).get("/posts").then().spec(responsespec);
        response.body("title[0]",equalTo("sunt aut facere repellat provident occaecati excepturi optio reprehenderit"));
        //given().when().get("/posts").then().statusCode(200).log().all().body("title[0]",equalTo("sunt aut facere repellat provident occaecati excepturi optio reprehenderit"));
    }
    @Test
    public void test() throws JsonProcessingException {
//        given().when().get("https://jsonplaceholder.typicode.com/posts").then().statusCode(200);


//        String json = """
//                {
//                  "id": 1,
//                  "title": "test",
//                  "body": "test",
//                  "userId": 1
//                }
//                """;

        ObjectMapper objectMapper = new ObjectMapper();

        Posts posts = new Posts( 1,1, "test", "test");
        String json = objectMapper.writeValueAsString(posts);
        Posts fromJson = objectMapper.readValue(json, Posts.class);
        System.out.println(fromJson);

        System.out.println(json);

        RequestSpecification requestSpec = given().
                baseUri("https://jsonplaceholder.typicode.com/posts")
                .request()
                .contentType(ContentType.JSON)
                .body(json);

        ResponseSpecification responseSpec = given()
                .response()
                .statusCode(201)
                .body("id", equalTo(101))
                .body("title", equalTo("test"));

        Response validatableResponse = given()
                .spec(requestSpec)
                .when()
                .post("https://jsonplaceholder.typicode.com/posts");

        validatableResponse.then().spec(responseSpec)
                .body("body", equalTo("test"));
//                .statusCode(201)
//                .body("id", equalTo(101))
//                .body("title", equalTo("test"));
    }
}