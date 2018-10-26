package lczero.server.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Network implements Serializable {

    @Id
    @GeneratedValue
    private Long id;


    private Integer networkId;
    private String sha1;


}
