package com.xworkz.measuringinstrument.screwgauge;

import com.xworkz.measuringinstrument.measuringinstrument.MeasuringInstrument;

public class ScrewGauge extends MeasuringInstrument {
    @Override
    public void type() {
        System.out.println("A screw gauge is a type of precision measuring instrument used to measure small dimensions.");
    }

    @Override
    public void purpose() {
        System.out.println("Screw gauges are primarily used to measure the thickness or diameter of small objects with high precision.");
    }

    @Override
    public void units() {
        System.out.println("Screw gauges measure in units such as millimeters or micrometers.");
    }

    @Override
    public void precision() {
        System.out.println("Screw gauges offer high precision, typically up to 0.01 mm or even finer.");
    }

    @Override
    public void calibration() {
        System.out.println("Screw gauges are calibrated regularly to ensure their accuracy for precise measurements.");
    }

    public void pitchCalculation() {
        System.out.println("The pitch of the screw gauge is calculated by dividing the thread distance by the number of rotations.");
    }

    public void leastCount() {
        System.out.println("The least count of a screw gauge is calculated as the pitch divided by the number of divisions on the circular scale.");
    }
}
