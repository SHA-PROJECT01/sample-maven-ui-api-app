package api;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;

public class HelloApiTest {

  @Test
  public void testHelloApi() {
    RestAssured.get("http://localhost:8080/api/hello")
               .then()
               .statusCode(200)
               .body(equalTo("Hello from API!"));
  }
}