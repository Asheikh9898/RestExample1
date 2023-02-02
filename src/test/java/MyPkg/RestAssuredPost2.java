package MyPkg;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class RestAssuredPost2 {
	// Build the request
	//hit request and get response
	//validate response
	
	public static void main (String args[])
	{
		// Build the request
		RequestSpecification requestspecification = RestAssured.given();
		requestspecification.log().all();
		requestspecification.baseUri("https://restful-booker.herokuapp.com/");
		requestspecification.basePath("booking");
		requestspecification.body("{\r\n"
				+ "    \"firstname\" : \"Ajim\",\r\n"
				+ "    \"lastname\" : \"Sheikh\",\r\n"
				+ "    \"totalprice\" : 400,\r\n"
				+ "    \"depositpaid\" : false,\r\n"
				+ "    \"bookingdates\" : {\r\n"
				+ "        \"checkin\" : \"2021-01-01\",\r\n"
				+ "        \"checkout\" : \"2021-01-01\"\r\n"
				+ "    },\r\n"
				+ "    \"additionalneeds\" : \"Launch\"\r\n"
				+ "}");
		requestspecification.contentType("application/json");
		
		//Hit request and get response
		Response response= requestspecification.post();
		
		
		//validate response
		ValidatableResponse validatableresponse = response.then();
		validatableresponse.statusCode(200);
		String myresponse =response.statusLine();
		System.out.println("Myresponse is : \n" +myresponse);
		
		
	}

}
