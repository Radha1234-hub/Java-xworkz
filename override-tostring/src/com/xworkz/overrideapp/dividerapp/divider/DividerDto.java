package com.xworkz.overrideapp.dividerapp.divider;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class DividerDto {

    private int dividerId;
    private String dividerType;
    private String dividerMaterial;
    private String dividerBrand;
    private String dividerUsage;
    private String dividerSize;
    private double dividerPrice;

    @Override
    public String toString() {
        return "DividerDto(Divider Id: " + this.dividerId +
                ",\nDivider Type: " + this.dividerType +
                ",\nDivider Material: " + this.dividerMaterial +
                ",\nDivider Brand: " + this.dividerBrand +
                ",\nDivider Usage: " + this.dividerUsage +
                ",\nDivider Size: " + this.dividerSize +
                ",\nDivider Price: " + this.dividerPrice + ")";
    }
}
