package adminservice;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import adminserviceDAO.Crops;



@Repository
public interface CropRepo extends MongoRepository<Crops,String> {

}
