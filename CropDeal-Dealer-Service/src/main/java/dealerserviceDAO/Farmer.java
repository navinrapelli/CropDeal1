package dealerserviceDAO;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="Farmer")
public class Farmer {
	
	@Id
	private String id;
	private String farmer_name;
	private String farmer_email;
	private String farmer_password;
	private long farmer_contact_no;
	private Address farmer_address;
	private BankDetails farmer_bank_deatils;

	
	public Farmer() {
	
		// TODO Auto-generated constructor stub
	}

	public Farmer(String id, String farmer_name, String farmer_email, String farmer_password, long farmer_contact_no,
			Address farmer_address, BankDetails farmer_bank_deatils) {
		
		this.id = id;
		this.farmer_name = farmer_name;
		this.farmer_email = farmer_email;
		this.farmer_password = farmer_password;
		this.farmer_contact_no = farmer_contact_no;
		this.farmer_address = farmer_address;
		this.farmer_bank_deatils = farmer_bank_deatils;
		
		
	
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFarmer_name() {
		return farmer_name;
	}

	public void setFarmer_name(String farmer_name) {
		this.farmer_name = farmer_name;
	}

	public String getFarmer_email() {
		return farmer_email;
	}

	public void setFarmer_email(String farmer_email) {
		this.farmer_email = farmer_email;
	}

	public String getFarmer_password() {
		return farmer_password;
	}

	public void setFarmer_password(String farmer_password) {
		this.farmer_password = farmer_password;
	}

	public long getFarmer_contact_no() {
		return farmer_contact_no;
	}

	public void setFarmer_contact_no(long farmer_contact_no) {
		this.farmer_contact_no = farmer_contact_no;
	}

	public Address getFarmer_address() {
		return farmer_address;
	}

	public void setFarmer_address(Address farmer_address) {
		this.farmer_address = farmer_address;
	}

	public BankDetails getFarmer_bank_deatils() {
		return farmer_bank_deatils;
	}

	public void setFarmer_bank_deatils(BankDetails farmer_bank_deatils) {
		this.farmer_bank_deatils = farmer_bank_deatils;
	}

	/*public Receipt getFarmer_receipts() {
		return farmer_receipts;
	}

	public void setFarmer_receipts(Receipt farmer_receipts) {
		this.farmer_receipts = farmer_receipts;
	}*/

	@Override
	public String toString() {
		return "Farmer [id=" + id + ", farmer_name=" + farmer_name + ", farmer_email=" + farmer_email
				+ ", farmer_password=" + farmer_password + ", farmer_contact_no=" + farmer_contact_no
				+ ", farmer_address=" + farmer_address + "]";
	}
	
	

	
	
	
}
