package com.xworkz.overrideapp.parchmentpaperapp.parchmentpaper;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

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

    @Override
    public boolean equals(Object obj) {
        boolean isSameAs = obj instanceof ParchmentPaperDto;
        if (isSameAs) {
            ParchmentPaperDto ref = (ParchmentPaperDto) obj;
            if (this.getPaperId() == ref.getPaperId() &&
                    this.getPaperType().equals(ref.getPaperType()) &&
                    this.getPaperMaterial().equals(ref.getPaperMaterial()) &&
                    this.getPaperUsage().equals(ref.getPaperUsage()) &&
                    this.getPaperCoating().equals(ref.getPaperCoating()) &&
                    this.getPaperSize().equals(ref.getPaperSize()) &&
                    this.getPaperPrice() == ref.getPaperPrice()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(paperId, paperType, paperMaterial, paperUsage, paperCoating, paperSize, paperPrice);
    }

}
