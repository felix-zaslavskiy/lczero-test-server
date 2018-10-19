package lczero.worker;

import lczero.worker.rest.GameSubmission;
import lczero.worker.rest.TestConfig;
import lczero.worker.rest.Game;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorkerController {

    private static final Logger log = LoggerFactory.getLogger(WorkerController.class);

    // Gets information where to download the correct binary.
    @GetMapping("getConfig")
    TestConfig getConfig(String user, String password, String os, String backend) {
        return null;
    }

    // Get information about the game to play next
    @GetMapping("/newGame")
    Game getNewGame(String user, String password) {
        return null;
    }

    // Submit Game results
    @PostMapping("/submmitGame")
    ResponseEntity submitGame(String user, String password, @RequestBody GameSubmission gameSubmission){
        return null;
    }


}

