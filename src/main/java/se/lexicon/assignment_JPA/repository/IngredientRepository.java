package se.lexicon.assignment_JPA.repository;

import org.springframework.data.repository.CrudRepository;
import se.lexicon.assignment_JPA.entity.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, Integer> {
    //Search for a specific ingredient name by specified String
    //Search for ingredient that name particularly corresponded with search string.
}
