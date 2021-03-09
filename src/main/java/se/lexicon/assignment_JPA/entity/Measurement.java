package se.lexicon.assignment_JPA.entity;

public enum Measurement {
    L(1), DL(2), CL(3), ML(4), KG(5), HG(6), G(7), MG(8), TSK(9), MSK(10);

    private int measurementIndex;

    Measurement() {
    }

    Measurement(int measurementIndex) {
        this.measurementIndex = measurementIndex;
    }

    public int getMeasurementIndex() {
        return measurementIndex;
    }

    public void setMeasurementIndex(int measurementIndex) {
        this.measurementIndex = measurementIndex;
    }
}

