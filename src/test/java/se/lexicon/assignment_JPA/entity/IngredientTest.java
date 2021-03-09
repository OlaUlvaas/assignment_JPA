package se.lexicon.assignment_JPA.entity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IngredientTest {
    Ingredient testObject;

    @BeforeEach
    public void setup() {
        testObject = new Ingredient(1, "Milk");
    }
    @Test
    @DisplayName("Test 1 - Create object")
    public void test_create_object(){
        Assertions.assertEquals(1, testObject.getId());
    }

    @Test
    @DisplayName("Test 2 - Equal object")
    public void test_equal(){
        Ingredient expectedIngredient = new Ingredient(1, "Milk");
        Ingredient actualIngredient = testObject;
        Assertions.assertEquals(expectedIngredient, actualIngredient);
    }



}
