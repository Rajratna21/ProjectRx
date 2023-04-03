package com.diagnisticcenter.entity;



import java.io.Serializable;

import com.diagnisticcenter.entity.Services;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class PackageServiceId implements Serializable {

	
	private static final long serialVersionUID = 1L;
    public PackageServiceId() {
		super();
	}

	public PackageServiceId(Package pkg, Services service) {
		super();
		this.pkg = pkg;
		this.service = service;
	}

	public Package getPkg() {
		return pkg;
	}

	public void setPkg(Package pkg) {
		this.pkg = pkg;
	}

	public Services getService() {
		return service;
	}

	public void setService(Services service) {
		this.service = service;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@ManyToOne
    @JoinColumn(name = "package_id")
    private Package pkg;

    @ManyToOne
    @JoinColumn(name = "service_id")
    private Services service;

    // constructors, getters and setters

    // override equals and hashCode methods

}

