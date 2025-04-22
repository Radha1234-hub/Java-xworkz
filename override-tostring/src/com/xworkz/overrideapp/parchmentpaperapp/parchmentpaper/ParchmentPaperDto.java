package com.xworkz.overrideapp.parchmentpaperapp.parchmentpaper;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ParchmentPaperDto {
    private int paperId;
    private String paperType;
    private String paperMaterial;
    private String paperUsage;
    private String paperCoating;
    private String paperSize;
    private double paperPrice;

    @Override
    public String toString() {
        return "ParchmentPaperDto(Paper Id: " + this.paperId +
                ",\nPaper Type: " + this.paperType +
                ",\nPaper Material: " + this.paperMaterial +
                ",\nPaper Usage: " + this.paperUsage +
                ",\nPaper Coating: " + this.paperCoating +
                ",\nPaper Size: " + this.paperSize +
                ",\nPaper Price: " + this.paperPrice + ")";
    }
}
