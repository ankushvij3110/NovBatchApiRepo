package NovApiBatch.NovApi;

import static io.restassured.RestAssured.given;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostMethodWithArrayJsonUsingOrgJson {
	
	public static void main(String[] args) {
		//creating same heirachical inner jsons by keeping them under one outer object having Address array
		
		JSONObject innerjs1 = new JSONObject();
		innerjs1.put("ward no.", "123");
		innerjs1.put("house no.", "ABC");
		innerjs1.put("Area Code", "123456");
		innerjs1.put("Landmark.", "Church");
		innerjs1.put("Type", "Primary Address");
		
		JSONObject innerjs2 = new JSONObject();
		innerjs2.put("ward no.", "12354454");
		innerjs2.put("house no.", "ABCdfd");
		innerjs2.put("Area Code", "123456dfdgdg");
		innerjs2.put("Landmark.", "Churchhhhh");
		innerjs2.put("Type", "Secondary Address");
		
		
		JSONArray arr= new JSONArray(); //as both the above inner objects are part of json Array we will create this Array object
		arr.put(0,innerjs1);
		arr.put(1,innerjs2);
		
		JSONObject outerjs =new JSONObject();
		outerjs.put("firstName", "Nikhil");
		outerjs.put("lastName", "Duggal");
		outerjs.put("ID", "Nik");
		outerjs.put("designation", "Sr.Manager");
		outerjs.put("Address", arr);
		
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
