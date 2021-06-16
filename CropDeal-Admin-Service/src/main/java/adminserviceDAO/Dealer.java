package adminserviceDAO;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="Dealer")
public class Dealer {
	
	@Id
	String id;
	
	String dealername;
	String dealeremail;
	String dealerpassword;
	long dealercontactno;
	private String Role;
    SubCrop dealersubcropdeatils;
	//BankDetails dealerbankdeatils;
	//Invoice dealer_invoice;

	
	public Dealer() {
	
	
	}
	public Dealer(String id, String dealername, String dealeremail, String dealerpassword, long dealercontactno,
			String role, SubCrop dealersubcropdeatils) {
		super();
		this.id = id;
		this.dealername = dealername;
		this.dealeremail = dealeremail;
		this.dealerpassword = dealerpassword;
		this.dealercontactno = dealercontactno;
		Role = role;
		this.dealersubcropdeatils = dealersubcropdeatils;
		//this.dealerbankdeatils = dealerbankdeatils;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDealername() {
		return dealername;
	}
	public void setDealername(String dealername) {
		this.dealername = dealername;
	}
	public String getDealeremail() {
		return dealeremail;
	}
	public void setDealeremail(String dealeremail) {
		this.dealeremail = dealeremail;
	}
	public String getDealerpassword() {
		return dealerpassword;
	}
	public void setDealerpassword(String dealerpassword) {
		this.dealerpassword = dealerpassword;
	}
	public long getDealercontactno() {
		return dealercontactno;
	}
	public void setDealercontactno(long dealercontactno) {
		this.dealercontactno = dealercontactno;
	}
	public String getRole() {
		return Role;
	}
	public void setRole(String role) {
		Role = role;
	}
	public SubCrop getDealersubcropdeatils() {
		return dealersubcropdeatils;
	}
	public void setDealersubcropdeatils(SubCrop dealersubcropdeatils) {
		this.dealersubcropdeatils = dealersubcropdeatils;
	}
	/*public BankDetails getDealerbankdeatils() {
		return dealerbankdeatils;
	}
	public void setDealerbankdeatils(BankDetails dealerbankdeatils) {
		this.dealerbankdeatils = dealerbankdeatils;
	}*/
	@Override
	public String toString() {
		return "Dealer [id=" + id + ", dealername=" + dealername + ", dealeremail=" + dealeremail + ", dealerpassword="
				+ dealerpassword + ", dealercontactno=" + dealercontactno + ", Role=" + Role + ", dealersubcropdeatils="
				+ dealersubcropdeatils + ","  + "]";
	}
	

	
	
	
}
