package restapitest;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class restApitests {

	@Test
	public void restapi1()
	{
		
		given().
		when().
			get("https://reqres.in/api/users?page=2").
		then().statusCode(200).
			body("data.id[1]",equalTo(8)).
			body("data.first_name",hasItems("Michael","Lindsay")).
			assertThat().body("data.id[1]",equalTo(8)).
			log().all();
		
		Response response = get("https://reqres.in/api/users?page=2");
		System.out.println(response.getBody());
	}
}
