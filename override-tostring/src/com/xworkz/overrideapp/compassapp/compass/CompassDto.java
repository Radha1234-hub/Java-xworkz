package com.xworkz.overrideapp.compassapp.compass;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class CompassDto {
    private int compassId;
    private String compassType;
    private String compassMaterial;
    private String compassBrand;
    private String compassUsage;
    private String compassSize;
    private double compassPrice;

    @Override
    public String toString() {
        return "CompassDto(Compass Id: " + this.compassId +
                ",\nCompass Type: " + this.compassType +
                ",\nCompass Material: " + this.compassMaterial +
                ",\nCompass Brand: " + this.compassBrand +
                ",\nCompass Usage: " + this.compassUsage +
                ",\nCompass Size: " + this.compassSize +
                ",\nCompass Price: " + this.compassPrice + ")";
    }}
