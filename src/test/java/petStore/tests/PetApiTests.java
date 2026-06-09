package petStore.tests;

import org.junit.jupiter.api.Test;
import petStore.dto.Category;
import petStore.dto.Pet;
import petStore.dto.Tag;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static io.restassured.RestAssured.given;
import static petStore.specs.Specs.requestSpec;

public class PetApiTests {
    @Test
    void shouldCreateNewPets(){
        Long petId = ThreadLocalRandom.current().nextLong(100_000,999_999);
        Pet requestPet = new Pet(petId, new Category(1L,"dogs"),"Rex", List.of("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSke8wGb06WBH0zzcwakpqWtXfzxjk9U3YUjg&s"),List.of(new Tag(1, "test")),"status");
        Pet createdPet = given().spec(requestSpec()).body(requestPet).when().post()
    }
}


//читать softly , библиотека Assert J