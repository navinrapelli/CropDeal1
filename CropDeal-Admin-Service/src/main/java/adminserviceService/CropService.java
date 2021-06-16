package adminserviceService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.sun.scenario.effect.Crop;

import adminservice.CropRepo;
import adminserviceDAO.Crops;


public class CropService {
	
	
	@Autowired
	private CropRepo repository1;

	public List<Crops> Getall() {
		List<Crops> crop=new ArrayList();
		repository1.findAll()
		.forEach(crop::add);
		return crop;
	}
	
	
	

	public Optional<Crops> getone(String id) {
		return repository1.findById(id);
	}

	public Crops addone(Crops crop) {
		           
		return repository1.save(crop);
		
	}

	public void update(String id, Crops crop) {
		repository1.save(crop);
		
	}

	public void delete(String id) {
		repository1.deleteById(id);
		
	}


}
