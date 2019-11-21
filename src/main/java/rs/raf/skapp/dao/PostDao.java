package rs.raf.skapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import rs.raf.skapp.domain.Post;

public interface PostDao extends JpaRepository<Post, Long> {
}
