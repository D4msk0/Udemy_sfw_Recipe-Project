package damsko.springframework.RecipeProject.services;

import damsko.springframework.RecipeProject.commands.UnitOfMeasureCommand;

import java.util.Set;

public interface UnitOfMeasureService {

    Set<UnitOfMeasureCommand> listAllUoms();
}
