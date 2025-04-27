package com.xworkz.overrideapp.glossypaperapp.glossypaper;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

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
    @Override
    public boolean equals(Object obj) {
        boolean isSameAs = obj instanceof GlossyPaperDto;
        if (isSameAs) {
            GlossyPaperDto ref = (GlossyPaperDto) obj;
            if (this.getPaperId() == ref.getPaperId() &&
                    this.getPaperType().equals(ref.getPaperType()) &&
                    this.getPaperFinish().equals(ref.getPaperFinish()) &&
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
        return Objects.hash(paperId, paperType, paperFinish, paperWeight, paperUsage, paperSize, paperPrice);
    }

}
