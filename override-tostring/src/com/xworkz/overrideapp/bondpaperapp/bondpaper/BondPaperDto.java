package com.xworkz.overrideapp.bondpaperapp.bondpaper;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter


public class BondPaperDto {
    private int paperId;
    private String paperType;
    private String paperMaterial;
    private String paperWeight;
    private String paperUsage;
    private String paperSize;
    private double paperPrice;

  /*  @Override
    public String toString() {
        return "BondPaperDto(Paper Id: " + this.paperId +
                ",\nPaper Type: " + this.paperType +
                ",\nPaper Material: " + this.paperMaterial +
                ",\nPaper Weight: " + this.paperWeight +
                ",\nPaper Usage: " + this.paperUsage +
                ",\nPaper Size: " + this.paperSize +
                ",\nPaper Price: " + this.paperPrice + ")";
    }*/


    @Override
    public boolean equals(Object obj) {
        boolean IsSameAs = obj instanceof BondPaperDto;
        if (IsSameAs) {
            BondPaperDto ref = (BondPaperDto) obj;
            if (this.getPaperId() == ref.getPaperId() &&
                    this.getPaperType().equals(ref.getPaperType()) &&
                    this.getPaperMaterial().equals(ref.getPaperMaterial()) &&
                    this.getPaperWeight().equals(ref.getPaperWeight()) &&
                    this.getPaperUsage().equals(ref.getPaperUsage()) &&
                    this.getPaperSize().equals(ref.getPaperSize()) &&
                    this.getPaperPrice() == ref.getPaperPrice()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(paperId, paperType, paperMaterial, paperWeight, paperUsage, paperSize, paperPrice);
    }
}