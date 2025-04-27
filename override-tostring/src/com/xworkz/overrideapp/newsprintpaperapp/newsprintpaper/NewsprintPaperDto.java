package com.xworkz.overrideapp.newsprintpaperapp.newsprintpaper;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Setter
@Getter

public class NewsprintPaperDto {
    private int paperId;
    private String paperType;
    private String paperMaterial;
    private String paperWeight;
    private String paperUsage;
    private String paperColor;
    private double paperPrice;

    @Override
    public String toString() {
        return "NewsprintPaperDto(Paper Id: " + this.paperId +
                ",\nPaper Type: " + this.paperType +
                ",\nPaper Material: " + this.paperMaterial +
                ",\nPaper Weight: " + this.paperWeight +
                ",\nPaper Usage: " + this.paperUsage +
                ",\nPaper Color: " + this.paperColor +
                ",\nPaper Price: " + this.paperPrice + ")";
    }

    @Override
    public boolean equals(Object obj) {
        boolean isSameAs = obj instanceof NewsprintPaperDto;
        if (isSameAs) {
            NewsprintPaperDto ref = (NewsprintPaperDto) obj;
            if (this.getPaperId() == ref.getPaperId() &&
                    this.getPaperType().equals(ref.getPaperType()) &&
                    this.getPaperMaterial().equals(ref.getPaperMaterial()) &&
                    this.getPaperWeight().equals(ref.getPaperWeight()) &&
                    this.getPaperUsage().equals(ref.getPaperUsage()) &&
                    this.getPaperColor().equals(ref.getPaperColor()) &&
                    this.getPaperPrice() == ref.getPaperPrice()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(paperId, paperType, paperMaterial, paperWeight, paperUsage, paperColor, paperPrice);
    }

}
