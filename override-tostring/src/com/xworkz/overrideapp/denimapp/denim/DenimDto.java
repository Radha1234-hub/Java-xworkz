package com.xworkz.overrideapp.denimapp.denim;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class DenimDto {

    private int denimId;
    private String denimType;
    private String denimBrand;
    private String denimFit;
    private String denimColor;
    private String denimMaterial;
    private double denimPrice;

    @Override
    public String toString(){
        return "DenimDto(Denim Id:"+this.denimId + ",\nDenim Type:"+this.denimType + ",\nDenim Brand:"+this.denimBrand + ",\nDenim Fit:"+this.denimFit + ",\nDenim Color:"+this.denimColor + ",\nDenim Material:"+this.denimMaterial + ",\nDenim Price:"+this.denimPrice + ")";
    }
}
