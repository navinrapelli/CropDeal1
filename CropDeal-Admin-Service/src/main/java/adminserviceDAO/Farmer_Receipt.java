package adminserviceDAO;

public class Farmer_Receipt {
	
	
	private String crop_name;
	private int quantity;
	private String date;
	private String payment_method;
	private long selling_price;
	private String total;
	private String buyar;
	public Farmer_Receipt() {
	
	}
	public Farmer_Receipt(String crop_name, int quantity, String date, String payment_method, long selling_price, String total,
			String buyar) {
	
		this.crop_name = crop_name;
		this.quantity = quantity;
		this.date = date;
		this.payment_method = payment_method;
		this.selling_price = selling_price;
		this.total = total;
		this.buyar = buyar;
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
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getPayment_method() {
		return payment_method;
	}
	public void setPayment_method(String payment_method) {
		this.payment_method = payment_method;
	}
	public long getSelling_price() {
		return selling_price;
	}
	public void setSelling_price(long selling_price) {
		this.selling_price = selling_price;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	public String getBuyar() {
		return buyar;
	}
	public void setBuyar(String buyar) {
		this.buyar = buyar;
	}
	@Override
	public String toString() {
		return "Receipt [crop_name=" + crop_name + ", quantity=" + quantity + ", date=" + date + ", payment_method="
				+ payment_method + ", selling_price=" + selling_price + ", total=" + total + ", buyar=" + buyar + "]";
	}
	
	
	
	
	
	
	
	

}
