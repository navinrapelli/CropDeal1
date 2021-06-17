package farmerserviceService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.sun.scenario.effect.Crop;

import farmerservice.CropRepo;
import farmerservice.FarmerController;
import farmerservice.FarmerRepo;
import farmerserviceDAO.Crops;
import farmerserviceDAO.Farmer;

public class CropService {
	
	@Autowired
	private FarmerController repo1;
	
	@Autowired
	private CropRepo repository1;

	public List<Crops> Getall() {
		List<Crops> crop=new ArrayList();
		repository1.findAll()
		.forEach(crop::add);
		return crop;
	}
	
	
	Farmer farmer=new Farmer();
	

	public List<Crops> getone(String farmid) {
		return repository1.findByUplodedby(farmid);
	}

	public Crops addone(Crops crop,String farmerid) {
		           
		 Farmer far =repo1.getonefarmer(farmerid);
		 crop.setUplodedby(far.getId());
		crop.setLocation(far.getFarmeraddress());
		crop.setSellername(far.getFarmername());
		return repository1.save(crop);
		
	}

	public void update(String id, Crops crop) {
	
            repository1.save(crop);
		
	}

	public void delete(String id) {
		repository1.deleteById(id);
		
	}


}
