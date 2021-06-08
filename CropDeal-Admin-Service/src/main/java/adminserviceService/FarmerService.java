package adminserviceService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import adminservice.FarmerRepo;
import adminserviceDAO.Farmer;




@Service
public class FarmerService {
	
	
	@Autowired
	private FarmerRepo repository1;

	public List<Farmer> Getall() {
		List<Farmer> farmer=new ArrayList();
		repository1.findAll()
		.forEach(farmer::add);
		return farmer;
	}
	
	
	
	

	public Optional<Farmer> getone(String id) {
		return repository1.findById(id);
	}

	public Farmer addone(Farmer farmer) {
		return repository1.save(farmer);
		
	}

	public void update(String id, Farmer farmer) {
		repository1.save(farmer);
		
	}

	public void delete(String id) {
		repository1.deleteById(id);
		
	}






}
