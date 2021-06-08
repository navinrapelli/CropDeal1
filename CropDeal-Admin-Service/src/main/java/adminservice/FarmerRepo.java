package adminservice;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import adminserviceDAO.Farmer;


@Repository
public interface FarmerRepo extends MongoRepository<Farmer,String>{
	
	

}
