package restaurant.restaurant.repository;

import org.springframework.data.repository.CrudRepository;
import restaurant.restaurant.model.Client;

public interface ClientRepository extends CrudRepository<Client,Integer> {
}
