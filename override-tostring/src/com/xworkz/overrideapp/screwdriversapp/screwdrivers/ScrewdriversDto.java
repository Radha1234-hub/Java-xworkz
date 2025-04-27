package com.xworkz.overrideapp.screwdriversapp.screwdrivers;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

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

    @Override
    public boolean equals(Object obj) {
        boolean isSameAs = obj instanceof ScrewdriversDto;
        if (isSameAs) {
            ScrewdriversDto ref = (ScrewdriversDto) obj;
            if (this.getScrewdriverId() == ref.getScrewdriverId() &&
                    this.getScrewdriverType().equals(ref.getScrewdriverType()) &&
                    this.getScrewdriverMaterial().equals(ref.getScrewdriverMaterial()) &&
                    this.getScrewdriverBrand().equals(ref.getScrewdriverBrand()) &&
                    this.getScrewdriverUsage().equals(ref.getScrewdriverUsage()) &&
                    this.getScrewdriverSize().equals(ref.getScrewdriverSize()) &&
                    this.getScrewdriverPrice() == ref.getScrewdriverPrice()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(screwdriverId, screwdriverType, screwdriverMaterial, screwdriverBrand, screwdriverUsage, screwdriverSize, screwdriverPrice);
    }

}
