package lczero.server.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
public class User implements Serializable  {
    @Id
    @GeneratedValue
    private Long id;

    String username;
    String password;
    String email;

    boolean enabled = true;

    LocalDateTime createdDate = LocalDateTime.now();
}
