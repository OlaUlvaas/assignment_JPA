package se.lexicon.assignment_JPA.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import se.lexicon.assignment_JPA.entity.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@DataJpaTest
public class RecipeRepositoryTest {
    @Autowired
    RecipeRepository testObject;

    Recipe testRecipeBechamelSauce;

    List<Recipe> testRecipies;
    List<RecipeIngredient> testRecipeIngredients;
    List<RecipeCategory> testRecipeCategories;

    Ingredient testIngredientSmor;
    Ingredient testIngredientVetemjol;
    Ingredient testIngredientMjolk;


    RecipeIngredient testRecipeIngredientInfoSmor;
    RecipeIngredient testRecipeIngredientInfoVetemjol;
    RecipeIngredient testRecipeIngredientInfoMjolk;

    RecipeInstruction testRecipeInstructionBechamel;

    RecipeCategory testRecipeCategorySauces;



    @BeforeEach
    public void setup(){

        testRecipies = new ArrayList<>();
        testRecipeIngredients = new ArrayList<>();
        testRecipeCategories = new ArrayList<>();


        testIngredientSmor = new Ingredient("Smör");
        testIngredientVetemjol = new Ingredient("Vetemjöl");
        testIngredientMjolk = new Ingredient("Mjölk");

        testRecipeIngredientInfoSmor = new RecipeIngredient(testIngredientSmor,25, Measurement.G, testRecipeBechamelSauce);
        testRecipeIngredientInfoVetemjol = new RecipeIngredient(testIngredientVetemjol,2, Measurement.MSK, testRecipeBechamelSauce);
        testRecipeIngredientInfoMjolk = new RecipeIngredient(testIngredientMjolk,3, Measurement.DL, testRecipeBechamelSauce);

        testRecipeIngredients.add(testRecipeIngredientInfoSmor);
        testRecipeIngredients.add(testRecipeIngredientInfoVetemjol);
        testRecipeIngredients.add(testRecipeIngredientInfoMjolk);

        testRecipeInstructionBechamel = new RecipeInstruction("Smält smöret bla bla...");

        testRecipeCategorySauces = new RecipeCategory("Sauces", testRecipies);

        testRecipeCategories.add(testRecipeCategorySauces);

        testRecipies.add(testRecipeBechamelSauce);

        testRecipeBechamelSauce = new Recipe("Bechamel", testRecipeIngredients, testRecipeInstructionBechamel, testRecipeCategories);
        testObject.save(testRecipeBechamelSauce);


//        RECIPE
//        int id;
//        String recipeName;
//        List<RecipeIngredient> recipeIngredientCollection;
//        private RecipeInstruction recipeInstruction;
//        private List<RecipeCategory> recipeCategories;


//        RECIPE_REPOSITORY
//        @Query("select r from Recipe r where r.recipeName like '%name%'")
//        List<Recipe> findByRecipeName (@Param("recipeName")String recipeName);


//        RECIPE_INGREDIENT
//        private String id;
//        private Ingredient ingredient;
//        private double measuredAmount;
//        private Measurement measurementUnit;
//        private Recipe recipe;


//        RECIPE_INSTRUCTION
//        private String id;
//        private String recipeInstructions;


//        RECIPE_CATEGORY
//        private int id;
//        private String category;
//        private List<Recipe> recipes;

    }
    @Test
    @DisplayName("Test 1 - createObject")
    public void test_created_object(){
        //Assertions.assertEquals(1, testObject.findById(1).get().getId());
        Recipe expectedObject = new Recipe(1,"Bechamel", testRecipeIngredients, testRecipeInstructionBechamel, testRecipeCategories);
        Recipe actualObject = testRecipeBechamelSauce;
        Assertions.assertEquals(expectedObject, actualObject);
    }

    @Test
    @DisplayName("Test 2 - findRecipeByRecipeNameContains()")
    public void test_find_recipe_by_recipe_name_contains(){
        String expectedRecipe =  "Bechamel";
        String actualRecipe = testObject.findRecipeByRecipeNameContains("echa").get(0).getRecipeName();
        Assertions.assertEquals(expectedRecipe, actualRecipe);
    }

    @Test
    @DisplayName("Test 3 - findRecipesByRecipeIngredients_Ingredient_Ingredient()")
    public void find_Recipes_By_Recipe_Ingredients_Ingredient_Ingredient(){
        String expectedRecipe = "Bechamel";
        String actualRecipe = testObject.findRecipesByRecipeIngredients_Ingredient_Ingredient("Mjölk").get(0).getRecipeName();
        Assertions.assertEquals(expectedRecipe, actualRecipe);
    }

    @Test
    @DisplayName("Test 4 - findRecipesByRecipeCategories_Category()")
    public void find_Recipes_By_Recipe_Categories_Category(){
        String expectedRecipe = "Bechamel";
        String actualRecipe = testObject.findRecipesByRecipeCategories_Category("Sauces").get(0).getRecipeName();
        Assertions.assertEquals(expectedRecipe, actualRecipe);
    }

    @Test
    @DisplayName("Test 5 - findRecipesByRecipeCategories_Recipes_Name()")
    public void find_Recipes_By_Recipe_Categories_Recipes_Name(){
        String expectedRecipe = "Bechamel";
        String actualRecipe = testObject.findRecipesByRecipeCategories_Recipes_RecipeName("Bechamel").get(0).getRecipeName();
        Assertions.assertEquals(expectedRecipe, actualRecipe);
    }


}
