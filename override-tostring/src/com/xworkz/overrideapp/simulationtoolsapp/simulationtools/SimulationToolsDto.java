package com.xworkz.overrideapp.simulationtoolsapp.simulationtools;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

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

    @Override
    public boolean equals(Object obj) {
        boolean isSameAs = obj instanceof SimulationToolsDto;
        if (isSameAs) {
            SimulationToolsDto ref = (SimulationToolsDto) obj;
            if (this.getToolId() == ref.getToolId() &&
                    this.getToolName().equals(ref.getToolName()) &&
                    this.getToolCategory().equals(ref.getToolCategory()) &&
                    this.getToolApplication().equals(ref.getToolApplication()) &&
                    this.getToolDeveloper().equals(ref.getToolDeveloper()) &&
                    this.getToolCompatibility().equals(ref.getToolCompatibility()) &&
                    this.getToolPrice() == ref.getToolPrice()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(toolId, toolName, toolCategory, toolApplication, toolDeveloper, toolCompatibility, toolPrice);
    }

}
