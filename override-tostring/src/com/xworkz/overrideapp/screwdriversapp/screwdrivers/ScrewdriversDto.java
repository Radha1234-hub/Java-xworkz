package com.xworkz.overrideapp.screwdriversapp.screwdrivers;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class ScrewdriversDto {
    private int screwdriverId;
    private String screwdriverType;
    private String screwdriverMaterial;
    private String screwdriverBrand;
    private String screwdriverUsage;
    private String screwdriverSize;
    private double screwdriverPrice;

    @Override
    public String toString() {
        return "ScrewdriversDto(Screwdriver Id: " + this.screwdriverId +
                ",\nScrewdriver Type: " + this.screwdriverType +
                ",\nScrewdriver Material: " + this.screwdriverMaterial +
                ",\nScrewdriver Brand: " + this.screwdriverBrand +
                ",\nScrewdriver Usage: " + this.screwdriverUsage +
                ",\nScrewdriver Size: " + this.screwdriverSize +
                ",\nScrewdriver Price: " + this.screwdriverPrice + ")";
    }
}
