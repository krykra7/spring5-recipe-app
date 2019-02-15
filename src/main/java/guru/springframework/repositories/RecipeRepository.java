package guru.springframework.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.domain.Recipe;

/**
 * Created by kkrawczyk on 15.02.2019.
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
