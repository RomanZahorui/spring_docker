package spring.examples.tacocloud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import spring.examples.tacocloud.model.Order;

@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {
}
