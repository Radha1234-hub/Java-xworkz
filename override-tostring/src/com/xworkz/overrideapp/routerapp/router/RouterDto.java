package com.xworkz.overrideapp.routerapp.router;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class RouterDto {
    private int routerId;
    private String routerBrand;
    private String routerModel;
    private String routerType;
    private String routerSpeed;
    private String routerFrequency;
    private double routerPrice;

    @Override
    public String toString() {
        return "RouterDto(Router Id: " + this.routerId +
                ",\nRouter Brand: " + this.routerBrand +
                ",\nRouter Model: " + this.routerModel +
                ",\nRouter Type: " + this.routerType +
                ",\nRouter Speed: " + this.routerSpeed +
                ",\nRouter Frequency: " + this.routerFrequency +
                ",\nRouter Price: " + this.routerPrice + ")";
    }
}
