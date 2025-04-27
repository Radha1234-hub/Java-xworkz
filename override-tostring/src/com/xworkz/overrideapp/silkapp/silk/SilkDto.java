package com.xworkz.overrideapp.silkapp.silk;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Setter
@Getter

public class SilkDto {

    private int silkId;
    private String silkType;
    private String silkOrigin;
    private String silkTexture;
    private String silkUsage;
    private String silkColor;
    private double silkPrice;

    @Override
    public String toString(){
        return "SilkDto(Silk Id:"+this.silkId + ",\nSilk Type:"+this.silkType + ",\nSilk Origin:"+this.silkOrigin + ",\nSilk Texture:"+this.silkTexture + ",\nSilk Usage:"+this.silkUsage + ",\nSilk Color:"+this.silkColor + ",\nSilk Price:"+this.silkPrice + ")";
    }

    @Override
    public boolean equals(Object obj) {
        boolean isSameAs = obj instanceof SilkDto;
        if (isSameAs) {
            SilkDto ref = (SilkDto) obj;
            if (this.getSilkId() == ref.getSilkId() &&
                    this.getSilkType().equals(ref.getSilkType()) &&
                    this.getSilkOrigin().equals(ref.getSilkOrigin()) &&
                    this.getSilkTexture().equals(ref.getSilkTexture()) &&
                    this.getSilkUsage().equals(ref.getSilkUsage()) &&
                    this.getSilkColor().equals(ref.getSilkColor()) &&
                    this.getSilkPrice() == ref.getSilkPrice()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(silkId, silkType, silkOrigin, silkTexture, silkUsage, silkColor, silkPrice);
    }


}
