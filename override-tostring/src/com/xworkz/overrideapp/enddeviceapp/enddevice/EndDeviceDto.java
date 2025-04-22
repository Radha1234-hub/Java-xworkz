package com.xworkz.overrideapp.enddeviceapp.enddevice;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class EndDeviceDto {


        private int deviceId;
        private String deviceName;
        private String deviceType;
        private String deviceManufacturer;
        private String deviceUsage;
        private String deviceConnectivity;
        private double devicePrice;

        @Override
        public String toString() {
            return "EndDeviceDto(Device Id: " + this.deviceId +
                    ",\nDevice Name: " + this.deviceName +
                    ",\nDevice Type: " + this.deviceType +
                    ",\nDevice Manufacturer: " + this.deviceManufacturer +
                    ",\nDevice Usage: " + this.deviceUsage +
                    ",\nDevice Connectivity: " + this.deviceConnectivity +
                    ",\nDevice Price: " + this.devicePrice + ")";
        }
        }
