package se.lexicon.assignment_JPA.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

public class RecipeIngredient {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name ="UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;
    private Ingredient ingredient;
    private double measuredAmount;
    private Measurement measurementUnit;
    private Recipe recipe;

    public RecipeIngredient() {
    }

    public RecipeIngredient(Ingredient ingredient, double measuredAmount, Measurement measurementUnit, Recipe recipe) {
        this.ingredient = ingredient;
        this.measuredAmount = measuredAmount;
        this.measurementUnit = measurementUnit;
        this.recipe = recipe;
    }

    public RecipeIngredient(String id, Ingredient ingredient, double measuredAmount, Measurement measurementUnit, Recipe recipe) {
        this.id = id;
        this.ingredient = ingredient;
        this.measuredAmount = measuredAmount;
        this.measurementUnit = measurementUnit;
        this.recipe = recipe;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public double getMeasuredAmount() {
        return measuredAmount;
    }

    public void setMeasuredAmount(double measuredAmount) {
        this.measuredAmount = measuredAmount;
    }

    public Measurement getMeasurementUnit() {
        return measurementUnit;
    }

    public void setMeasurementUnit(Measurement measurementUnit) {
        this.measurementUnit = measurementUnit;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }
}
