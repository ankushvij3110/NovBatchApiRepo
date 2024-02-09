package NovApiBatch.NovApi;

import static io.restassured.RestAssured.*;

import java.util.Set;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ParsingTC1 {
	
	public static void main(String[] args) {
		
		Response res=
		given()
		.contentType(ContentType.JSON)
		.when()
		.get("https://dummy.restapiexample.com/api/v1/employees");
//		.get("http://localhost:3000/ApiBatchStudents"); ?? This is not Working
		
		System.out.println("Response Code is "+res.statusCode());
		System.out.println("Response Data is "+res.asPrettyString());
		
		//as the complete data in json is starting from an Object then start with jsonobject and store the "res" in jsonobject
		
		JSONObject js=new JSONObject(res.asString()); //here we stored the res in the jsonobject as that has the whole of the json
    //1. Now if we want to extract the id from the 0th object which is inside the Array[] and then within the Object{}. so we will 
		//store in array and then inside the object like :
		
		//JSONArray j= js.getJSONArray("ApiBatchStudents");?? This is not Working
		JSONArray j= js.getJSONArray("data");
		
		JSONObject jobject =j.getJSONObject(0);
		//System.out.println(jobject.toString());
		System.out.println("The Employee Name is : "+jobject.get("employee_name"));
		
	//2. Now extracting all the ids values from this Json Array stored in j above, hence we will use the For Loop:
		
	int L=j.length(); //and saving it in L
	for(int i=0;i<L;i=i+1) { 
		
		JSONObject jj=j.getJSONObject(i);
		System.out.println("The"+i+" Id is : "+jj.get("id"));
	}
	
	//3. Now extracting all the keys values of 0th object from this Json Array stored in j above, hence we will use the For Loop:
	
	JSONObject jo=j.getJSONObject(0);
	Set<String> allKeys= jo.keySet();
	
	//For-each loop does not need: initialisation, increment decrement and condition check. 
	//use the for-each loop when you want to loop through all the values in an array or list. 
	 for(String s:allKeys) {
		 
		 System.out.println("Key Name is "+s);
		 System.out.println("Value is "+ jo.get(s));
		 
	 }
	
		//4. Now extracting all the Objects from the Array we can put a For loop on For-Each loop like this :
	 
	 for( int i=0;i<L;i=i+1) {
	 JSONObject jobj=j.getJSONObject(i); //just storing in a different variable name in order to remove duplicacy
		Set<String> allKeys1= jobj.keySet();
		
		 for(String s:allKeys1) {
			 
			 System.out.println("Key Name is "+s);
			 System.out.println("Value is "+ jobj.get(s));
			 
		 }
	 
	 }
			 
		 }
	 
	}


