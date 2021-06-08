package adminserviceDAO;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="Dealer")
public class Dealer {
	
	@Id
	private String id;
	
	private String dealer_name;
	private String dealer_email;
	private String dealer_password;
	private long dealer_contact_no;
	//SubCrop dealer_sub_crop_deatils;
	private Dealer_BankDetails dealer_bank_deatils;
	//Invoice dealer_invoice;

	
	public Dealer() {
	
		// TODO Auto-generated constructor stub
	}
	public Dealer(String id, String dealer_name, String dealer_email, String dealer_password, long dealer_contact_no,
			Dealer_BankDetails dealer_bank_deatils) {
		
		this.id = id;
		this.dealer_name = dealer_name;
		this.dealer_email = dealer_email;
		this.dealer_password = dealer_password;
		this.dealer_contact_no = dealer_contact_no;
		this.dealer_bank_deatils = dealer_bank_deatils;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDealer_name() {
		return dealer_name;
	}
	public void setDealer_name(String dealer_name) {
		this.dealer_name = dealer_name;
	}
	public String getDealer_email() {
		return dealer_email;
	}
	public void setDealer_email(String dealer_email) {
		this.dealer_email = dealer_email;
	}
	public String getDealer_password() {
		return dealer_password;
	}
	public void setDealer_password(String dealer_password) {
		this.dealer_password = dealer_password;
	}
	public long getDealer_contact_no() {
		return dealer_contact_no;
	}
	public void setDealer_contact_no(long dealer_contact_no) {
		this.dealer_contact_no = dealer_contact_no;
	}
	public Dealer_BankDetails getDealer_bank_deatils() {
		return dealer_bank_deatils;
	}
	public void setDealer_bank_deatils(Dealer_BankDetails dealer_bank_deatils) {
		this.dealer_bank_deatils = dealer_bank_deatils;
	}
	@Override
	public String toString() {
		return "Dealer [id=" + id + ", dealer_name=" + dealer_name + ", dealer_email=" + dealer_email
				+ ", dealer_password=" + dealer_password + ", dealer_contact_no=" + dealer_contact_no
				+ ", dealer_bank_deatils=" + dealer_bank_deatils + "]";
	}


	

	
	
	
}
