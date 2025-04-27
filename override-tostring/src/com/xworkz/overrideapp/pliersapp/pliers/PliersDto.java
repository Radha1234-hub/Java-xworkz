package com.xworkz.overrideapp.pliersapp.pliers;

import lombok.Getter;
import lombok.Setter;

import java.nio.channels.Pipe;
import java.util.Objects;

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

  /*  @Override
    public String toString() {
        return "PliersDto(Plier Id: " + this.plierId +
                ",\nPlier Type: " + this.plierType +
                ",\nPlier Material: " + this.plierMaterial +
                ",\nPlier Brand: " + this.plierBrand +
                ",\nPlier Usage: " + this.plierUsage +
                ",\nPlier Size: " + this.plierSize +
                ",\nPlier Price: " + this.plierPrice + ")";
    }*/

    @Override
    public boolean equals(Object obj) {

        boolean IsSameAsObj = obj instanceof PliersDto;
        if (IsSameAsObj) {
            PliersDto ref = (PliersDto) obj;
            if (this.getPlierId() == ref.getPlierId() && this.getPlierBrand().equals(ref.getPlierBrand()) && this.getPlierMaterial().equals(ref.getPlierMaterial()) && this.getPlierSize().equals(ref.getPlierSize()) && this.getPlierType().equals(ref.getPlierType()) && this.getPlierUsage().equals(ref.getPlierUsage()))

            return true;
        }
    return false;
    }


    @Override
    public int hashCode() {
        return Objects.hash(plierId, plierType, plierMaterial, plierBrand, plierUsage, plierSize, plierPrice);
    }
}