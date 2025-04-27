package com.xworkz.overrideapp.wrenchesapp.wrenches;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter

public class WrenchesDto {
    private int wrenchId;
    private String wrenchType;
    private String wrenchMaterial;
    private String wrenchBrand;
    private String wrenchUsage;
    private String wrenchSize;
    private double wrenchPrice;

    @Override
    public String toString() {
        return "WrenchesDto(Wrench Id: " + this.wrenchId +
                ",\nWrench Type: " + this.wrenchType +
                ",\nWrench Material: " + this.wrenchMaterial +
                ",\nWrench Brand: " + this.wrenchBrand +
                ",\nWrench Usage: " + this.wrenchUsage +
                ",\nWrench Size: " + this.wrenchSize +
                ",\nWrench Price: " + this.wrenchPrice + ")";
    }

    @Override
    public boolean equals(Object obj) {
        boolean isSameAs = obj instanceof WrenchesDto;
        if (isSameAs) {
            WrenchesDto ref = (WrenchesDto) obj;
            if (this.getWrenchId() == ref.getWrenchId() &&
                    this.getWrenchType().equals(ref.getWrenchType()) &&
                    this.getWrenchMaterial().equals(ref.getWrenchMaterial()) &&
                    this.getWrenchBrand().equals(ref.getWrenchBrand()) &&
                    this.getWrenchUsage().equals(ref.getWrenchUsage()) &&
                    this.getWrenchSize().equals(ref.getWrenchSize()) &&
                    this.getWrenchPrice() == ref.getWrenchPrice()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(wrenchId, wrenchType, wrenchMaterial, wrenchBrand, wrenchUsage, wrenchSize, wrenchPrice);
    }

}
