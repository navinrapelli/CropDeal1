package ProjectCropDealServerZuulDAO;

public class Address {
	
	private String street;
	private String state;
	private String city;
	private String pincode;
	public Address() {
	
		// TODO Auto-generated constructor stub
	}
	public Address(String street, String state, String city, String pincode) {
		
		this.street = street;
		this.state = state;
		this.city = city;
		this.pincode = pincode;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", state=" + state + ", city=" + city + ", pincode=" + pincode + "]";
	}
	
	
	

}
