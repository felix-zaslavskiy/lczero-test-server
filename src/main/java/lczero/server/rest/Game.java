package lczero.server.rest;


// Defines the game that is issued to server to play
public class Game {

    public long testID; // Worker can lookup Configs by the testID
    public long expirationDate; // How long server will wait for results

    public long openingPGN; // This game has preset opening moves. Optional

}
