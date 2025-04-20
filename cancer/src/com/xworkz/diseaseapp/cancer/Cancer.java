package com.xworkz.diseaseapp.cancer;

import com.xworkz.diseaseapp.disease.Disease;

public class Cancer extends Disease {

    @Override
    public void symptoms() {
        System.out.println("Cancer symptoms may include unusual lumps, prolonged fatigue, weight loss, or abnormal bleeding.");
    }

    @Override
    public void causes() {
        System.out.println("Cancer can be caused by genetic mutations, exposure to carcinogens, or lifestyle factors.");
    }

    @Override
    public void diagnosis() {
        System.out.println("Cancer diagnosis involves biopsies, imaging scans, and lab tests to identify abnormal cells.");
    }

    @Override
    public void treatment() {
        System.out.println("Cancer treatment includes chemotherapy, radiation therapy, surgery, and targeted therapies.");
    }

    @Override
    public void prevention() {
        System.out.println("Preventing cancer includes avoiding tobacco, eating a healthy diet, and regular screenings.");
    }

    public void types() {
        System.out.println("There are various types of cancer, such as breast cancer, lung cancer, and skin cancer.");
    }

    public void stages() {
        System.out.println("Cancer progresses through stages, from localized tumors to widespread metastasis.");
    }
}
