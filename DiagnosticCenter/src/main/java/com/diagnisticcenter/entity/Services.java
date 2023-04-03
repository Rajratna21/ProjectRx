package com.diagnisticcenter.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.annotations.ManyToAny;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Services")
public class Services {

	public UserInfo getUsers() {
		return users;
	}

	public void setUsers(UserInfo users) {
		this.users = users;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="serviceId")
	private int serviceId;
	
	@Column(name="ServiceName")
	private String serviceName;
	
	@Column(name="servicePrice")
	private BigDecimal servicePrice;

    @JsonBackReference
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="UserId")
	private UserInfo users;
	
    
//    @JsonBackReference
//    @ManyToOne
//    @JoinColumn(name = "pkgid")
//    private Package pkg;
	
//	public Package getPkg() {
//		return pkg;
//	}
//
//	public void setPkg(Package pkg) {
//		this.pkg = pkg;
//	}

	public int getServiceId() {
		return serviceId;
	}

	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}

	

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public BigDecimal getServicePrice() {
		return servicePrice;
	}

	public void setServicePrice(BigDecimal servicePrice) {
		this.servicePrice = servicePrice;
	}
	
//	
//	@ManyToMany()
//    private List<Package> packages = new ArrayList();


//	public List<Package> getPackages() {
//		return packages;
//	}
//
//	public void setPackages(List<Package> packages) {
//		this.packages = packages;
//	}
	
	@ManyToMany
	@JoinTable(
	    name = "package_services",
	    joinColumns = @JoinColumn(name = "service_id"),
	    inverseJoinColumns = @JoinColumn(name = "package_id")
	)
	private Set<Package> packages1;

	public Services() {
	    packages1 = new HashSet<>();
	}
}
