package dealerservice;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import dealerserviceDAO.Dealer;

@Repository
public interface DealerRepo extends MongoRepository<Dealer,String> {
	
    Dealer findByDealeremail(String dealeremail);


}
