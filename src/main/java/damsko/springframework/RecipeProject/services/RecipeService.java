package damsko.springframework.RecipeProject.services;

import damsko.springframework.RecipeProject.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
