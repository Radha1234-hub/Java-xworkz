package com.xworkz.overrideapp.linenapp.linen;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Setter
@Getter

public class LinenDto {

    private int linenId;
    private String linenType;
    private String linenOrigin;
    private String linenTexture;
    private String linenUsage;
    private String linenColor;
    private double linenPrice;

    @Override
    public String toString(){
        return "LinenDto(Linen Id:"+this.linenId + ",\nLinen Type:"+this.linenType + ",\nLinen Origin:"+this.linenOrigin + ",\nLinen Texture:"+this.linenTexture + ",\nLinen Usage:"+this.linenUsage + ",\nLinen Color:"+this.linenColor + ",\nLinen Price:"+this.linenPrice + ")";
    }

    @Override
    public boolean equals(Object obj) {
        boolean isSameAs = obj instanceof LinenDto;
        if (isSameAs) {
            LinenDto ref = (LinenDto) obj;
            if (this.getLinenId() == ref.getLinenId() &&
                    this.getLinenType().equals(ref.getLinenType()) &&
                    this.getLinenOrigin().equals(ref.getLinenOrigin()) &&
                    this.getLinenTexture().equals(ref.getLinenTexture()) &&
                    this.getLinenUsage().equals(ref.getLinenUsage()) &&
                    this.getLinenColor().equals(ref.getLinenColor()) &&
                    this.getLinenPrice() == ref.getLinenPrice()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(linenId, linenType, linenOrigin, linenTexture, linenUsage, linenColor, linenPrice);
    }

}
