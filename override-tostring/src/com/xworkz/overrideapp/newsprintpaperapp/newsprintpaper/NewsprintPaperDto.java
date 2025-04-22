package com.xworkz.overrideapp.newsprintpaperapp.newsprintpaper;

import lombok.Getter;
import lombok.Setter;

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
}
