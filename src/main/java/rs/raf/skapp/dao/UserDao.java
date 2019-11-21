package rs.raf.skapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import rs.raf.skapp.domain.User;

import java.util.List;
import java.util.Optional;

public interface UserDao extends JpaRepository<User, Long> {

    List<User> findByEmailEndsWith (String sufix);

    Optional<User> findByEmailAndPassword (String email, String password);

}
