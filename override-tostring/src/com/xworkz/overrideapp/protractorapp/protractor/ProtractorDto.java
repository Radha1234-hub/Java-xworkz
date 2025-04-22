package com.xworkz.overrideapp.protractorapp.protractor;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class ProtractorDto {

        private int protractorId;
        private String protractorType;
        private String protractorMaterial;
        private String protractorBrand;
        private String protractorUsage;
        private String protractorDegreeRange;
        private double protractorPrice;

        @Override
        public String toString() {
            return "ProtractorDto(Protractor Id: " + this.protractorId +
                    ",\nProtractor Type: " + this.protractorType +
                    ",\nProtractor Material: " + this.protractorMaterial +
                    ",\nProtractor Brand: " + this.protractorBrand +
                    ",\nProtractor Usage: " + this.protractorUsage +
                    ",\nProtractor Degree Range: " + this.protractorDegreeRange +
                    ",\nProtractor Price: " + this.protractorPrice + ")";
        }
}
