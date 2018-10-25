package lczero.server.rest;

import java.io.Serializable;

// Tells server how to configure themselves for a test.
public class TestConfig implements Serializable {
    public long testID;
    public String lc0url; // Where to download binary for test.
    public String baseUrlForTools;
    public String parameters; // Additional command line to use.
    public String tcControl; // In format that chess engines understand
}
