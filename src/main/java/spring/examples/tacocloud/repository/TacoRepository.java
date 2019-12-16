package spring.examples.tacocloud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import spring.examples.tacocloud.model.Taco;

@Repository
public interface TacoRepository extends CrudRepository<Taco, Long> {
}
