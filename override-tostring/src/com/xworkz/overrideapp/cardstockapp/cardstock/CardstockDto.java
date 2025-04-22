package com.xworkz.overrideapp.cardstockapp.cardstock;

import lombok.Getter;
import lombok.Setter;

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

    @Override
    public String toString() {
        return "CardstockDto(Cardstock Id: " + this.cardstockId +
                ",\nCardstock Type: " + this.cardstockType +
                ",\nCardstock Material: " + this.cardstockMaterial +
                ",\nCardstock Weight: " + this.cardstockWeight +
                ",\nCardstock Usage: " + this.cardstockUsage +
                ",\nCardstock Finish: " + this.cardstockFinish +
                ",\nCardstock Price: " + this.cardstockPrice + ")";
    }
}
