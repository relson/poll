package ws.relink.poll.model;

import java.time.Instant;
import java.util.List;

import javax.persistence.Entity;

import lombok.Builder;
import lombok.Data;

@Entity
@Builder
// @AllArgsConstructor
//@NoArgsConstructo
public class Subreddit {
    // @Id
    // @GeneratedValue(strategy = IDENTITY)
    private Long id;
    // @NotBlank(message = "Community name is required")
    private String name;
    // @NotBlank(message = "Descriptio is required")
    private String description;
    // @OneToMany(fetch= LAZY)
    private List<Post> posts;
    private Instant createdDate;
    private User user;
}