package NovApiBatch.NovApi;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostMethodUsingPOJOComplexJson {
	public static void main(String[] args) {
		//Now for complex jsons we need to handle the Inner jsons first and then subsequently moving out handling the outer ones one after the other.
		//thus handling the AddressInformation class first and then BAsicInformation as shown:
		
		AddressInformation address1=new AddressInformation();
		address1.setAreaCode("3234");
		address1.setHouseNo("jhfjhf");
		address1.setLandmark("Temple");
		address1.setWardNo("Syd001");
		
		
		BasicInformation basicInfo=new BasicInformation();//After this class's object creation we will set the values using setter method we generated in BasicInforamtion class
		basicInfo.setFirstName("Ankush32");
		basicInfo.setDesignation("CEO2");
		basicInfo.setId("Ank32");
		basicInfo.setLastName("Vij32");
		basicInfo.setAddress(address1);
		
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
