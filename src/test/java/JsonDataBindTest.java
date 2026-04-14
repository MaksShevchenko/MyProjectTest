import org.junit.jupiter.api.Test;
import tools.jackson.databind.ObjectMapper;

public class JsonDataBindTest {
    ObjectMapper objectMapper = new ObjectMapper() {};
        @Test
        public void Test() {
            Post post = new Post("Vova", "qwe", 20);
            System.out.println(objectMapper.writeValueAsString(post));
            String json = """
                {
                		"userId": 1,
                		"id": 1,
                		"title": "TEST",
                		"body": "TEST2"
                	}
                """;
            Book book = objectMapper.readValue(json,Book.class);
            System.out.println(book.getId());
        }


}