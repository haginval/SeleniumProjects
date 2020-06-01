package restapitest;



	import io.restassured.RestAssured;
	import io.restassured.http.ContentType;
	import io.restassured.parsing.Parser;
	import io.restassured.response.Response;

	import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
	
	public class RestTest extends BaseApi {

	 	@Test
	    public void validateapi()
	    {
		// TODO Auto-generated method stub
		Response response = doGetRequest("https://jsonplaceholder.typicode.com/users");
		
		System.out.println("Response code " +response.statusCode());
		 Assert.assertEquals(response.statusCode(), 200);
		 System.out.println("Response code " +response.statusCode());
				
        List<String> jsonResponse = response.jsonPath().getList("$");
        System.out.println(jsonResponse);
        //String usernames = response.jsonPath().getString("username");
        List <String> users = response.jsonPath().getList("username");
        List  ids = response.jsonPath().getList("id");
        System.out.println(ids);
        System.out.println(users);
        int s =users.size();
        System.out.println("Users length " + s);
        int s1 =ids.size();
        System.out.println("ids "+s1);
        System.out.println("user ids are ");
        
        System.out.println("user list is ");
        for ( int i=0;i<s;i++)
        {
        	System.out.println(users.get(i));
        }
       
        for ( int j=0;j<s1;j++)
        {
        	int idn = (Integer) ids.get(j);
        	if (idn >2)
        	{
        		System.out.println(idn);
        	}
        	
        }
		
        
       // System.out.println(users.size());
        System.out.println(jsonResponse.size());
    
		
	}

}
