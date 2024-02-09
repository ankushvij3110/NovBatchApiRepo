package NovApiBatch.NovApi;

import static io.restassured.RestAssured.*;// we are importing all the static methods of this RestAssured 

import io.restassured.http.ContentType;
import io.restassured.response.Response;
//class by adding static keyword with .* 

public class GetAll {//we are not using the org.json, pojo or json file approaches in GetAll as in this method there is no need to create the Request Body data.
	public static void main(String[] args) {
		Response res = //here we are storing the response of the get() in this Response object namely "res" as the return type of 
				//get() is Response
		given() //before using these bdd methods we need to import the RestAssured library as displayed above ie. import static io.restassured.RestAssured.*;.
		.contentType(ContentType.JSON).
		when()
		.get("http://localhost:3000/SeleniumBatchStudents");
		System.out.println("Status Code is " + res.statusCode());
		System.out.println("Response Data is "+res.asString());
		
	}

}
