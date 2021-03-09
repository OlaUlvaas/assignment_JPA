package se.lexicon.assignment_JPA.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

public class RecipeCategoryTest {

    RecipeCategory testObject;
    List<Recipe> testRecipes;

    @BeforeEach
    public void setup(){

        Recipe cake1 = new Recipe();
        Recipe cake2 = new Recipe();
        Recipe cake3 = new Recipe();


        testObject = new RecipeCategory();
        testObject.setId(1);
        testObject.setCategory("Cakes");

        testRecipes = new ArrayList<>();
        testRecipes.add(cake1);
        testRecipes.add(cake2);
        testRecipes.add(cake3);

        testObject.setRecipes(testRecipes);
    }

    @Test
    @DisplayName("Test - Id")
    public void test_id(){
        int expectedId = 1;
        int actualId = testObject.getId();
        Assertions.assertEquals(expectedId, actualId);
    }

    @Test
    @DisplayName("Test - Category")
    public void test_category(){
        String expectedCategory = "Cakes";
        String actualCategory = testObject.getCategory();
        Assertions.assertEquals(expectedCategory, actualCategory);
    }
    @Test
    @DisplayName("Test - CreateObject")
    public void test_createObject(){
        RecipeCategory expectedRecipeCategory = new RecipeCategory(1, "Cakes", testRecipes);
        RecipeCategory actualRecipeCategory = testObject;
        Assertions.assertEquals(expectedRecipeCategory, actualRecipeCategory);
    }
    @Test
    @DisplayName("Test - HashCode")
    public void test_hashCode(){
        int expectedHashCode = new RecipeCategory(1, "Cakes", testRecipes).hashCode();
        int actualHashCode = testObject.hashCode();
        Assertions.assertEquals(expectedHashCode, actualHashCode);
    }
}
