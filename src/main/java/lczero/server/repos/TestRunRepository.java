package lczero.server.repos;

import lczero.server.model.TestRun;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRunRepository extends JpaRepository<TestRun, Long> {
}
