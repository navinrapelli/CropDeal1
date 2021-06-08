package farmerserviceDAO;

public class BankDetails {
	
	private String account_number;
	private String bank_name;
	private String ifsc_code;
	public BankDetails() {
	
		// TODO Auto-generated constructor stub
	}
	public BankDetails(String account_number, String bank_name, String ifsc_code) {
	
		this.account_number = account_number;
		this.bank_name = bank_name;
		this.ifsc_code = ifsc_code;
	}
	public String getAccount_number() {
		return account_number;
	}
	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}
	public String getBank_name() {
		return bank_name;
	}
	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}
	public String getIfsc_code() {
		return ifsc_code;
	}
	public void setIfsc_code(String ifsc_code) {
		this.ifsc_code = ifsc_code;
	}
	@Override
	public String toString() {
		return "BankDetails [account_number=" + account_number + ", bank_name=" + bank_name + ", ifsc_code=" + ifsc_code
				+ "]";
	}
	
	

}
