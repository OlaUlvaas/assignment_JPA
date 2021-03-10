package se.lexicon.assignment_JPA.entity;

import java.util.List;
import java.util.Objects;

public class Recipe {

    private int id;
    private String recipeName;
    private List<RecipeIngredient> recipeIngredient;
    private RecipeInstruction recipeInstruction;
    private List<RecipeCategory> recipeCategories;

    //Contains an id of type int.
    //Contains a recipe name of type String.
    //Contains a collection of recipeingredients.When you remove content from this
    //collection make sure to implement automagical removal of this
    //RecipeIngredient
    //Contains recipe instructions of type RecipeInstruction
    //Contains a collection of RecipeCategory
    //""""recipeIngredient""""
    //When you remove content from this collection make sure
    //to implement automagical removal of this RecipeIngredient. (OHRF.....something)


    public Recipe() {
    }

    public Recipe(String recipeName, List<RecipeIngredient> recipeIngredient, RecipeInstruction recipeInstruction, List<RecipeCategory> recipeCategories) {
        this.recipeName = recipeName;
        this.recipeIngredient = recipeIngredient;
        this.recipeInstruction = recipeInstruction;
        this.recipeCategories = recipeCategories;
    }

    public Recipe(int id, String recipeName, List<RecipeIngredient> recipeIngredient, RecipeInstruction recipeInstruction, List<RecipeCategory> recipeCategories) {
        this.id = id;
        this.recipeName = recipeName;
        this.recipeIngredient = recipeIngredient;
        this.recipeInstruction = recipeInstruction;
        this.recipeCategories = recipeCategories;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public List<RecipeIngredient> getRecipeIngredient() {
        return recipeIngredient;
    }

    public void setRecipeIngredient(List<RecipeIngredient> recipeIngredient) {
        this.recipeIngredient = recipeIngredient;
    }

    public RecipeInstruction getRecipeInstruction() {
        return recipeInstruction;
    }

    public void setRecipeInstruction(RecipeInstruction recipeInstruction) {
        this.recipeInstruction = recipeInstruction;
    }

    public List<RecipeCategory> getRecipeCategories() {
        return recipeCategories;
    }

    public void setRecipeCategories(List<RecipeCategory> recipeCategories) {
        this.recipeCategories = recipeCategories;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return id == recipe.id && Objects.equals(recipeName, recipe.recipeName) && Objects.equals(recipeIngredient, recipe.recipeIngredient) && Objects.equals(recipeInstruction, recipe.recipeInstruction) && Objects.equals(recipeCategories, recipe.recipeCategories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, recipeName, recipeIngredient, recipeInstruction, recipeCategories);
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "id=" + id +
                ", recipeName='" + recipeName + '\'' +
                ", recipeIngredient=" + recipeIngredient +
                ", recipeInstruction=" + recipeInstruction +
                ", recipeCategories=" + recipeCategories +
                '}';
    }
}
