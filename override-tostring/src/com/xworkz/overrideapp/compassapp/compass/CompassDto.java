package com.xworkz.overrideapp.compassapp.compass;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

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
    }
    @Override
    public boolean equals(Object obj) {
        boolean isSameAs = obj instanceof CompassDto;
        if (isSameAs) {
            CompassDto ref = (CompassDto) obj;
            if (this.getCompassId() == ref.getCompassId() &&
                    this.getCompassType().equals(ref.getCompassType()) &&
                    this.getCompassMaterial().equals(ref.getCompassMaterial()) &&
                    this.getCompassBrand().equals(ref.getCompassBrand()) &&
                    this.getCompassUsage().equals(ref.getCompassUsage()) &&
                    this.getCompassSize().equals(ref.getCompassSize()) &&
                    this.getCompassPrice() == ref.getCompassPrice()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(compassId, compassType, compassMaterial, compassBrand, compassUsage, compassSize, compassPrice);
    }
}
