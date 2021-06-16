package farmerserviceService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;



import farmerservice.FarmerRepo;
import farmerservice.MsgConfig;
import farmerserviceDAO.Farmer;
import farmerserviceDAO.MsgConfirm;
import farmerserviceResourceNotFounExcep.ResourceNotFoundException;


@Service
@Component
public class FarmerService {
	
	
	@Autowired
	private FarmerRepo repository1;

	public List<Farmer> Getall() {
		List<Farmer> farmer=new ArrayList();
		repository1.findAll()
		.forEach(farmer::add);
		return farmer;
	}
	
	
	
	
    
	public Farmer getone(String id) {
		Farmer farmer=repository1.findById(id).orElseThrow(()->new ResourceNotFoundException("Farmer not exit with id:"+id));
		return farmer;
	}

	public Farmer addone(Farmer farmer) {
		return repository1.save(farmer);
		
	}

	public void update(String id, Farmer farmer) {
		repository1.save(farmer);
		
	}

	public void delete(String id) {
		repository1.deleteById(id);
		
	}

	/*public Farmer getFarmerr()
	{  
		String n="ashish28myakal@gmail.com";
		
		Farmer far=repository1.findByFarmeremail(n);
			
		System.out.println(far);
		return far;
	}*/
	
	
	
	  MsgConfirm con=new MsgConfirm();

		@RabbitListener(queues = MsgConfig.QUEUE)
		public void consumeMessageFromQ(MsgConfirm con)
		{    
			MsgConfirm farm=con;
			
			Farmer far=repository1.findById(farm.getFarmer_id()).get();
			
			far.setMessages(farm);
			       
			repository1.save(far);
		
			
			System.out.println(con);		
			
		}
	

		






}
