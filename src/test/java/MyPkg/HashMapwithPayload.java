package MyPkg;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;

public class HashMapwithPayload {

	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("firstname", "Ajim");
		map.put("lastname", "Sheikh");
		map.put("totalprice", "111");
		map.put("depositpaid", "true");
		map.put("checkin", "2018-01-01");
		map.put("checkout", "2019-01-01");
		map.put("additionalneeds", "Breakfast");
        System.out.println(map);
        JSONObject request = new JSONObject(map);
        System.out.println(request);

        
        
        
        
        
		
	}

}
