package com.diagnisticcenter.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diagnisticcenter.dto.Userdatadto;
import com.diagnisticcenter.entity.UserInfo;
import com.diagnisticcenter.service.userService;

@CrossOrigin("*")
@RestController
@RequestMapping(path="/user")
public class UserController {

	@Autowired
	userService uservice;
	
	@PostMapping("/registerUser")
	public String createUser(@RequestBody UserInfo user)
	{
		String mssg="";
		boolean success=uservice.RegisterUser(user);
		if(success)
		{
			return mssg="User Registered Successfully";
		}
		return mssg="Data Not Saved, Error in data.";
		
	}
	
	
	@PostMapping("/userlogin")
	public String userLogin(@RequestBody Userdatadto userdto )
	{
		 boolean retmssg=uservice.checkuserLogin(userdto);
		 if(retmssg)
		 {
			
			 return "User Authentication Success.";
		 }
		 else
			 return "Wrong Credentials";
	}
	
}
