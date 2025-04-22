package com.xworkz.overrideapp.cottonapp.cotton;

import lombok.Getter;
import lombok.Setter;

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
}
