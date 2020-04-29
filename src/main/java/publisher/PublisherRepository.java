package publisher;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface PublisherRepository extends CrudRepository<PublisherEntity, Integer> {

}
