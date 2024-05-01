package damsko.springframework.RecipeProject.repositories;

import damsko.springframework.RecipeProject.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
