package tacos.data;

import tacos.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User findbyUsername(String username);

    User findByUsername(String username);
}
