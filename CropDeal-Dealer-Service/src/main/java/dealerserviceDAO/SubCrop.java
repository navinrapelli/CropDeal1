package dealerserviceDAO;

public class SubCrop {

	String crop_name;
	String farmer_name;
	public SubCrop() {
		

	}
	
	
	public SubCrop(String crop_name, String farmer_name) {
		super();
		this.crop_name = crop_name;
		this.farmer_name = farmer_name;
	}


	public String getCrop_name() {
		return crop_name;
	}
	public void setCrop_name(String crop_name) {
		this.crop_name = crop_name;
	}
	public String getFarmer_name() {
		return farmer_name;
	}
	public void setFarmer_name(String farmer_name) {
		this.farmer_name = farmer_name;
	}


	@Override
	public String toString() {
		return "SubCrop [crop_name=" + crop_name + ", farmer_name=" + farmer_name + "]";
	}
	
	
}
