package se.lexicon.assignment_JPA.repository;

import org.springframework.data.repository.CrudRepository;
import se.lexicon.assignment_JPA.entity.RecipeInstruction;

public interface RecipeInstructionRepository extends CrudRepository<RecipeInstruction, String> {
}
