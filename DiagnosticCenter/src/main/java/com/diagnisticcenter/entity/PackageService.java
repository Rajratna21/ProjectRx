package com.diagnisticcenter.entity;



import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;

@Entity
@Table(name = "package_services")
public class PackageService {
    
    @EmbeddedId
    private PackageServiceId pk = new PackageServiceId();
    
    public PackageService(PackageServiceId pk, Package pkg, Services service) {
		super();
		this.pk = pk;
		this.pkg = pkg;
		this.service = service;
	}

	public PackageServiceId getPk() {
		return pk;
	}

	public void setPk(PackageServiceId pk) {
		this.pk = pk;
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

	@ManyToOne(targetEntity = Package.class)
    @MapsId("packageId")
    @JoinColumn(name = "package_id")
    private Package pkg;
    
    @ManyToOne(targetEntity = Services.class)
    @MapsId("serviceId")
    @JoinColumn(name = "service_id")
    private Services service;
    
    // constructors, getters and setters
    
}


