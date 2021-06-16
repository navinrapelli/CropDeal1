package dealerserviceDAO;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="Crops")
public class Crops {
	
	@Id
	private String id;
	private String crop_name;
	private int quantity;
	private long selling_price;
	private long total;
	private String uplodedby;
	private String sellername;

	private Address address;
	public Crops() {
		
	}
	public Crops(String id, String crop_name, int quantity, long selling_price, long total, String uplodedby,
			String sellername, Address address) {

		this.id = id;
		this.crop_name = crop_name;
		this.quantity = quantity;
		this.selling_price = selling_price;
		this.total = total;
		this.uplodedby = uplodedby;
		this.address = address;
		this.sellername=sellername;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCrop_name() {
		return crop_name;
	}
	public void setCrop_name(String crop_name) {
		this.crop_name = crop_name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public long getSelling_price() {
		return selling_price;
	}
	public void setSelling_price(long selling_price) {
		this.selling_price = selling_price;
	}
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public String getUplodedby() {
		return uplodedby;
	}
	public void setUplodedby(String uplodedby) {
		this.uplodedby = uplodedby;
	}
	public String getSellername() {
		return sellername;
	}
	public void setSellername(String sellername) {
		this.sellername = sellername;
	}
	
	public Address getLocation() {
		return address;
	}
	public void setLocation(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Crops [id=" + id + ", crop_name=" + crop_name + ", quantity=" + quantity + ", selling_price="
				+ selling_price + ", total=" + total + ", uplodedby=" + uplodedby + ", address=" + address + "]";
	}
	
	
	
	


	

}
