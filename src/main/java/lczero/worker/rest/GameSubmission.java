package lczero.worker.rest;

import java.io.Serializable;

// Game submitted by worker after it was finished being played.
public class GameSubmission {

    public long testID;
    public String PGN; // The PGN of the finished game moves.
    public String openingPGN; // Any opening start position used.

}
