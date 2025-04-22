package com.xworkz.overrideapp.switchesapp.switches;

import lombok.Getter;
import lombok.Setter;

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
}
