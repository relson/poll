package ws.relink.poll.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class User {
    @Id
    //@Generated(strategy = ID////ENTITY)
    private Long id;
}