package se.lexicon.assignment_JPA.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import se.lexicon.assignment_JPA.entity.Ingredient;
import se.lexicon.assignment_JPA.entity.Recipe;

import java.util.List;
import java.util.Optional;

public interface RecipeRepository extends CrudRepository<Recipe, Integer> {
    //Search for recipes where recipe name contains specified String
    //Search for all recipes that contains a specified ingredient name.e.g. potato, tomato, salt, etc
    //Search for all recipes that belong to a specific recipe category.e.g. Chicken, Vegan, Celebration, Weekend etc
    //Search for all recipes that match one or more categories.e.g. {”Spicy”,”Mexican”,”Weekend”}

    List<Recipe> findRecipeByRecipeNameContains(String recipeName);

    List<Recipe> findRecipesByRecipeIngredients_Ingredient_Ingredient(String ingredient);

    List<Recipe> findRecipesByRecipeCategories_Category(String category);

    List<Recipe> findRecipesByRecipeCategories_Recipes_RecipeName(String name);

}
