package com.xworkz.overrideapp.hammerapp.hammer;

import lombok.Getter;
import lombok.Setter;

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
}
