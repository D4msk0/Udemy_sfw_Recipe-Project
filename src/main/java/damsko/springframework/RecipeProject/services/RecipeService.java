package damsko.springframework.RecipeProject.services;

import damsko.springframework.RecipeProject.commands.RecipeCommand;
import damsko.springframework.RecipeProject.domain.Recipe;

import java.util.Set;


public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(long id);

    RecipeCommand findCommandById(Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    void deleteById(long id);
}
