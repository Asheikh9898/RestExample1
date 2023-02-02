package MyPkg;

import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
@Test
public class GetApi {
	
	public void GetApiAutomation()
	{
		
		
		RestAssured.baseURI = "https://reqres.in/api/users";
		RequestSpecification http = RestAssured.given();
		Response response = http.request(Method.GET, "/2");
		String responseObject = response.getBody().asString();
		System.out.println("My response is : \n" +responseObject);
		int statuscode = response.getStatusCode();
		Assert.assertEquals(statuscode, 200);
		
		String statusline = response.getStatusLine();
		System.out.println("My statusline is : \n" +statusline);
	}

}