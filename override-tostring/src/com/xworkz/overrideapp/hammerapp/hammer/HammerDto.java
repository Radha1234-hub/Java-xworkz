package com.xworkz.overrideapp.hammerapp.hammer;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter

public class HammerDto {
    private int hammerId;
    private String hammerType;
    private String hammerMaterial;
    private String hammerBrand;
    private String hammerUsage;
    private String hammerWeight;
    private double hammerPrice;

    @Override
    public String toString() {
        return "HammerDto(Hammer Id: " + this.hammerId +
                ",\nHammer Type: " + this.hammerType +
                ",\nHammer Material: " + this.hammerMaterial +
                ",\nHammer Brand: " + this.hammerBrand +
                ",\nHammer Usage: " + this.hammerUsage +
                ",\nHammer Weight: " + this.hammerWeight +
                ",\nHammer Price: " + this.hammerPrice + ")";
    }

    @Override
    public boolean equals(Object obj) {
        boolean isSameAs = obj instanceof HammerDto;
        if (isSameAs) {
            HammerDto ref = (HammerDto) obj;
            if (this.getHammerId() == ref.getHammerId() &&
                    this.getHammerType().equals(ref.getHammerType()) &&
                    this.getHammerMaterial().equals(ref.getHammerMaterial()) &&
                    this.getHammerBrand().equals(ref.getHammerBrand()) &&
                    this.getHammerUsage().equals(ref.getHammerUsage()) &&
                    this.getHammerWeight().equals(ref.getHammerWeight()) &&
                    this.getHammerPrice() == ref.getHammerPrice()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hammerId, hammerType, hammerMaterial, hammerBrand, hammerUsage, hammerWeight, hammerPrice);
    }

}
