package NovApiBatch.NovApi;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostMethodUsingPOJO {
	public static void main(String[] args) {
		
		BasicInformation basicInfo=new BasicInformation();//After this we will set the values using setter method we generated in BasicInforamtion class
		basicInfo.setFirstName("Ankush311");
		basicInfo.setDesignation("CEO31");
		basicInfo.setId("Ank233");
		basicInfo.setLastName("Kapoor");
		
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(basicInfo) //here it will use Getter methods internally
		.when()
		.post("http://localhost:3000/SeleniumBatchStudents");
		
		System.out.println("Response Code is "+res.statusCode());
		System.out.println("Response Data is "+res.asPrettyString());
		
		
		
	}

}
