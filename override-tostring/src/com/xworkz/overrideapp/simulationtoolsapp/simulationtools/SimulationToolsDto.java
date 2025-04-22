package com.xworkz.overrideapp.simulationtoolsapp.simulationtools;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class SimulationToolsDto {
    private int toolId;
    private String toolName;
    private String toolCategory;
    private String toolApplication;
    private String toolDeveloper;
    private String toolCompatibility;
    private double toolPrice;

    @Override
    public String toString() {
        return "SimulationToolsDto(Tool Id: " + this.toolId +
                ",\nTool Name: " + this.toolName +
                ",\nTool Category: " + this.toolCategory +
                ",\nTool Application: " + this.toolApplication +
                ",\nTool Developer: " + this.toolDeveloper +
                ",\nTool Compatibility: " + this.toolCompatibility +
                ",\nTool Price: " + this.toolPrice + ")";
    }
}
