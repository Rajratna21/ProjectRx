package com.diagnisticcenter.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.diagnisticcenter.dto.Userdatadto;
import com.diagnisticcenter.entity.UserInfo;

@Repository
public interface UserRepository extends JpaRepository<UserInfo,Integer> {

	//@Query(value="select * from UserName where UserName=:username ",nativeQuery = true)
	//List<Userdatadto>findByUserName(String username);
	
	 UserInfo findByEmailId(String email);
	
}
