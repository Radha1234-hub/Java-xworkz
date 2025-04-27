package com.xworkz.overrideapp.simulationtoolsapp;

import com.xworkz.overrideapp.simulationtoolsapp.simulationtools.SimulationToolsDto;

public class SimulationToolsRunner {
    public static void main(String[] args) {

        SimulationToolsDto ref1 = new SimulationToolsDto();
        ref1.setToolId(1);
        ref1.setToolName("MATLAB");
        ref1.setToolCategory("Mathematical Modeling");
        ref1.setToolApplication("Engineering and Data Analysis");
        ref1.setToolDeveloper("MathWorks");
        ref1.setToolCompatibility("Windows, Mac, Linux");
        ref1.setToolPrice(85000.00);

        int toolId1 = ref1.getToolId();
        String toolName1 = ref1.getToolName();
        String toolCategory1 = ref1.getToolCategory();
        String toolApplication1 = ref1.getToolApplication();
        String toolDeveloper1 = ref1.getToolDeveloper();
        String toolCompatibility1 = ref1.getToolCompatibility();
        double toolPrice1 = ref1.getToolPrice();

        System.out.println("Tool ID: " + toolId1);
        System.out.println("Tool Name: " + toolName1);
        System.out.println("Tool Category: " + toolCategory1);
        System.out.println("Tool Application: " + toolApplication1);
        System.out.println("Tool Developer: " + toolDeveloper1);
        System.out.println("Tool Compatibility: " + toolCompatibility1);
        System.out.println("Tool Price: " + toolPrice1);
        System.out.println("\n");

        SimulationToolsDto ref2 = new SimulationToolsDto();
        ref2.setToolId(2);
        ref2.setToolName("ANSYS");
        ref2.setToolCategory("Finite Element Analysis");
        ref2.setToolApplication("Mechanical and Structural Simulation");
        ref2.setToolDeveloper("ANSYS Inc.");
        ref2.setToolCompatibility("Windows, Linux");
        ref2.setToolPrice(120000.00);

        int toolId2 = ref2.getToolId();
        String toolName2 = ref2.getToolName();
        String toolCategory2 = ref2.getToolCategory();
        String toolApplication2 = ref2.getToolApplication();
        String toolDeveloper2 = ref2.getToolDeveloper();
        String toolCompatibility2 = ref2.getToolCompatibility();
        double toolPrice2 = ref2.getToolPrice();

        System.out.println("Tool ID: " + toolId2);
        System.out.println("Tool Name: " + toolName2);
        System.out.println("Tool Category: " + toolCategory2);
        System.out.println("Tool Application: " + toolApplication2);
        System.out.println("Tool Developer: " + toolDeveloper2);
        System.out.println("Tool Compatibility: " + toolCompatibility2);
        System.out.println("Tool Price: " + toolPrice2);
        System.out.println("\n");

        SimulationToolsDto ref3 = new SimulationToolsDto();
        ref3.setToolId(3);
        ref3.setToolName("Simulink");
        ref3.setToolCategory("System Simulation");
        ref3.setToolApplication("Control Systems and Embedded Design");
        ref3.setToolDeveloper("MathWorks");
        ref3.setToolCompatibility("Windows, Mac, Linux");
        ref3.setToolPrice(95000.00);

        int toolId3 = ref3.getToolId();
        String toolName3 = ref3.getToolName();
        String toolCategory3 = ref3.getToolCategory();
        String toolApplication3 = ref3.getToolApplication();
        String toolDeveloper3 = ref3.getToolDeveloper();
        String toolCompatibility3 = ref3.getToolCompatibility();
        double toolPrice3 = ref3.getToolPrice();

        System.out.println("Tool ID: " + toolId3);
        System.out.println("Tool Name: " + toolName3);
        System.out.println("Tool Category: " + toolCategory3);
        System.out.println("Tool Application: " + toolApplication3);
        System.out.println("Tool Developer: " + toolDeveloper3);
        System.out.println("Tool Compatibility: " + toolCompatibility3);
        System.out.println("Tool Price: " + toolPrice3);
        System.out.println("\n");



        System.out.println(ref3.toString());
    }
}
