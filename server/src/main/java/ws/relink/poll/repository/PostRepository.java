package ws.relink.poll.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import ws.relink.poll.model.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    
}