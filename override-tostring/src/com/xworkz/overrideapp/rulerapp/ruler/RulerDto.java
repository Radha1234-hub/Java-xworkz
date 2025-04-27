package com.xworkz.overrideapp.rulerapp.ruler;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

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

        @Override
        public boolean equals(Object obj) {
                boolean isSameAs = obj instanceof RulerDto;
                if (isSameAs) {
                        RulerDto ref = (RulerDto) obj;
                        if (this.getRulerId() == ref.getRulerId() &&
                                this.getRulerType().equals(ref.getRulerType()) &&
                                this.getRulerMaterial().equals(ref.getRulerMaterial()) &&
                                this.getRulerLength().equals(ref.getRulerLength()) &&
                                this.getRulerUsage().equals(ref.getRulerUsage()) &&
                                this.getRulerBrand().equals(ref.getRulerBrand()) &&
                                this.getRulerPrice() == ref.getRulerPrice()) {
                                return true;
                        }
                }
                return false;
        }

        @Override
        public int hashCode() {
                return Objects.hash(rulerId, rulerType, rulerMaterial, rulerLength, rulerUsage, rulerBrand, rulerPrice);
        }

}
