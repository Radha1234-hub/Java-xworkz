package com.xworkz.overrideapp.chiffonapp.chiffon;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

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

    @Override
    public boolean equals(Object obj) {
        boolean isSameAs = obj instanceof ChiffonDto;
        if (isSameAs) {
            ChiffonDto ref = (ChiffonDto) obj;
            if (this.getChiffonId() == ref.getChiffonId() &&
                    this.getChiffonType().equals(ref.getChiffonType()) &&
                    this.getChiffonOrigin().equals(ref.getChiffonOrigin()) &&
                    this.getChiffonTexture().equals(ref.getChiffonTexture()) &&
                    this.getChiffonUsage().equals(ref.getChiffonUsage()) &&
                    this.getChiffonColor().equals(ref.getChiffonColor()) &&
                    this.getChiffonPrice() == ref.getChiffonPrice()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(chiffonId, chiffonType, chiffonOrigin, chiffonTexture, chiffonUsage, chiffonColor, chiffonPrice);
    }


}
