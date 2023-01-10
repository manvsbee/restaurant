package restaurant.restaurant.repository;

import org.springframework.data.repository.CrudRepository;
import restaurant.restaurant.model.Comanda;

public interface ComandaRepository extends CrudRepository<Comanda,Integer> {
}
