package byAJ.Securex.repositories;

import byAJ.Securex.models.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by student on 6/29/17.
 */
public interface UserRepository extends CrudRepository<User,Long> {

    public User findByUsername(String username);
}
