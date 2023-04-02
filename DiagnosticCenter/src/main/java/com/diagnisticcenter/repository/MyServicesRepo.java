package com.diagnisticcenter.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diagnisticcenter.entity.Services;
import com.diagnisticcenter.entity.UserInfo;

@Repository
public interface MyServicesRepo extends JpaRepository<Services, Integer>{
	
	List<Services> findByUsers(UserInfo user);
}
