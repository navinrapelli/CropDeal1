package farmerservice;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sun.scenario.effect.Crop;

import farmerserviceDAO.Crops;

@Repository
public interface CropRepo extends MongoRepository<Crops,String> {
	
	List<Crops> findByUplodedby(String uplodedby);

}
