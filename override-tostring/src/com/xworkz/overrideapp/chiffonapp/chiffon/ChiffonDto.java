package com.xworkz.overrideapp.chiffonapp.chiffon;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class ChiffonDto {
    private int chiffonId;
    private String chiffonType;
    private String chiffonOrigin;
    private String chiffonTexture;
    private String chiffonUsage;
    private String chiffonColor;
    private double chiffonPrice;

    @Override
    public String toString() {
        return "ChiffonDto(Chiffon Id: " + this.chiffonId +
                ",\nChiffon Type: " + this.chiffonType +
                ",\nChiffon Origin: " + this.chiffonOrigin +
                ",\nChiffon Texture: " + this.chiffonTexture +
                ",\nChiffon Usage: " + this.chiffonUsage +
                ",\nChiffon Color: " + this.chiffonColor +
                ",\nChiffon Price: " + this.chiffonPrice + ")";
    }

}
