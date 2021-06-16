package dealerservice;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import dealerserviceDAO.Crops;



@Repository
public interface CropRepo extends MongoRepository<Crops,String> {

}
