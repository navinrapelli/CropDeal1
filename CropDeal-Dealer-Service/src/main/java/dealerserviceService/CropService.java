package dealerserviceService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.sun.scenario.effect.Crop;

import dealerservice.CropRepo;
import dealerserviceDAO.Crops;



public class CropService {
	
	
	@Autowired
	private CropRepo repository1;

	public List<Crops> Getall() {
		List<Crops> crop=new ArrayList();
		repository1.findAll()
		.forEach(crop::add);
		return crop;
	}

	
	public Crops getone( String  id )
	{
		return repository1.findById(id).get();
		
		
	}

	
	

}
