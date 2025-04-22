package com.xworkz.overrideapp.silkapp.silk;

import lombok.Getter;
import lombok.Setter;

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

}
