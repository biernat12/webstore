package webstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import webstore.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
