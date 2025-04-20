package com.xworkz.measuringinstrument;

import com.xworkz.measuringinstrument.measuringinstrument.MeasuringInstrument;
import com.xworkz.measuringinstrument.screwgauge.ScrewGauge;

public class MeasuringInstrumentRunner {
    public static void main(String[] args) {

        MeasuringInstrument ref = new MeasuringInstrument();
        ref.type();
        ref.purpose();
        ref.units();
        ref.precision();
        ref.calibration();

        MeasuringInstrument ref1 = new ScrewGauge();
        ref1.type();
        ref1.purpose();
        ref1.units();
        ref1.precision();
        ref1.calibration();

        ScrewGauge ref2 = new ScrewGauge();
        ref2.type();
        ref2.purpose();
        ref2.units();
        ref2.precision();
        ref2.calibration();
        ref2.pitchCalculation();
        ref2.leastCount();
    }
}
