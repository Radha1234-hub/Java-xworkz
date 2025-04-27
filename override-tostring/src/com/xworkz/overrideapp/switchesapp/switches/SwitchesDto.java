package com.xworkz.overrideapp.switchesapp.switches;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter

public class SwitchesDto {
    private int switchesId;
    private String switchesBrand;
    private String switchesType;
    private String switchesMaterial;
    private String switchesCurrentRating;
    private String switchesColor;
    private double switchesPrice;

    @Override
    public String toString() {
        return "SwitchesDto(Switches Id: " + this.switchesId +
                ",\nSwitches Brand: " + this.switchesBrand +
                ",\nSwitches Type: " + this.switchesType +
                ",\nSwitches Material: " + this.switchesMaterial +
                ",\nSwitches Current Rating: " + this.switchesCurrentRating +
                ",\nSwitches Color: " + this.switchesColor +
                ",\nSwitches Price: " + this.switchesPrice + ")";
    }

    @Override
    public boolean equals(Object obj) {
        boolean isSameAs = obj instanceof SwitchesDto;
        if (isSameAs) {
            SwitchesDto ref = (SwitchesDto) obj;
            if (this.getSwitchesId() == ref.getSwitchesId() &&
                    this.getSwitchesBrand().equals(ref.getSwitchesBrand()) &&
                    this.getSwitchesType().equals(ref.getSwitchesType()) &&
                    this.getSwitchesMaterial().equals(ref.getSwitchesMaterial()) &&
                    this.getSwitchesCurrentRating().equals(ref.getSwitchesCurrentRating()) &&
                    this.getSwitchesColor().equals(ref.getSwitchesColor()) &&
                    this.getSwitchesPrice() == ref.getSwitchesPrice()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(switchesId, switchesBrand, switchesType, switchesMaterial, switchesCurrentRating, switchesColor, switchesPrice);
    }

}
