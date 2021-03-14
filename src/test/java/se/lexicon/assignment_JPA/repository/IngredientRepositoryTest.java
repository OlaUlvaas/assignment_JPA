package se.lexicon.assignment_JPA.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import se.lexicon.assignment_JPA.entity.Ingredient;

import java.util.List;
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
    @DisplayName("Test - findId")
    public void test1(){
        int expectecId = 1;
        int actualId = testObject.findIngredientByIngredient("Vetemjöl").get(0).getId();
        Assertions.assertEquals(expectecId, actualId);



    }

    @Test
    @DisplayName("Test - findIngredient")
    public void test2(){
        String expectectedIngredient = "Vetemjöl";
        String actualIngredient= testObject.findIngredientByIngredient("Vetemjöl").get(0).getIngredient();
        Assertions.assertEquals(expectectedIngredient, actualIngredient);

    }

    @Test
    @DisplayName("Test - findIngredientsByIngredientContains()")
    public void test3(){
        String expectectedContains = "Vetemjöl";
        String actualContains= testObject.findIngredientsByIngredientContains("mjö").get(0).getIngredient();
        Assertions.assertEquals(expectectedContains, actualContains);

    }

}
