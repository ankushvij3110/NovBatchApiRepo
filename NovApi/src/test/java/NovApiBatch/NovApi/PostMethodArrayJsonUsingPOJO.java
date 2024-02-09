package NovApiBatch.NovApi;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostMethodArrayJsonUsingPOJO {
	
	public static void main(String[] args) {
		
		
		AddressInformation[] address2=new AddressInformation[2];//as there are two objects we set the array length as 2
		address2[0]=new AddressInformation();
		address2[0].setAreaCode("3234434");
		address2[0].setHouseNo("jhfjhf5gf");
		address2[0].setLandmark("RamTemple");
		address2[0].setWardNo("SYD0012");

		address2[1]=new AddressInformation();
		address2[1].setAreaCode("3234434");
		address2[1].setHouseNo("jhfjhf5gf");
		address2[1].setLandmark("RamTemple");
		address2[1].setWardNo("SYD0012");
		
		
		BasicInformation basicInfo=new BasicInformation();//After this class's object creation we will set the values using setter method we generated in BasicInforamtion class
		basicInfo.setFirstName("Ankush324");
		basicInfo.setDesignation("CEO23");
		basicInfo.setId("Ank323");
		basicInfo.setLastName("Vij323");
		basicInfo.setAddressArr(address2);// we are calling the array method which we set in BasiInformation
		
		Response res =
		given()
		.contentType(ContentType.JSON)
		.body(basicInfo) //here it will use Getter methods internally
		.when()
		.post("http://localhost:3000/SeleniumBatchStudents");
		
		System.out.println("Response Code is "+res.statusCode());
		System.out.println("Response Data is "+res.asPrettyString());
		
		
		
	}

}
