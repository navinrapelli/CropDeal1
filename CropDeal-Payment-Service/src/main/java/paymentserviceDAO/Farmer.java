package paymentserviceDAO;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection="Farmer")
public class Farmer {
	
	@Id
	private String id;
	private String farmername;
	private String farmeremail;
	private String farmerpassword;
	private String Role;
	private long farmercontactno;
	private Address farmeraddress;
	private BankDetails farmerbankdeatils;
	private MsgConfirm  messages;
	

	public Farmer() {
	
		// TODO Auto-generated constructor stub
	}
	
	


	public Farmer(String id, String farmername, String farmeremail, String farmerpassword, String Role,
			long farmercontactno, Address farmeraddress, BankDetails farmerbankdeatils, MsgConfirm messages) {
		
		this.id = id;
		this.farmername = farmername;
		this.farmeremail = farmeremail;
		this.farmerpassword = farmerpassword;
		this.Role=Role;
		this.farmercontactno = farmercontactno;
		this.farmeraddress = farmeraddress;
		this.farmerbankdeatils = farmerbankdeatils;
		this.messages = messages;
	}




	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getFarmername() {
		return farmername;
	}


	public void setFarmername(String farmername) {
		this.farmername = farmername;
	}


	public String getFarmeremail() {
		return farmeremail;
	}


	public void setFarmeremail(String farmeremail) {
		this.farmeremail = farmeremail;
	}


	public String getFarmerpassword() {
		return farmerpassword;
	}


	public void setFarmerpassword(String farmerpassword) {
		this.farmerpassword = farmerpassword;
	}


	public String getRole() {
		return Role;
	}


	public void setRole(String role) {
		Role = role;
	}


	public long getFarmercontactno() {
		return farmercontactno;
	}


	public void setFarmercontactno(long farmercontactno) {
		this.farmercontactno = farmercontactno;
	}


	public Address getFarmeraddress() {
		return farmeraddress;
	}


	public void setFarmeraddress(Address farmeraddress) {
		this.farmeraddress = farmeraddress;
	}


	public BankDetails getFarmerbankdeatils() {
		return farmerbankdeatils;
	}


	public void setFarmerbankdeatils(BankDetails farmerbankdeatils) {
		this.farmerbankdeatils = farmerbankdeatils;
	}


	public MsgConfirm getMessages() {
		return messages;
	}


	public void setMessages(MsgConfirm messages) {
		this.messages = messages;
	}


	@Override
	public String toString() {
		return "Farmer [id=" + id + ", farmername=" + farmername + ", farmeremail=" + farmeremail + ", farmerpassword="
				+ farmerpassword + ", Role=" + Role + ", farmercontactno=" + farmercontactno + ", farmeraddress="
				+ farmeraddress + ", farmerbankdeatils=" + farmerbankdeatils + ", messages=" + messages + "]";
	}


}
