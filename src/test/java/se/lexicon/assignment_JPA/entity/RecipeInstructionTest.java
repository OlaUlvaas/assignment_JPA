package se.lexicon.assignment_JPA.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.UUID;

public class RecipeInstructionTest {
    RecipeInstruction testObject;
    String testUUID;

    @BeforeEach
    public void setup(){
        testUUID = String.valueOf(UUID.randomUUID());
        testObject = new RecipeInstruction(testUUID,"Häll i en påse mjöl bla bla...");
    }

    @Test
    @DisplayName("Test - UUID")
    public void test_UUID(){
        String expectedUUID = testUUID;
        String actualUUID = testObject.getId();
        Assertions.assertEquals(expectedUUID, actualUUID);
    }
    @Test
    @DisplayName("Test - RecipeInstruction")
    public void test_recipe_instruction(){
        String expectedRecipeInstruction = "Häll i en påse mjöl bla bla...";
        String actualRecipeInstruction = testObject.getRecipeInstruction();
        Assertions.assertEquals(expectedRecipeInstruction, actualRecipeInstruction);
    }

    @Test
    @DisplayName("Test - CreateObject")
    public void test_createObject(){
        RecipeInstruction expectedRecipeInstruction = new RecipeInstruction(testUUID,"Häll i en påse mjöl bla bla...");
        RecipeInstruction actualRecipeInstruction = testObject;
        Assertions.assertEquals(expectedRecipeInstruction, actualRecipeInstruction);
    }
    @Test
    @DisplayName("Test - HashCode")
    public void test_hashCode(){
        int expectedHashCode = new RecipeInstruction(testUUID,"Häll i en påse mjöl bla bla...").hashCode();
        int actualHashCode = testObject.hashCode();
        Assertions.assertEquals(expectedHashCode, actualHashCode);
    }

}
