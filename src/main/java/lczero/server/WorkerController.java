package lczero.server;

import lczero.server.model.Build;
import lczero.server.rest.GameSubmission;
import lczero.server.rest.TestConfig;
import lczero.server.rest.Game;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.InputStream;

@RestController
public class WorkerController {

    private static final Logger log = LoggerFactory.getLogger(WorkerController.class);

    // Gets information for an active test with some all the necessary info.
    // The workers capabilities are passed as parameters.
    @GetMapping("getTestConfig")
    TestConfig getTestConfig(String user, String password, String os, String backend) {
        TestConfig t = new TestConfig();
        t.lc0url = "http://localhost:8080/lc0-v0.18.1-windows-opencl.zip";
        t.parameters = "";
        t.testID = 1;
        t.tcControl = "10.0+1";
        return t;
    }



    // Get information about the game to play next
    @GetMapping("/newGame")
    Game getNewGame(String user, String password, long testID) {
        Game g = new Game();
        g.expirationDate = System.currentTimeMillis() + 3600*100;
        g.openingPGN = "";
        g.testID = testID;
        return g;
    }

    // Submit Game results
    @PostMapping("/submitGame")
    ResponseEntity submitGame(String user, String password, @RequestBody GameSubmission gameSubmission){

        log.info("Received Game for test {}, PGN: {}", gameSubmission.testID, gameSubmission.PGN);
        return ResponseEntity.ok().build();

    }


    // Just for testing. TODO: disable in prod.
    // Returns a file so server client can be tested.
    @GetMapping("/lc0-v0.18.1-windows-opencl.zip")
    ResponseEntity<InputStreamResource> sampleBinary() {

        InputStream inputStream = WorkerController.class.getResourceAsStream("/lc0-v0.18.1-windows-opencl.zip");
        InputStreamResource resource = new InputStreamResource(inputStream);

        return ResponseEntity.ok().body(resource);

    }

}

