package com.xworkz.overrideapp.rulerapp.ruler;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class RulerDto {

        private int rulerId;
        private String rulerType;
        private String rulerMaterial;
        private String rulerLength;
        private String rulerUsage;
        private String rulerBrand;
        private double rulerPrice;

        @Override
        public String toString() {
            return "RulerDto(Ruler Id: " + this.rulerId +
                    ",\nRuler Type: " + this.rulerType +
                    ",\nRuler Material: " + this.rulerMaterial +
                    ",\nRuler Length: " + this.rulerLength +
                    ",\nRuler Usage: " + this.rulerUsage +
                    ",\nRuler Brand: " + this.rulerBrand +
                    ",\nRuler Price: " + this.rulerPrice + ")";
        }
}
