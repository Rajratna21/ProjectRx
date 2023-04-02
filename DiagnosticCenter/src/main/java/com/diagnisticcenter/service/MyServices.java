package com.diagnisticcenter.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diagnisticcenter.dto.Servicesdatadto;
import com.diagnisticcenter.entity.Services;
import com.diagnisticcenter.entity.UserInfo;
import com.diagnisticcenter.repository.MyServicesRepo;
import com.diagnisticcenter.repository.UserRepository;
@Service
public class MyServices {

	@Autowired
	private MyServicesRepo myrepo;
	
	
	@Autowired
	private UserRepository urepo;
	
	public boolean addServices(Servicesdatadto service)
	{
	
		String email=service.getUemail();
		UserInfo user= urepo.findByEmailId(email);
		if(user==null)
		{
			return false;
		}
		Services serv=new Services();
		serv.setServiceName(service.getServiceName());
		serv.setUsers(user);
		myrepo.save(serv);
		
		return true;
	}
	
	public boolean updateServicePrice(int serviceId, BigDecimal price) {
		Optional<Services> serviceOpt = myrepo.findById(serviceId);
		
		if (serviceOpt.isPresent()) {
			Services service = serviceOpt.get();
			service.setServicePrice(price);
			myrepo.save(service);
			return true;
		}
		
		return false;
	}
	
	public List<Services> getAllServicesForUser(String userEmail) {
        UserInfo user = urepo.findByEmailId(userEmail);
        return myrepo.findByUsers(user);
    }
	
	
	public boolean addmulServices(List<Servicesdatadto> services) {
	    try {
	        for (Servicesdatadto service : services) {
	            String email = service.getUemail();
	            UserInfo user = urepo.findByEmailId(email);
	            Services serv = new Services();
	            serv.setUsers(user);
	            serv.setServiceName(service.getServiceName());
	            serv.setServicePrice(service.getServiceprice());
	            myrepo.save(serv);
	        }
	        return true;
	    } catch (Exception e) {
	        e.printStackTrace();
	        return false;
	    }
	}


//	public List<Servicesdatadto> getAllServicesWithPricesForUser(String userEmail) {
//	    UserInfo user = urepo.findByEmailId(userEmail);
//	    List<Services> services = myrepo.findByUsers(user);
//	    List<Servicesdatadto> servicesDataList = new ArrayList();
//	    for (Services service : services) {
//	        Servicesdatadto serviceData = new Servicesdatadto();
//	        serviceData.setServiceName(service.getServiceName());
//	        serviceData.setServiceprice(service.getServicePrice());
//	        serviceData.setUemail(userEmail);
//	        servicesDataList.add(serviceData);
//	    }
//	    return servicesDataList;
//	}

	
}
