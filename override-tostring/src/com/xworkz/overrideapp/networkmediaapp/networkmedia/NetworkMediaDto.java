package com.xworkz.overrideapp.networkmediaapp.networkmedia;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

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
        @Override
        public boolean equals(Object obj) {
                boolean isSameAs = obj instanceof NetworkMediaDto;
                if (isSameAs) {
                        NetworkMediaDto ref = (NetworkMediaDto) obj;
                        if (this.getMediaId() == ref.getMediaId() &&
                                this.getMediaType().equals(ref.getMediaType()) &&
                                this.getMediaMaterial().equals(ref.getMediaMaterial()) &&
                                this.getMediaBandwidth().equals(ref.getMediaBandwidth()) &&
                                this.getMediaUsage().equals(ref.getMediaUsage()) &&
                                this.getMediaMaxDistance().equals(ref.getMediaMaxDistance()) &&
                                this.getMediaPrice() == ref.getMediaPrice()) {
                                return true;
                        }
                }
                return false;
        }

        @Override
        public int hashCode() {
                return Objects.hash(mediaId, mediaType, mediaMaterial, mediaBandwidth, mediaUsage, mediaMaxDistance, mediaPrice);
        }

}
