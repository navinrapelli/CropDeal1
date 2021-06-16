package adminserviceDAO;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;




@Document(collection="Admin")
public class Admin {

	@Id
	private  String id;
	private String adminemail;
	private String adminpassword;
	public Admin() {
		
	}
	public Admin(String id, String adminemail, String adminpassword) {
	
		this.id = id;
		this.adminemail = adminemail;
		this.adminpassword = adminpassword;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAdminemail() {
		return adminemail;
	}
	public void setAdminemail(String adminemail) {
		this.adminemail = adminemail;
	}
	public String getAdminpassword() {
		return adminpassword;
	}
	public void setAdminpassword(String adminpassword) {
		this.adminpassword = adminpassword;
	}
	@Override
	public String toString() {
		return "Admin [id=" + id + ", adminemail=" + adminemail + ", adminpassword=" + adminpassword + "]";
	}
	
	

}
