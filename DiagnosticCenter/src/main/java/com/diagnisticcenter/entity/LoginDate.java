package com.diagnisticcenter.entity;

import java.sql.Date;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="logindata")
public class LoginDate {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="did")
	private int dateid;
	
	
	
	@JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss")
	@Column(name="Logindate")
	private LocalDateTime Logindate;

	@JsonBackReference
	@ManyToOne
    @JoinColumn(name = "UserId")
    private UserInfo user;

	

    public UserInfo getUser() {
		return user;
	}

	public void setUser(UserInfo user) {
		this.user = user;
	}

	public LoginDate() {
        this.Logindate = LocalDateTime.now();
    }
	
	public int getDateid() {
		return dateid;
	}



	public void setDateid(int dateid) {
		this.dateid = dateid;
	}



	public LocalDateTime getLogindate() {
		return Logindate;
	}



	public void setLogindate(LocalDateTime logindate) {
		Logindate = logindate;
	}
	
}
