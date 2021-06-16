package farmerservice;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import farmerserviceDAO.Farmer;


@Repository
public interface FarmerRepo extends MongoRepository<Farmer,String>{


     Farmer findByFarmeremail(String farmeremail);

	

}
