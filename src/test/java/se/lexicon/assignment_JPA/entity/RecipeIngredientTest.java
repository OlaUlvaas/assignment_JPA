package se.lexicon.assignment_JPA.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.UUID;

public class RecipeIngredientTest {
    RecipeIngredient testObject;
    Ingredient testIngredient;
    Measurement testMeasurement;
    String testUUID;

    @BeforeEach
    public void setup(){
        testIngredient = new Ingredient(1, "Milk");
        testUUID = String.valueOf(UUID.randomUUID());
        testMeasurement = Measurement.KG;
        testObject = new RecipeIngredient(testUUID, testIngredient,10.7, testMeasurement,null);


    }

    @Test
    @DisplayName("Test - UUID")
    public void test_UUID(){
        String expectedId = testUUID;
        String actualId = testObject.getId();

        Assertions.assertEquals(expectedId, actualId);
    }

    @Test
    @DisplayName("Test - Ingredient")
    public void test_Ingredient() {
        Ingredient expectedIngredient = testIngredient;
        Ingredient actualIngredient = testObject.getIngredient();

        Assertions.assertEquals(expectedIngredient, actualIngredient);
    }

    @Test
    @DisplayName("Test - MeasurementAmount")
    public void test_measurementAmount() {
        double expectedMeasurementAmount = 10.7;
        double actualMeasurementAmount = testObject.getMeasuredAmount();

        Assertions.assertEquals(expectedMeasurementAmount, actualMeasurementAmount);

    }

    @Test
    @DisplayName("Test - MeasurementUnit")
    public void test_measurementUnit() {
        int expectedMeasurement = 5;
        int actualMeasurement = testObject.getMeasurementUnit().getMeasurementIndex();

        Assertions.assertEquals(expectedMeasurement, actualMeasurement);

    }

    @Test
    @DisplayName("Test - RecipeIsNull")
    public void test_recipe_isNull() {
        Assertions.assertNull(testObject.getRecipe());
    }

    @Test
    @DisplayName("Test - IngredientName")
    public void test_ingredientName() {
        String expected = "Milk";
        String actual = testObject.getIngredient().getIngredient();

        Assertions.assertEquals(expected, actual);

    }


}
