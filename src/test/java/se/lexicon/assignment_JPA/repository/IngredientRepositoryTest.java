package se.lexicon.assignment_JPA.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import se.lexicon.assignment_JPA.entity.Ingredient;

import java.util.Optional;

@DataJpaTest
public class IngredientRepositoryTest {
    @Autowired

    IngredientRepository testObject;
    Ingredient ingredient;

    @BeforeEach
    public void setup(){
        ingredient = new Ingredient(1, "Vetemjöl");
        testObject.save(ingredient);
    }

    @Test
    @DisplayName("Test - isPresent")
    public void find_ingredient_by_ingredient_is_present(){
        Optional<Ingredient> findIngredient = testObject.findIngredientByIngredient("Vetemjöl");
        Assertions.assertTrue(findIngredient.isPresent());

        System.out.println("----------------------------------");
        System.out.println("findIngredient.toString() = " + findIngredient.toString());
    }

    @Test
    @DisplayName("Test - EqualsIngredientName")
    public void find_ingredient_by_ingredient_equals_ingredient_name(){
        Optional<Ingredient> findIngredient = testObject.findIngredientByIngredient("Vetemjöl");
        Assertions.assertTrue(findIngredient.isPresent());
        String expectedIngredientName = "Vetemjöl";
        String actualIngredientName = findIngredient.get().getIngredient();
        Assertions.assertEquals(expectedIngredientName, actualIngredientName);

        System.out.println("----------------------------------");
        System.out.println("findIngredient.toString() = " + findIngredient.toString());
    }

    @Test
    @DisplayName("Test - EqualIngredientId")
    public void find_ingredient_by_ingredient_equals_id(){
        Optional<Ingredient> findIngredient = testObject.findIngredientByIngredient("Vetemjöl");
        Assertions.assertTrue(findIngredient.isPresent());
        int expectedIngredientId = 1;
        int actualIngredientId = findIngredient.get().getId();
        Assertions.assertEquals(expectedIngredientId, actualIngredientId);

        System.out.println("----------------------------------");
        System.out.println("findIngredient = " + findIngredient);
    }
}
