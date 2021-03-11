package se.lexicon.assignment_JPA.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class RecipeTest {


    Recipe testObject;
    Ingredient testIngredient1;
    Ingredient testIngredient2;
    Ingredient testIngredient3;
    Ingredient testIngredient4;
    Ingredient testIngredient5;
    List<RecipeIngredient> testRecipeIngredients;
    RecipeInstruction testRecipeInstruction;
    List<RecipeCategory> testRecipeCategories;
    RecipeCategory testRecipeCategory1;
    RecipeCategory testRecipeCategory2;
    RecipeCategory testRecipeCategory3;
    RecipeCategory testRecipeCategory4;
    RecipeCategory testRecipeCategory5;
    RecipeIngredient testRecipeIngredient1;
    RecipeIngredient testRecipeIngredient2;
    RecipeIngredient testRecipeIngredient3;
    RecipeIngredient testRecipeIngredient4;
    RecipeIngredient testRecipeIngredient5;
    List<Recipe> testRecipies;
    String testUUID;




    @BeforeEach
    public void setup(){

        testRecipies = new ArrayList<>();
        testRecipeIngredients = new ArrayList<>();
        testRecipeCategories = new ArrayList<>();

        testIngredient1 = new Ingredient(1, "Mjöl");
        testIngredient2 = new Ingredient(2, "Bakpulver");
        testIngredient3 = new Ingredient(3, "Salt");
        testIngredient4 = new Ingredient(4, "Smör");
        testIngredient5 = new Ingredient(5, "Mjölk");

        testRecipeInstruction = new RecipeInstruction();

//        private String id;
//        private Ingredient ingredient;
//        private double measuredAmount;
//        private Measurement measurementUnit;
//        private Recipe recipe;
        testObject = new Recipe(1,"Scones", testRecipeIngredients, testRecipeInstruction,testRecipeCategories);
        testRecipeIngredient1 = new RecipeIngredient(testIngredient1, 4.5, Measurement.DL, testObject);
        testRecipeIngredient2 = new RecipeIngredient(testIngredient2, 2.0, Measurement.TSK, testObject);
        testRecipeIngredient3 = new RecipeIngredient(testIngredient3, 0.5, Measurement.TSK, testObject);
        testRecipeIngredient4 = new RecipeIngredient(testIngredient4, 50.0, Measurement.G, testObject);
        testRecipeIngredient5 = new RecipeIngredient(testIngredient5, 2.0, Measurement.DL, testObject);

        testRecipeIngredients.add(testRecipeIngredient1);
        testRecipeIngredients.add(testRecipeIngredient2);
        testRecipeIngredients.add(testRecipeIngredient3);
        testRecipeIngredients.add(testRecipeIngredient4);
        testRecipeIngredients.add(testRecipeIngredient5);

//        private int id;
//        private String category;
//        private List<Recipe> recipes;



        testRecipies.add(testObject);

        testRecipeCategory1 = new RecipeCategory(1, "Cakes", testRecipies);
        testRecipeCategory2 = new RecipeCategory(2, "Candy", testRecipies);
        testRecipeCategory3 = new RecipeCategory(3, "Pasta", testRecipies);
        testRecipeCategory4 = new RecipeCategory(4, "Barbeque", testRecipies);
        testRecipeCategory5 = new RecipeCategory(5, "Sauces", testRecipies);

        testRecipeCategories.add(testRecipeCategory1);

        testUUID = String.valueOf(UUID.randomUUID());

    }
//    private int id;
//    private String recipeName;
//    private List<RecipeIngredient> recipeIngredient;
//    private RecipeInstruction recipeInstruction;
//    private List<RecipeCategory> recipeCategories;

    @Test
    @DisplayName("Test - Id")
    public void test_id(){
        int expectedId = 1;
        int actualId = testObject.getId();
        Assertions.assertEquals(expectedId, actualId);
    }
    @Test
    @DisplayName("Test - RecipeName")
    public void test_recipeName(){
        String expectedRecipeName = "Scones";
        String actualRecipeName = testObject.getRecipeName();
        Assertions.assertEquals(expectedRecipeName, actualRecipeName);
    }

    @Test
    @DisplayName("Test - SizeOfRecipeIngredientArrayList")
    public void test_size_of_recipe_ingredient_arrayList(){
        int expectedSizeOfRecipeIngredientArrayList = 5;
        int actualSizeOfRecipeIngredientArrayList = testObject.getRecipeIngredientCollection().size();
        Assertions.assertEquals(expectedSizeOfRecipeIngredientArrayList, actualSizeOfRecipeIngredientArrayList);
    }

    @Test
    @DisplayName("Test - RecipeInstructionIsNull")
    public void test_recipe_isNotNull(){
        Assertions.assertNotNull(testObject.getRecipeInstruction());
    }
    @Test
    @DisplayName("Test - SizeOfRecipeCategoriesArrayList")
    public void test_size_of_recipe_categories_arrayList(){
        int expectedSizeOfRecipeCategoriesArrayList = 1;
        int actualSizeOfRecipeCategoriesArrayList = testObject.getRecipeCategories().size();
        Assertions.assertEquals(expectedSizeOfRecipeCategoriesArrayList, actualSizeOfRecipeCategoriesArrayList);
    }
    @Test
    @DisplayName("Test - CreateObject")
    public void test_createObject(){
        Recipe expectedRecipe = new Recipe(1,"Scones", testRecipeIngredients, testRecipeInstruction,testRecipeCategories);
        Recipe actualRecipe = testObject;
        Assertions.assertEquals(expectedRecipe, actualRecipe);
    }

}
