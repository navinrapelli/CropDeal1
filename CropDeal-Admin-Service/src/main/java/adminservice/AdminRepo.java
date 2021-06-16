package adminservice;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import adminserviceDAO.Admin;

@Repository
public interface AdminRepo extends MongoRepository <Admin,String> {

}
