//package com.diagnisticcenter.service;
//
//import java.math.BigDecimal;
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.diagnisticcenter.entity.Services;
//import com.diagnisticcenter.entity.UserInfo;
//import com.diagnisticcenter.repository.MyServicesRepo;
//import com.diagnisticcenter.repository.PackageRepository;
//import com.diagnisticcenter.repository.UserRepository;
//import com.diagnisticcenter.dto.Packagedto;
////import com.diagnisticcenter.dto.Packagedto.PackageDto;
//import com.diagnisticcenter.dto.Servicesdatadto;
//import com.diagnisticcenter.dto.UserNotFoundException;
//import com.diagnisticcenter.entity.Package;
//
//@Service
//public class PackageService {
//
//	@Autowired
//	private UserRepository userRepo;
//	
//	@Autowired
//	private PackageRepository packageRepository;
//	
//	@Autowired
//	private MyServicesRepo serviceRepository;
//	
//	
//	
//	 public Package addServiceToPackage(int packageId, int serviceId) {
//	        Package aPackage = packageRepository.findById(packageId).orElseThrow(() -> new IllegalArgumentException("Package not found"));
//	        Services service = serviceRepository.findById(serviceId).orElseThrow(() -> new IllegalArgumentException("Service not found"));
//	        service.setPkg(aPackage);
//	        return packageRepository.save(aPackage);
//	    }
//	
//	
//	
////	public void createPackage(Packagedto packageDto) {
////	    int userId = packageDto.getUserId();
////	    UserInfo user = userRepo.findById(userId).orElseThrow(() -> new UserNotFoundException(userId));
////
////	    String packageName = packageDto.getPackageName();
////	    BigDecimal packagePrice = packageDto.getPackagePrice();
////	    List<Servicesdatadto> servicesData = packageDto.getServices();
////
////	    // Convert Servicesdatadto objects to Services objects
////	    List<Services> services = new ArrayList<>();
////	    for (Servicesdatadto serviceData : servicesData) {
////	        Services service = new Services();
////	        service.setServiceName(serviceData.getServiceName());
////	        service.setServicePrice(serviceData.getServiceprice());
////	        services.add(service);
////	    }
////
////	    // Create and save the package
////	    Package pkg = new Package();
////	    pkg.setPackageName(packageName);
////	    pkg.setPackagePrice(packagePrice);
////	    pkg.setServices(services);
////	    pkg.setUser(user);
////	    packageRepository.save(pkg);
////	}
//
//
//	
//	
//	
////	public Package createPackage(String packageName, BigDecimal packagePrice, List<Services> services) {
////	    Package pkg = new Package();
////	    pkg.setPackageName(packageName);
////	    pkg.setPackagePrice(packagePrice);
////	    pkg.setServices(services);
////
////	    return packageRepository.save(pkg);
////	}
//
//	
//	
//}
