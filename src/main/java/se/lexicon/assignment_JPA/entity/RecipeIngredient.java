package se.lexicon.assignment_JPA.entity;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Target;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class RecipeIngredient {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name ="UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id", updatable = false, nullable = false)
    private String id;
    @ManyToOne(cascade = {CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinColumn(name = "ingredient_id")
    private Ingredient ingredient;

    private double measuredAmount;
    private Measurement measurementUnit;
    @ManyToOne(cascade = {CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecipeIngredient that = (RecipeIngredient) o;
        return Double.compare(that.measuredAmount, measuredAmount) == 0 && Objects.equals(id, that.id) && Objects.equals(ingredient, that.ingredient) && measurementUnit == that.measurementUnit && Objects.equals(recipe, that.recipe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ingredient, measuredAmount, measurementUnit, recipe);
    }

    @Override
    public String toString() {
        return "RecipeIngredient{" +
                "id='" + id + '\'' +
                ", ingredient=" + ingredient +
                ", measuredAmount=" + measuredAmount +
                ", measurementUnit=" + measurementUnit +
                ", recipe=" + recipe +
                '}';
    }
}

