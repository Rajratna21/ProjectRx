package com.diagnisticcenter.service;


import java.time.LocalDateTime;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.diagnisticcenter.dto.Userdatadto;
import com.diagnisticcenter.entity.LoginDate;

import com.diagnisticcenter.entity.UserInfo;
import com.diagnisticcenter.repository.LoginDateRepository;

import com.diagnisticcenter.repository.UserRepository;


@Service
public class userService {
	
	@Autowired
	UserRepository userRepo;
	
	@Autowired
	LoginDateRepository daterepo;
	
	
	
	public boolean RegisterUser(UserInfo user)
	{
		String email=user.getEmailId();
		String phno=user.getMobileNo();
		String regex = "^(.+)@(.+)$";
		String phregex="^[\\+]?[(]?[0-9]{3}[)]?[-\\s\\.]?[0-9]{3}[-\\s\\.]?[0-9]{4,6}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		Pattern pattern1=Pattern.compile(phregex);
		Matcher matcher1=pattern1.matcher(phno);
		
		BCryptPasswordEncoder bcrypt= new BCryptPasswordEncoder();
		String ecryptedpwd=bcrypt.encode(user.getPassword());
		user.setPassword(ecryptedpwd);
		UserInfo userlist=userRepo.findByEmailId(user.getEmailId());
		if(userlist!=null)
		{
			
			return false;
		}
		if(!matcher.matches() ) {
		return false;
		}
		if(!matcher1.matches())
		{
		return false;
		}
		
		userRepo.save(user);
		return true;
	}

	public boolean checkuserLogin(Userdatadto userdto) {
		
		BCryptPasswordEncoder bcrypt= new BCryptPasswordEncoder();
		boolean status=false;
			List<UserInfo>userlist=userRepo.findAll();
			for(int i=0;i<userlist.size();i++)
			{	
				if((userdto.getEmailId().equals(userlist.get(i).getEmailId())) && bcrypt.matches(userdto.getPassword(), userlist.get(i).getPassword()))
						{
					
							saveLoginDate(userlist.get(i));
							status=true ;
						}	
			}
			
			return status;

		
	}
	
	
	
	public void saveLoginDate(UserInfo user) {
	    LoginDate loginDate = new LoginDate();
	    loginDate.setLogindate(LocalDateTime.now()); // set the current login date
	    loginDate.setUser(user);
	    daterepo.save(loginDate);
	}
	
	

}
