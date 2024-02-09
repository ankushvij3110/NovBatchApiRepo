package NovApiBatch.NovApi;

public class BasicInformation {
	
	//here we will create all the keys of the json as private Class variables
	
	private String firstName;
	private String lastName;
	private String id;
	private String designation;
	//Then we will create the getter and setter methods from Source>Generate Getter and setters
	
	//Now for complex json handling adding the private class type reference variable of address class as Address is the part of BasicInformation class, refer the objects displayed in Notepad++ notes
	
	private AddressInformation address;
	 
	private AddressInformation[] addressArr; // this array declaration is for array json handling through POJO class
	
	
	public AddressInformation[] getAddressArr() {
		return addressArr;
	}
	public void setAddressArr(AddressInformation[] addressArr) {
		this.addressArr = addressArr;
	}
	public String getFirstName() {
		return firstName;
	}

	public AddressInformation getAddress() {
		 return address;
		 } 
	 
	 public void setAddress(AddressInformation address) {
		 this.address = address;
		 }
	 
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
	
	

}
