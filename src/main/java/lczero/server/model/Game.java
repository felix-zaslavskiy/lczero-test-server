package lczero.server.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
public class Game implements Serializable  {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    TestRun testRun;

    @ManyToOne
    User user;

    LocalDateTime createdDate = LocalDateTime.now();
    boolean completed;


    String openingPNG;
    String PNG;

}
