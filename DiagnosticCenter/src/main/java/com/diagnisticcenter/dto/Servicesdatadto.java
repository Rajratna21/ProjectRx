package com.diagnisticcenter.dto;

import java.math.BigDecimal;

public class Servicesdatadto {

	private String uemail;
	
	private int serviceId;
	public int getServiceId() {
		return serviceId;
	}

	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}

	public String getUemail() {
		return uemail;
	}

	public void setUemail(String uemail) {
		this.uemail = uemail;
	}

	private String serviceName;
	
	private BigDecimal serviceprice;

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public BigDecimal getServiceprice() {
		return serviceprice;
	}

	public void setServiceprice(BigDecimal serviceprice) {
		this.serviceprice = serviceprice;
	}

	
	
	
}
