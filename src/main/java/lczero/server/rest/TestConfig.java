package lczero.server.rest;

import java.io.Serializable;

// Tells server how to configure themselves for a test.
public class TestConfig implements Serializable {
    public long testID;

    public String baseUrlForLc0;
    public String lc0filename; // Where to download binary for test.

    public String baseUrlForTools; // Where to download supporting tools

    public String network1; // sha1  for network1.
    public String network2;

    public String parameters; // Additional command line to use.
    public String tcControl; // In format that chess engines understand
}
