package lczero.server;

import lczero.server.model.Build;
import lczero.server.model.TestRun;
import lczero.server.repos.BuildRepository;
import lczero.server.repos.TestRunRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

@EntityScan(basePackageClasses = { Application.class, Jsr310JpaConverters.class })
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner test(BuildRepository buildRepository, TestRunRepository testRunRepository) {
        return (args) -> {

            // Create some default test accounts if they does not exist yet.
            Build b  = new Build();
            b.setPlatform("windows");
            b.setBackend("cuda");
            b.setUrl("http://localhost:8080/sampleBinary");
            b.setSignature("111");

            buildRepository.save(b);

            TestRun t = new TestRun();
            t.setBuild(b);

            testRunRepository.save(t);

        };
    }
}
