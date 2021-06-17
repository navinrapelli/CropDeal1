package paymentserviceDAO;

import java.io.Serializable;

public class MsgConfirm implements Serializable{
	
   private  String farmer_id;
   private String dealer_id;
   private String dealer_name;
   private long dealer_No;
   private String message;
    
	public MsgConfirm() {
	
		
	}
	
	

	public MsgConfirm(String farmer_id, String dealer_id, String dealer_name, long dealer_No, String message) {
	
		this.farmer_id = farmer_id;
		this.dealer_id = dealer_id;
		this.dealer_name = dealer_name;
		this.dealer_No = dealer_No;
		this.message = message;
	}



	public String getFarmer_id() {
		return farmer_id;
	}

	public void setFarmer_id(String farmer_id) {
		this.farmer_id = farmer_id;
	}

	public String getDealer_id() {
		return dealer_id;
	}

	public void setDealer_id(String dealer_id) {
		this.dealer_id = dealer_id;
	}

	public String getDealer_name() {
		return dealer_name;
	}

	public void setDealer_name(String dealer_name) {
		this.dealer_name = dealer_name;
	}

	public long getDealer_No() {
		return dealer_No;
	}

	public void setDealer_No(long dealer_No) {
		this.dealer_No = dealer_No;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}



	@Override
	public String toString() {
		return "MsgConfirm [farmer_id=" + farmer_id + ", dealer_id=" + dealer_id + ", dealer_name=" + dealer_name
				+ ", dealer_No=" + dealer_No + ", message=" + message + "]";
	}

	
    
    

    

}
