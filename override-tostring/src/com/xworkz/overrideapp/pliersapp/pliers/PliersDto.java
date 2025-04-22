package com.xworkz.overrideapp.pliersapp.pliers;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class PliersDto {
    private int plierId;
    private String plierType;
    private String plierMaterial;
    private String plierBrand;
    private String plierUsage;
    private String plierSize;
    private double plierPrice;

    @Override
    public String toString() {
        return "PliersDto(Plier Id: " + this.plierId +
                ",\nPlier Type: " + this.plierType +
                ",\nPlier Material: " + this.plierMaterial +
                ",\nPlier Brand: " + this.plierBrand +
                ",\nPlier Usage: " + this.plierUsage +
                ",\nPlier Size: " + this.plierSize +
                ",\nPlier Price: " + this.plierPrice + ")";
    }
}
