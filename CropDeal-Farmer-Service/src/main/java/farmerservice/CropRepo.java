package farmerservice;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import farmerserviceDAO.Crops;

@Repository
public interface CropRepo extends MongoRepository<Crops,String> {

}
