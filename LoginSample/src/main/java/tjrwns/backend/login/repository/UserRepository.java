package tjrwns.backend.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tjrwns.backend.login.model.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
