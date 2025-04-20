package com.xworkz.diseaseapp;

import com.xworkz.diseaseapp.cancer.Cancer;
import com.xworkz.diseaseapp.disease.Disease;

public class DiseaseRunner {

    public static void main(String[] args) {

        Disease ref = new Disease();
        ref.symptoms();
        ref.causes();
        ref.diagnosis();
        ref.treatment();
        ref.prevention();

        Disease ref1 = new Cancer();
        ref1.symptoms();
        ref1.causes();
        ref1.diagnosis();
        ref1.treatment();
        ref1.prevention();

        Cancer ref2 = new Cancer();
        ref2.symptoms();
        ref2.causes();
        ref2.diagnosis();
        ref2.treatment();
        ref2.prevention();
        ref2.types();
        ref2.stages();
    }
}
