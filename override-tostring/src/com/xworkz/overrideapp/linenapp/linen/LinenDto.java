package com.xworkz.overrideapp.linenapp.linen;

import lombok.Getter;
import lombok.Setter;

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
}
