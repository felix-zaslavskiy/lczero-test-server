package lczero.server.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.time.LocalDateTime;


@Entity
public class TestRun implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    Build build;

    @ManyToOne
    Network network1;

    @ManyToOne
    Network network2;

    LocalDateTime createdDate = LocalDateTime.now();

    // Time Control for the test
    String tcControl;

    int won;
    int lost;
    int draws;

    boolean completed = false;

    @ManyToOne
    User createdBy;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Build getBuild() {
        return build;
    }

    public void setBuild(Build build) {
        this.build = build;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }
}
