package com.xworkz.overrideapp.cottonapp.cotton;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter

public class CottonDto {

    private int cottonId;
    private String cottonType;
    private String cottonOrigin;
    private String cottonQuality;
    private String cottonUsage;
    private String cottonColor;
    private double cottonPrice;

    @Override
    public String toString(){
        return "CottonDto(Cotton Id:"+this.cottonId + ",\nCotton Type:"+this.cottonType + ",\nCotton Origin:"+this.cottonOrigin + ",\nCotton Quality:"+this.cottonQuality + ",\nCotton Usage:"+this.cottonUsage + ",\nCotton Color:"+this.cottonColor + ",\nCotton Price:"+this.cottonPrice + ")";
    }

    @Override
    public boolean equals(Object obj) {
        boolean isSameAs = obj instanceof CottonDto;
        if (isSameAs) {
            CottonDto ref = (CottonDto) obj;
            if (this.getCottonId() == ref.getCottonId() &&
                    this.getCottonType().equals(ref.getCottonType()) &&
                    this.getCottonOrigin().equals(ref.getCottonOrigin()) &&
                    this.getCottonQuality().equals(ref.getCottonQuality()) &&
                    this.getCottonUsage().equals(ref.getCottonUsage()) &&
                    this.getCottonColor().equals(ref.getCottonColor()) &&
                    this.getCottonPrice() == ref.getCottonPrice()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cottonId, cottonType, cottonOrigin, cottonQuality, cottonUsage, cottonColor, cottonPrice);
    }

}
