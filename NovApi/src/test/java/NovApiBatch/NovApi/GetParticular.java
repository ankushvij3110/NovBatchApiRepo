package NovApiBatch.NovApi;

import static io.restassured.RestAssured.*;


import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GetParticular {
	
	public static void main(String[] args) {
		
		Response res=
		given()
		.contentType(ContentType.JSON)
		.when()
		.get("http://localhost:3000/PerformanceBatchStudents/?firstName=Aanya2&lastName=Malik");
		System.out.println("This is the Response Code "+res.statusCode());
		System.out.println("This is the Response Body "+res.body().asPrettyString());
		
		
	}

}
