package com.xworkz.overrideapp.networkmediaapp.networkmedia;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class NetworkMediaDto {


        private int mediaId;
        private String mediaType;
        private String mediaMaterial;
        private String mediaBandwidth;
        private String mediaUsage;
        private String mediaMaxDistance;
        private double mediaPrice;

        @Override
        public String toString() {
            return "NetworkMediaDto(Media Id: " + this.mediaId +
                    ",\nMedia Type: " + this.mediaType +
                    ",\nMedia Material: " + this.mediaMaterial +
                    ",\nMedia Bandwidth: " + this.mediaBandwidth +
                    ",\nMedia Usage: " + this.mediaUsage +
                    ",\nMedia Max Distance: " + this.mediaMaxDistance +
                    ",\nMedia Price: " + this.mediaPrice + ")";
        }

}
