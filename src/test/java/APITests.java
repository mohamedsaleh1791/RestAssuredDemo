import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class APITests {
    @Test
    void test(){
        Response response= RestAssured.get("http://httpbin.org/json");
        System.out.println(response.statusCode());
    }
}
