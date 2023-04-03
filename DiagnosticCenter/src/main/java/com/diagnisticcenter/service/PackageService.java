package com.diagnisticcenter.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diagnisticcenter.repository.MyServicesRepo;
import com.diagnisticcenter.repository.PackageRepository;




@Service
public class PackageService {
 
    @Autowired
    private PackageRepository packageRepository;
    
    @Autowired
    private MyServicesRepo servicesRepository;
    
 

 


}
