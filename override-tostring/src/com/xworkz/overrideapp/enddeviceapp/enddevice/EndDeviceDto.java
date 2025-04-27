package com.xworkz.overrideapp.enddeviceapp.enddevice;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

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

        @Override
        public boolean equals(Object obj) {
                boolean isSameAs = obj instanceof EndDeviceDto;
                if (isSameAs) {
                        EndDeviceDto ref = (EndDeviceDto) obj;
                        if (this.getDeviceId() == ref.getDeviceId() &&
                                this.getDeviceName().equals(ref.getDeviceName()) &&
                                this.getDeviceType().equals(ref.getDeviceType()) &&
                                this.getDeviceManufacturer().equals(ref.getDeviceManufacturer()) &&
                                this.getDeviceUsage().equals(ref.getDeviceUsage()) &&
                                this.getDeviceConnectivity().equals(ref.getDeviceConnectivity()) &&
                                this.getDevicePrice() == ref.getDevicePrice()) {
                                return true;
                        }
                }
                return false;
        }

        @Override
        public int hashCode() {
                return Objects.hash(deviceId, deviceName, deviceType, deviceManufacturer, deviceUsage, deviceConnectivity, devicePrice);
        }

}
