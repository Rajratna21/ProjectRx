package com.diagnisticcenter.controllers;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




import com.diagnisticcenter.service.PackageService;
import com.diagnisticcenter.dto.PackageDto;
import com.diagnisticcenter.dto.Servicesdatadto;
import com.diagnisticcenter.entity.Package;
import com.diagnisticcenter.entity.Services;
import com.diagnisticcenter.entity.UserInfo;
import com.diagnisticcenter.repository.MyServicesRepo;
import com.diagnisticcenter.repository.PackageRepository;
import com.diagnisticcenter.repository.UserRepository;

@CrossOrigin("*")
@RestController
@RequestMapping("/packages")
public class PackageController {

	@Autowired
	private PackageService packageservice;
	
	
	@Autowired
	private MyServicesRepo servicesRepository;
	
	@Autowired
	private PackageRepository packageRepository;
	
	@Autowired
	private UserRepository userRepository;
//	@PostMapping("/createpackage")
//	public ResponseEntity<String> createPackage(@RequestBody PackageDto packageDTO, @RequestBody Servicesdatadto servicesDTO) {
//	    Package pkg = new Package();
//	    pkg.setName(packageDTO.getPackageName());
//	    //pkg.setDescription(packageDTO.getDescription());
//	    pkg.setPrice(packageDTO.getPackagePrice());
//
//	    Set<Services> services = new HashSet<>();
//	    Services service = new Services();
//	    service.setServiceId(servicesDTO.getServiceId());
//	    service.setServiceName(servicesDTO.getServiceName());
//	    service.setServicePrice(servicesDTO.getServiceprice());
//	    services.add(service);
//
//	    pkg.setServices(services);
//	    packageRepository.save(pkg);
//
//	    return ResponseEntity.ok("Package created successfully");
//	}

//	@PostMapping("/createpackage")
//	public ResponseEntity<String> createPackage(@RequestBody PackageDto packageDTO) {
//	    // Create a new Package entity with the provided data
//	    Package pkg = new Package();
//	    pkg.setName(packageDTO.getPackageName());
//	    pkg.setPrice(packageDTO.getPackagePrice());
//
//	    // Set the user_id for the Package entity
//	    UserInfo user = userRepository.getOne(packageDTO.getUserId());
//	    pkg.setUser(user);
//
//	    // Create a new PackageService entity for each service in the package
//	    Set<PackageService> packageServices = new HashSet<>();
//	    for (Servicesdatadto serviceData : packageDTO.getServicesData()) {
//	        PackageService packageService = new PackageService();
//
//	        // Get the Service entity with the provided serviceId
//	        Services service = servicesRepository.getOne(serviceData.getServiceId());
//
//	        // Set the Service entity and Package entity for the PackageService entity
//	        packageService.setService(service);
//	        packageService.setPackage(pkg);
//
//	        // Add the PackageService entity to the set of packageServices
//	        packageServices.add(packageService);
//	    }
//
//	    // Set the set of packageServices for the Package entity
//	    pkg.setPackageServices(packageServices);
//
//	    // Save the Package entity and its associated PackageService entities to the database
//	    packageRepository.save(pkg);
//
//	    return ResponseEntity.ok("Package created successfully");
//	}

	
}
