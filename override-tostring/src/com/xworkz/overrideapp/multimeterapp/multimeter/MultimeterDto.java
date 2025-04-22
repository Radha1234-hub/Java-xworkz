package com.xworkz.overrideapp.multimeterapp.multimeter;

import lombok.Getter;
import lombok.Setter;

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
}
