package com.diagnisticcenter.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.diagnisticcenter.dto.Servicesdatadto;
import com.diagnisticcenter.entity.Services;
import com.diagnisticcenter.service.MyServices;

@CrossOrigin("*")
@RestController
@RequestMapping("/myservices")
public class MyServicesController {

	@Autowired
	private MyServices myserv;
	
	@PostMapping("/updateservice")
	private String updateService(@RequestBody Servicesdatadto service)
	{
		if(myserv.addServices(service))
		
		return "Success";
		else
			return "problem in data entered";
	}
	
	@PutMapping("/updateprice")
	public ResponseEntity<String> updateServicePrice(@RequestBody Servicesdatadto request) {
		if (myserv.updateServicePrice(request.getServiceId(), request.getServiceprice())) {
			return ResponseEntity.ok("Service price updated successfully");
		} else {
			return ResponseEntity.badRequest().body("Service with ID " + request.getServiceId() + " not found");
		}
	}
	
	@GetMapping("/getallservices")
    public List<Services> getAllServicesForUser(@RequestBody Map<String, String> request) {
        String userEmail = request.get("uemail");
        return myserv.getAllServicesForUser(userEmail);
    }
	
	@PostMapping("/multiservices")
	public ResponseEntity<String> addServicesForUser(@RequestBody List<Servicesdatadto> servicesList) {
	    if (myserv.addmulServices(servicesList)) {
	        return ResponseEntity.ok("Services added successfully.");
	    } else {
	        return ResponseEntity.badRequest().body("Unable to add services.");
	    }
	}
	
//	@PostMapping("/getServices")
//    public List<Services> getAllServicesForUser(@RequestBody String userEmail) {
//        return myServices.getAllServicesForUser(userEmail);
//    }
//	

}
