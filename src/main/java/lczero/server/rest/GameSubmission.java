package lczero.server.rest;

// Game submitted by server after it was finished being played.
public class GameSubmission {

    public long testID;
    public String PGN; // The PGN of the finished game moves.
    public String openingPGN; // Any opening start position used.

}
