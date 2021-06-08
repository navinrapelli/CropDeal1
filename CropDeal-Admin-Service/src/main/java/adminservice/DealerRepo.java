package adminservice;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import adminserviceDAO.Dealer;

@Repository
public interface DealerRepo extends MongoRepository<Dealer,String> {

}
