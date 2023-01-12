import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class test1 {

    @Test
    void shouldReturnBody(){
        // Given - When - Then
// Предусловия
        given()
                .baseUri("https://postman-echo.com")
                .body("name") // отправляемые данные (заголовки и query можно выставлять аналогично)
// Выполняемые действия
                .when()
                .post("/post")
// Проверки
                .then()
                .statusCode(404)
                .body("data", equalTo("name"))
        ;
    }
}
