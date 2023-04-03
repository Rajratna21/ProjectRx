package com.diagnisticcenter.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PackageDto {
    private int packageId;
    private String packageName;
    private BigDecimal packagePrice;
    private List<Integer> serviceIds;

    // constructor, getters and setters

    public PackageDto() {
        serviceIds = new ArrayList<>();
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

    public List<Integer> getServiceIds() {
        return serviceIds;
    }

    public void setServiceIds(List<Integer> serviceIds) {
        this.serviceIds = serviceIds;
    }

    public void addServiceId(int serviceId) {
        serviceIds.add(serviceId);
    }
}

