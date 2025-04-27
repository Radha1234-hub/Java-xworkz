package com.xworkz.overrideapp.multimeterapp.multimeter;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter

public class MultimeterDto {


        private int multimeterId;
        private String multimeterBrand;
        private String multimeterType;
        private String multimeterMeasurement;
        private String multimeterAccuracy;
        private String multimeterDisplay;
        private double multimeterPrice;

        @Override
        public String toString() {
            return "MultimeterDto(Multimeter Id: " + this.multimeterId +
                    ",\nMultimeter Brand: " + this.multimeterBrand +
                    ",\nMultimeter Type: " + this.multimeterType +
                    ",\nMultimeter Measurement: " + this.multimeterMeasurement +
                    ",\nMultimeter Accuracy: " + this.multimeterAccuracy +
                    ",\nMultimeter Display: " + this.multimeterDisplay +
                    ",\nMultimeter Price: " + this.multimeterPrice + ")";
        }

        @Override
        public boolean equals(Object obj) {
                boolean isSameAs = obj instanceof MultimeterDto;
                if (isSameAs) {
                        MultimeterDto ref = (MultimeterDto) obj;
                        if (this.getMultimeterId() == ref.getMultimeterId() &&
                                this.getMultimeterBrand().equals(ref.getMultimeterBrand()) &&
                                this.getMultimeterType().equals(ref.getMultimeterType()) &&
                                this.getMultimeterMeasurement().equals(ref.getMultimeterMeasurement()) &&
                                this.getMultimeterAccuracy().equals(ref.getMultimeterAccuracy()) &&
                                this.getMultimeterDisplay().equals(ref.getMultimeterDisplay()) &&
                                this.getMultimeterPrice() == ref.getMultimeterPrice()) {
                                return true;
                        }
                }
                return false;
        }

        @Override
        public int hashCode() {
                return Objects.hash(multimeterId, multimeterBrand, multimeterType, multimeterMeasurement, multimeterAccuracy, multimeterDisplay, multimeterPrice);
        }

}
