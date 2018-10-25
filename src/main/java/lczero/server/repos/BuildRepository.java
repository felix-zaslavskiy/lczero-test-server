package lczero.server.repos;

import lczero.server.model.Build;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BuildRepository extends JpaRepository<Build, Long> {
}
