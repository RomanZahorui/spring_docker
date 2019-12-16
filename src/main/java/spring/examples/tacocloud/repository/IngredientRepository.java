package spring.examples.tacocloud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import spring.examples.tacocloud.model.Ingredient;

@Repository
public interface IngredientRepository extends CrudRepository<Ingredient, String> {
}
