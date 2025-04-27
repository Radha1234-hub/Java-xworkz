package com.xworkz.overrideapp.denimapp.denim;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

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

    @Override
    public boolean equals(Object obj) {
        boolean isSameAs = obj instanceof DenimDto;
        if (isSameAs) {
            DenimDto ref = (DenimDto) obj;
            if (this.getDenimId() == ref.getDenimId() &&
                    this.getDenimType().equals(ref.getDenimType()) &&
                    this.getDenimBrand().equals(ref.getDenimBrand()) &&
                    this.getDenimFit().equals(ref.getDenimFit()) &&
                    this.getDenimColor().equals(ref.getDenimColor()) &&
                    this.getDenimMaterial().equals(ref.getDenimMaterial()) &&
                    this.getDenimPrice() == ref.getDenimPrice()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(denimId, denimType, denimBrand, denimFit, denimColor, denimMaterial, denimPrice);
    }

}
