package se.lexicon.assignment_JPA.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;
@Entity
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false,length = 50,unique = true)
    private String ingredient;

    public Ingredient() {
    }

    public Ingredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public Ingredient(int id, String ingredient) {
        this.id = id;
        this.ingredient = ingredient;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ingredient that = (Ingredient) o;
        return id == that.id && Objects.equals(ingredient, that.ingredient);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ingredient);
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "id=" + id +
                ", ingredient='" + ingredient + '\'' +
                '}';
    }
}
