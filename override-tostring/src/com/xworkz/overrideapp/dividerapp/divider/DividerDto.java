package com.xworkz.overrideapp.dividerapp.divider;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

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

    @Override
    public boolean equals(Object obj) {
        boolean isSameAs = obj instanceof DividerDto;
        if (isSameAs) {
            DividerDto ref = (DividerDto) obj;
            if (this.getDividerId() == ref.getDividerId() &&
                    this.getDividerType().equals(ref.getDividerType()) &&
                    this.getDividerMaterial().equals(ref.getDividerMaterial()) &&
                    this.getDividerBrand().equals(ref.getDividerBrand()) &&
                    this.getDividerUsage().equals(ref.getDividerUsage()) &&
                    this.getDividerSize().equals(ref.getDividerSize()) &&
                    this.getDividerPrice() == ref.getDividerPrice()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dividerId, dividerType, dividerMaterial, dividerBrand, dividerUsage, dividerSize, dividerPrice);
    }

}
