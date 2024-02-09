package NovApiBatch.NovApi;

public class AddressInformation {
	
	private String wardNo;
	private String houseNo;
	private String areaCode;
	private String landmark;
	//after putting getters and setter methods navigate to the object,which is infact a class that we make, thus navigate to BasicInformation class to add a private class type variable
	
	public String getWardNo() {
		return wardNo;
	}
	public void setWardNo(String wardNo) {
		this.wardNo = wardNo;
	}
	public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public String getAreaCode() {
		return areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	
	

}
