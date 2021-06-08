package dealerserviceService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dealerservice.DealerRepo;
import dealerserviceDAO.Dealer;


@Service
public class DealerService {
	
	
	@Autowired
	private DealerRepo repository1;

	public List<Dealer> Getall() {
		List<Dealer> dealer=new ArrayList();
		repository1.findAll()
		.forEach(dealer::add);
		return dealer;
	}
	
	
	
	

	public Optional<Dealer> getone(String id) {
		return repository1.findById(id);
	}

	public void addone(Dealer dealer) {
		repository1.save(dealer);
		
	}

	public void update(String id, Dealer dealer) {
		repository1.save(dealer);
		
	}

	public void delete(String id) {
		repository1.deleteById(id);
		
	}






}
