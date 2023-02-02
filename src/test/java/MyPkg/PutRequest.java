package MyPkg;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class PutRequest {

	public static void main(String[] args) {
		
		RestAssured
		.given()
		.baseUri("https://restful-booker.herokuapp.com")
		.basePath("booking/1")
         .body("{\r\n"
         		+ "    \"firstname\" : \"Pramod\",\r\n"
         		+ "    \"lastname\" : \"Dutta\",\r\n"
         		+ "    \"totalprice\" : 2000,\r\n"
         		+ "    \"depositpaid\" : false,\r\n"
         		+ "    \"bookingdates\" : {\r\n"
         		+ "        \"checkin\" : \"2021-01-01\",\r\n"
         		+ "        \"checkout\" : \"2021-01-01\"\r\n"
         		+ "    },\r\n"
         		+ "    \"additionalneeds\" : \"Launch\"\r\n"
         		+ "}\r\n"
         		+ "")
       
		
		.contentType(ContentType.JSON)
		.header("Authorization", "Basic YWRtaW46cGFzc3dvcmQxMjM=")
		
		.when()
		      .put()
		.then()
		.log()
		.all()
		.assertThat()
		.statusCode(200);
		
	}

}

		
		
	
