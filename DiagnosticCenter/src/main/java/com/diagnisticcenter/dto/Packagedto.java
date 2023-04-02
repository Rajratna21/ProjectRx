package com.diagnisticcenter.dto;

import java.math.BigDecimal;
import java.util.List;

public class Packagedto {
    private int userId;
    private int packageId;
    
    private int serviceId;
    public int getServiceId() {
		return serviceId;
	}

	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}

	private String packageName;
    private BigDecimal packagePrice;
    private List<Servicesdatadto> services;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getPackageId() {
        return packageId;
    }

    public void setPackageId(int packageId) {
        this.packageId = packageId;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public BigDecimal getPackagePrice() {
        return packagePrice;
    }

    public void setPackagePrice(BigDecimal packagePrice) {
        this.packagePrice = packagePrice;
    }

    public List<Servicesdatadto> getServices() {
        return services;
    }

    public void setServices(List<Servicesdatadto> services) {
        this.services = services;
    }

    // getters and setters
}
