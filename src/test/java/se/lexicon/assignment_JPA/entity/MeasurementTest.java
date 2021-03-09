package se.lexicon.assignment_JPA.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MeasurementTest {
    Measurement testObject;

    @BeforeEach
    public void setup() {
        testObject = Measurement.KG;
    }


    @Test
    @DisplayName("Test - Measurement Equal")
    public void test_equal(){
        int expectedMeasurementIndex = 5;
        int actualMeasurementIndex = testObject.getMeasurementIndex();

        Assertions.assertEquals(expectedMeasurementIndex, actualMeasurementIndex);
    }
}
