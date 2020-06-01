package restapitest;

import java.util.HashMap;
import java.util.Map;
import static io.restassured.RestAssured.*;
//import static io.restassured.*;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class restapiPostMethod {
	
	JSONObject request = new JSONObject();
	String requestfinal;
	
	@BeforeTest
	public void bodyData()
	{
		//JSONObject request = new JSONObject();
		request.put("name", "Raghav");
		request.put("job", "Teacher");
		requestfinal = request.toJSONString();
		System.out.println("Final Json Request is"+requestfinal);
		System.out.println("JsonRequest is "+request.toJSONString());
		RestAssured.baseURI="https://reqres.in/api/users";
	}
	
	@Test
	public void postMethodtest()
	{
		
		/*//Map<String, Object> map = new HashMap<String, Object>();
		 * map.put("Name","Raghu");
		JSONObject request = new JSONObject();
		request.put("name", "Raghav");
		request.put("job", "Teacher");
		String requestfinal = request.toJSONString();
		System.out.println("Final Json Request is"+requestfinal);
		System.out.println("JsonRequest is "+request.toJSONString());*/
		
		given().
			header("Content-Type", "application/json")
			.contentType(ContentType.JSON)
			.accept(ContentType.JSON).
			//body(request.toJSONString()).
			body(requestfinal).
			when().
			//post("https://reqres.in/api/users").
			post().
			then().statusCode(201).
			log().all();
		
	}

}
