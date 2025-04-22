package com.xworkz.overrideapp.setsquaresapp.setsquares;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SetSquaresDto {
    private int setSquareId;
    private String setSquareType;
    private String setSquareMaterial;
    private String setSquareBrand;
    private String setSquareUsage;
    private String setSquareAngle;
    private double setSquarePrice;

    @Override
    public String toString() {
        return "SetSquaresDto(SetSquare Id: " + this.setSquareId +
                ",\nSetSquare Type: " + this.setSquareType +
                ",\nSetSquare Material: " + this.setSquareMaterial +
                ",\nSetSquare Brand: " + this.setSquareBrand +
                ",\nSetSquare Usage: " + this.setSquareUsage +
                ",\nSetSquare Angle: " + this.setSquareAngle +
                ",\nSetSquare Price: " + this.setSquarePrice + ")";
    }
}

