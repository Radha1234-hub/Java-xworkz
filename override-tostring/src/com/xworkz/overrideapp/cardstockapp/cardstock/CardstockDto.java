package com.xworkz.overrideapp.cardstockapp.cardstock;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter

public class CardstockDto {
    private int cardstockId;
    private String cardstockType;
    private String cardstockMaterial;
    private String cardstockWeight;
    private String cardstockUsage;
    private String cardstockFinish;
    private double cardstockPrice;

   /* @Override
    public String toString() {
        return "CardstockDto(Cardstock Id: " + this.cardstockId +
                ",\nCardstock Type: " + this.cardstockType +
                ",\nCardstock Material: " + this.cardstockMaterial +
                ",\nCardstock Weight: " + this.cardstockWeight +
                ",\nCardstock Usage: " + this.cardstockUsage +
                ",\nCardstock Finish: " + this.cardstockFinish +
                ",\nCardstock Price: " + this.cardstockPrice + ")";
    }*/
   @Override
   public boolean equals(Object obj) {
       boolean isSameAs = obj instanceof CardstockDto;
       if (isSameAs) {
           CardstockDto ref = (CardstockDto) obj;
           if (this.getCardstockId() == ref.getCardstockId() &&
                   this.getCardstockType().equals(ref.getCardstockType()) &&
                   this.getCardstockMaterial().equals(ref.getCardstockMaterial()) &&
                   this.getCardstockWeight().equals(ref.getCardstockWeight()) &&
                   this.getCardstockUsage().equals(ref.getCardstockUsage()) &&
                   this.getCardstockFinish().equals(ref.getCardstockFinish()) &&
                   this.getCardstockPrice() == ref.getCardstockPrice()) {
               return true;
           }
       }
       return false;
   }

    @Override
    public int hashCode() {
        return Objects.hash(cardstockId, cardstockType, cardstockMaterial, cardstockWeight, cardstockUsage, cardstockFinish, cardstockPrice);
    }

}
