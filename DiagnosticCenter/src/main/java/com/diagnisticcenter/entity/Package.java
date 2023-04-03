package com.diagnisticcenter.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "packages")
public class Package {
 
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    
	    @Column(name = "name")
	    private String name;
	    
	    @Column(name = "price")
	    private BigDecimal price;
	    
	    public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public BigDecimal getPrice() {
			return price;
		}

		public void setPrice(BigDecimal price) {
			this.price = price;
		}

		public UserInfo getUser() {
			return user;
		}

		public void setUser(UserInfo user) {
			this.user = user;
		}

		public Set<PackageService> getPackageServices() {
			return packageServices;
		}

		public void setPackageServices(Set<PackageService> packageServices) {
			this.packageServices = packageServices;
		}

		public Set<Services> getServices() {
			return services;
		}

		public void setServices(Set<Services> services) {
			this.services = services;
		}

		@ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name = "user_id")
	    private UserInfo user;
	    
	    @OneToMany(mappedBy = "pkg")
	    private Set<PackageService> packageServices = new HashSet();
	    
	    // constructors, getters and setters
	    @ManyToMany(mappedBy = "packages1")
	    private Set<Services> services = new HashSet<>();
	    
	}



