package com.xworkz.overrideapp.protractorapp.protractor;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

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

        @Override
        public boolean equals(Object obj) {
                boolean isSameAs = obj instanceof ProtractorDto;
                if (isSameAs) {
                        ProtractorDto ref = (ProtractorDto) obj;
                        if (this.getProtractorId() == ref.getProtractorId() &&
                                this.getProtractorType().equals(ref.getProtractorType()) &&
                                this.getProtractorMaterial().equals(ref.getProtractorMaterial()) &&
                                this.getProtractorBrand().equals(ref.getProtractorBrand()) &&
                                this.getProtractorUsage().equals(ref.getProtractorUsage()) &&
                                this.getProtractorDegreeRange().equals(ref.getProtractorDegreeRange()) &&
                                this.getProtractorPrice() == ref.getProtractorPrice()) {
                                return true;
                        }
                }
                return false;
        }

        @Override
        public int hashCode() {
                return Objects.hash(protractorId, protractorType, protractorMaterial, protractorBrand, protractorUsage, protractorDegreeRange, protractorPrice);
        }

}
