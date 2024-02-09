package NovApiBatch.NovApi;

import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class PostMethodUsingOrgJson {
	
	public static void main(String[] args) {
		
		//When Handling the Complex Json with outer and inner json objects: Firstly we handle the Innermost Jsons as its a part of its immediate Outer JSon only
		
				
		
		JSONObject innermostjs = new JSONObject();
		innermostjs.put("Diebetes", "No");
		innermostjs.put("Height", "6 feet");
		innermostjs.put("Medicare", "YES");
		
		    JSONObject innerjs = new JSONObject();
				innerjs.put("ward no.", "123");
				innerjs.put("house no.", "ABC");
				innerjs.put("Area Code", "123456");
				innerjs.put("Landmark.", "Church");
				innerjs.put("Medical History", innermostjs);
				//like the way shown above we can create many inner json objects and thus handling them from innermost to the outermost objects.
		
		JSONObject outerjs =new JSONObject();
		//This is Simple Json but afterwards we added the innerjs for dealing with complex json
		outerjs.put("firstName", "Ankush12");
		outerjs.put("lastName", "Vijiji");
		outerjs.put("ID", "Anku12");
		outerjs.put("designation", "Sr.Lead");
		outerjs.put("Address", innerjs);
		
		System.out.println(outerjs.toString());
		
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(outerjs.toString())
		.when()
		.post("http://localhost:3000/ApiBatchStudents");
		
		System.out.println("Response Code is "+res.statusCode());
		System.out.println("Response Data is "+res.asPrettyString());
		
		
		
		
		
	}

}
