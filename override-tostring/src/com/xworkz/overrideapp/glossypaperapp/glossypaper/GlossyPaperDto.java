package com.xworkz.overrideapp.glossypaperapp.glossypaper;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class GlossyPaperDto {
    private int paperId;
    private String paperType;
    private String paperFinish;
    private String paperWeight;
    private String paperUsage;
    private String paperSize;
    private double paperPrice;

    @Override
    public String toString() {
        return "GlossyPaperDto(Paper Id: " + this.paperId +
                ",\nPaper Type: " + this.paperType +
                ",\nPaper Finish: " + this.paperFinish +
                ",\nPaper Weight: " + this.paperWeight +
                ",\nPaper Usage: " + this.paperUsage +
                ",\nPaper Size: " + this.paperSize +
                ",\nPaper Price: " + this.paperPrice + ")";
    }
}
