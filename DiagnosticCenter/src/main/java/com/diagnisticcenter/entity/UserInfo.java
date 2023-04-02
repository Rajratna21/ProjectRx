package com.diagnisticcenter.entity;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="UserInfo")
//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class UserInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="UserId")
	private int uid;
	
//	@Column(name="UserName")
//	private String UserName;
	
	@Column(name="Password")
	private String Password;
	
	@Column(name="EmailId")
	private String emailId;
	
	@Column(name="Address")
	private String Address;
	
	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	@Column(name="Name")
	private String Name;
	
//	@JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss")
//	@Column(name="Logindate")
//	private Date Logindate;
	
	@Column(name="MobileNo")
	private String MobileNo;

	@JsonManagedReference
	@OneToMany(mappedBy = "users",cascade = CascadeType.ALL)
	private List<Services> services;
	
	
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<LoginDate> loginDates;
	
	@Column(name = "Document", columnDefinition = "BLOB")
	private byte[] document;
	
//	public int getUserId() {
//		return UserId;
//	}
//
//	public void setUserId(int userId) {
//		UserId = userId;
//	}

	public byte[] getDocument() {
		return document;
	}

	public void setDocument(byte[] document) {
		this.document = document;
	}

	public String getName() {
		return Name;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public List<Services> getServices() {
		return services;
	}

	public void setServices(List<Services> services) {
		this.services = services;
	}

	public void setName(String name) {
		Name = name;
	}

//	public String getUserName() {
//		return UserName;
//	}
//
//	public void setUserName(String userName) {
//		UserName = userName;
//	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}


//	public Date getLogindate() {
//		return Logindate;
//	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

//	public void setLogindate(Date logindate) {
//		Logindate = logindate;
//	}

	public String getMobileNo() {
		return MobileNo;
	}

	public void setMobileNo(String mobileNo) {
		MobileNo = mobileNo;
	}
	
	

	public List<LoginDate> getLoginDates() {
		return loginDates;
	}

	public void setLoginDates(List<LoginDate> loginDates) {
		this.loginDates = loginDates;
	}

	
	
}
