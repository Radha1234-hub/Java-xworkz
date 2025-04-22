package com.xworkz.overrideapp.bondpaperapp.bondpaper;

import lombok.Getter;
import lombok.Setter;

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

    @Override
    public String toString() {
        return "BondPaperDto(Paper Id: " + this.paperId +
                ",\nPaper Type: " + this.paperType +
                ",\nPaper Material: " + this.paperMaterial +
                ",\nPaper Weight: " + this.paperWeight +
                ",\nPaper Usage: " + this.paperUsage +
                ",\nPaper Size: " + this.paperSize +
                ",\nPaper Price: " + this.paperPrice + ")";
    }
}
