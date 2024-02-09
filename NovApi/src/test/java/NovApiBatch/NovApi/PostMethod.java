package NovApiBatch.NovApi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class PostMethod{
	//This is the Json File Approach of RequestBody creation.And it is the best approach of all.as large data can be simply put in the json file without creating large data one by one as we do with other two approaches.
	
	//creating the connection with the RequestBody.json file through File class in Java
	
	public static void main(String[] args) throws FileNotFoundException {
		File f=new File("../NovApi/RequestBody.json"); //This makes the connection with the file, we should always add path and not Location of this file because locations change.
		//now we need to add a library ie. org.json through maven dependency in Pom.xml. Location is the absolute/complete path but path was the relative path which starts with "..".
		
		FileReader fr=new FileReader(f);
		JSONTokener j=new JSONTokener(fr);//used for reading the eclipse Json File ie RequestBOdy.json.
		//in above we notice that json tokener is dependent on filereader and filereader is dependent on file
		
		//Now as in the RequestBody.json file(this file gets created through Eclipse in our system itself) our data is in object notation format ie. {}, so hence will then create a Json Object here.
		
	JSONObject js=new JSONObject(j);
	
	System.out.println(js.toString());//we will use this data in our POST request that we are reading from file REquestBOdy.json in Eclipse.
	
	Response res=
	given()
	.contentType(ContentType.JSON)
	.body(js.toString())
	.when()
	.post("http://localhost:3000/PerformanceBatchStudents");
	
	System.out.println("Response Code is "+res.statusCode());
	System.out.println("Response Body is "+res.toString());
	}
	


}
