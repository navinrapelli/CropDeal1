package dealerservice;

import org.springframework.data.mongodb.repository.MongoRepository;

import dealerserviceDAO.Dealer;

public interface DealerRepo extends MongoRepository<Dealer,String> {

}
