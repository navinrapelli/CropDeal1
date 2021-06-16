package adminserviceService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import adminservice.AdminRepo;
import adminservice.CropRepo;
import adminserviceDAO.Admin;
import adminserviceDAO.Crops;

public class AdminService {

	
	
	@Autowired
	private AdminRepo repository1;
	
	public List<Admin> Getall() {
		List<Admin> admin=new ArrayList();
		repository1.findAll()
		.forEach(admin::add);
		return admin;
	}
	
	
	

	public Admin getone(String id) {
		return repository1.findById(id).get();
	}

	public Admin addone(Admin admin) {
		           
		return repository1.save(admin);
		
	}

	public void update(String id, Admin admin) {
		repository1.save(admin);
		
	}

	public void delete(String id) {
		repository1.deleteById(id);
		
	}
	
}
