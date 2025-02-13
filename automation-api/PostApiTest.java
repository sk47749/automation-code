import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.http.ContentType;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PostApiTest {

    @Test
    public void testPostApi() {
        // Set the base URI
        RestAssured.baseURI = "https://reqres.in/api/users"; // Replace with your API URL

        // Create JSON request body
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "Shahrukh");
        requestBody.put("job", "QA Engineer");

        // Perform POST request
        Response response = RestAssured
                .given()
                .contentType(ContentType.JSON)
                .body(requestBody.toString())
                .when()
                .post()
                .then()
                .statusCode(201)  // Assert that status code is 201 (Created)
                .extract().response();

        // Print response body
        System.out.println("Response Body: " + response.getBody().asString());

        // Validate response
        Assert.assertEquals(response.jsonPath().getString("name"), "Shahrukh");
        Assert.assertEquals(response.jsonPath().getString("job"), "QA Engineer");
    }
}
