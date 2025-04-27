package com.xworkz.overrideapp.routerapp.router;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

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
    @Override
    public boolean equals(Object obj) {
        boolean isSameAs = obj instanceof RouterDto;
        if (isSameAs) {
            RouterDto ref = (RouterDto) obj;
            if (this.getRouterId() == ref.getRouterId() &&
                    this.getRouterBrand().equals(ref.getRouterBrand()) &&
                    this.getRouterModel().equals(ref.getRouterModel()) &&
                    this.getRouterType().equals(ref.getRouterType()) &&
                    this.getRouterSpeed().equals(ref.getRouterSpeed()) &&
                    this.getRouterFrequency().equals(ref.getRouterFrequency()) &&
                    this.getRouterPrice() == ref.getRouterPrice()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(routerId, routerBrand, routerModel, routerType, routerSpeed, routerFrequency, routerPrice);
    }

}
