package se.lexicon.assignment_JPA.repository;

import org.springframework.data.repository.CrudRepository;
import se.lexicon.assignment_JPA.entity.RecipeIngredient;

public interface RecipeIngredientRepository extends CrudRepository<RecipeIngredient, String> {
}
