//package com.diagnisticcenter.controllers;
//
//import java.math.BigDecimal;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.diagnisticcenter.dto.Packagedto;
////import com.diagnisticcenter.dto.PackaPackageDto;
//import com.diagnisticcenter.service.PackageService;
//import com.diagnisticcenter.entity.Package;
//
//@CrossOrigin("*")
//@RestController
//@RequestMapping("/packages")
//public class PackageController {
//
//	@Autowired
//	private PackageService packageservice;
//	
//	
//	@PostMapping("/package/add-service")
//	public ResponseEntity<Package> addServiceToPackage(@RequestBody Packagedto request) {
//	    int packageId = request.getPackageId();
//	    int serviceId = request.getServiceId();
//	    Package updatedPackage = packageservice.addServiceToPackage(packageId, serviceId);
//	    return ResponseEntity.ok(updatedPackage);
//	}
//
//	
//	
////	@PostMapping("/createPackage")
////	public ResponseEntity<?> addServiceToPackageForUser(@RequestBody Packagedto request) {
////	    int userId = request.getUserId();
////	    int packageId = request.getPackageId();
////	    String serviceName = request.getServiceName();
////	    BigDecimal servicePrice = request.getServicePrice();
////	    
////	    // Call service method to add service to package
////	    packageservice.addServiceToPackageForUser(userId, packageId, serviceName, servicePrice);
////	    
////	    // Return success response
////	    return ResponseEntity.ok().build();
////	}
//	
//	
////	@PostMapping("/createPackage")
////    public ResponseEntity<?> createPackage(@RequestBody Packagedto packageDto) {
////        packageservice.createPackage(packageDto);
////        return ResponseEntity.ok().build();
////    }
//
//	
//}
