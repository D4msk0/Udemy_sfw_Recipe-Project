package damsko.springframework.RecipeProject.repositories;

import damsko.springframework.RecipeProject.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
