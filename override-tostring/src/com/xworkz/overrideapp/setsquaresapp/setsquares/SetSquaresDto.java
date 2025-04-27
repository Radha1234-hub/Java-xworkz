package com.xworkz.overrideapp.setsquaresapp.setsquares;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

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

    @Override
    public boolean equals(Object obj) {
        boolean isSameAs = obj instanceof SetSquaresDto;
        if (isSameAs) {
            SetSquaresDto ref = (SetSquaresDto) obj;
            if (this.getSetSquareId() == ref.getSetSquareId() &&
                    this.getSetSquareType().equals(ref.getSetSquareType()) &&
                    this.getSetSquareMaterial().equals(ref.getSetSquareMaterial()) &&
                    this.getSetSquareBrand().equals(ref.getSetSquareBrand()) &&
                    this.getSetSquareUsage().equals(ref.getSetSquareUsage()) &&
                    this.getSetSquareAngle().equals(ref.getSetSquareAngle()) &&
                    this.getSetSquarePrice() == ref.getSetSquarePrice()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(setSquareId, setSquareType, setSquareMaterial, setSquareBrand, setSquareUsage, setSquareAngle, setSquarePrice);
    }

}

