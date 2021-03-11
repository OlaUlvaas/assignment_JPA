package se.lexicon.assignment_JPA.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;
@Entity
public class RecipeIngredient {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name ="UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;
    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE,CascadeType.DETACH,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinColumn(table = "recipe_ingredient", name = "ingredient_id")
    private Ingredient ingredient;
    @Column(nullable = false)
    private double measuredAmount;
    private Measurement measurementUnit;
    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE,CascadeType.DETACH,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinColumn(name = "recipe_id")
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
