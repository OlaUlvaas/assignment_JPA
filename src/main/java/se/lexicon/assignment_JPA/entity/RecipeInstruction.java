package se.lexicon.assignment_JPA.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Objects;
@Entity
public class RecipeInstruction {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name ="UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;
    @Column(nullable = false,length = 50)
    private String recipeInstructions;

    public RecipeInstruction() {
    }

    public RecipeInstruction(String recipeInstruction) {
        this.recipeInstructions = recipeInstruction;
    }

    public RecipeInstruction(String id, String recipeInstruction) {
        this.id = id;
        this.recipeInstructions = recipeInstruction;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRecipeInstruction() {
        return recipeInstructions;
    }

    public void setRecipeInstruction(String recipeInstruction) {
        this.recipeInstructions = recipeInstruction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecipeInstruction that = (RecipeInstruction) o;
        return Objects.equals(id, that.id) && Objects.equals(recipeInstructions, that.recipeInstructions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, recipeInstructions);
    }

    @Override
    public String toString() {
        return "RecipeInstruction{" +
                "id='" + id + '\'' +
                ", recipeInstruction='" + recipeInstructions + '\'' +
                '}';
    }
}
