package lczero.worker.rest;

import java.io.Serializable;

// Tells worker how to configure themselves for a test.
public class TestConfig implements Serializable {
    public long testID;
    public String lc0url; // Where to download binary for test.
    public String parameters; // Additional command line to use.
    public String tcControl; // What sort of TC to use "short" or "long"
}
