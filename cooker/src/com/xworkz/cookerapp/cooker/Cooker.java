package com.xworkz.cookerapp.cooker;

public class Cooker {

    private int cookerId;
    private String cookerBrand;
    private String cookerType;
    private int cookerCapacity;
    private String cookerMaterial;
    private String cookerWarranty;
    private int cookerPressureLevel;
    private String cookerSafetyFeatures;

    // cookerId
    public void setCookerId(int cookerId) {
        this.cookerId = cookerId;
    }

    public int getCookerId() {
        return cookerId;
    }

    // cookerBrand
    public void setCookerBrand(String cookerBrand) {
        this.cookerBrand = cookerBrand;
    }

    public String getCookerBrand() {
        return cookerBrand;
    }

    // cookerType
    public void setCookerType(String cookerType) {
        this.cookerType = cookerType;
    }

    public String getCookerType() {
        return cookerType;
    }

    // cookerCapacity
    public void setCookerCapacity(int cookerCapacity) {
        this.cookerCapacity = cookerCapacity;
    }

    public int getCookerCapacity() {
        return cookerCapacity;
    }

    // cookerMaterial
    public void setCookerMaterial(String cookerMaterial) {
        this.cookerMaterial = cookerMaterial;
    }

    public String getCookerMaterial() {
        return cookerMaterial;
    }

    // cookerWarranty
    public void setCookerWarranty(String cookerWarranty) {
        this.cookerWarranty = cookerWarranty;
    }

    public String getCookerWarranty() {
        return cookerWarranty;
    }

    // cookerPressureLevel
    public void setCookerPressureLevel(int cookerPressureLevel) {
        this.cookerPressureLevel = cookerPressureLevel;
    }

    public int getCookerPressureLevel() {
        return cookerPressureLevel;
    }

    // cookerSafetyFeatures
    public void setCookerSafetyFeatures(String cookerSafetyFeatures) {
        this.cookerSafetyFeatures = cookerSafetyFeatures;
    }

    public String getCookerSafetyFeatures() {
        return cookerSafetyFeatures;
    }
}
