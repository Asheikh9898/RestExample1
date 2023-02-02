package MyPkg;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class PartialUpdate {

	public static void main(String[] args) {
		RestAssured
		.given()
		.baseUri("https://restful-booker.herokuapp.com")
		.basePath("booking/1")
         .body("{\r\n"
         		+ "    \"firstname\" : \"Ajim\",\r\n"
         		+ "    \"lastname\" : \"Sheikh\"\r\n"
         		+ "}")
		
		.contentType(ContentType.JSON)
		.header("Authorization", "Basic YWRtaW46cGFzc3dvcmQxMjM=")
		
		.when()
		      .patch()
		.then()
		.log()
		.all()
		.assertThat()
		.statusCode(200);
		
	}

}
