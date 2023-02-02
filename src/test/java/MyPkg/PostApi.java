package MyPkg;

import org.json.simple.JSONObject;
import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
@Test
public class PostApi {
	
	public void PostApiAutomation()
	{
		RestAssured.baseURI = "https://reqres.in/api/users";
		RequestSpecification http = RestAssured.given();
		JSONObject inputbody = new JSONObject();
		inputbody.put("name", "morpheus");
		inputbody.put("job", "leader");
		http.header("Content-Type", "application/json");
		http.body(inputbody.toJSONString(inputbody));
		Response response = http.request(Method.POST, "/users");
		String responseobj =response.getBody().asString();
		System.out.println("my response is : \n" + responseobj);
		int statuscode = response.getStatusCode();
		Assert.assertEquals(statuscode, 201);
		String statusline = response.getStatusLine();
		System.out.println("My statusline is : \n" +statusline);
		
		
		
	}

}
