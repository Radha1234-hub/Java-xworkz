package com.xworkz.overrideapp.wrenchesapp.wrenches;

import lombok.Getter;
import lombok.Setter;

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
}
