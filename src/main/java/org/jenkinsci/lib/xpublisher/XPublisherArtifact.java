package org.jenkinsci.lib.xpublisher;

import hudson.FilePath;

import java.io.Serializable;

/**
 * @author Gregory Boissinot
 */
public class XPublisherArtifact implements Serializable {

    private String origin;

    private FilePath filePath;

    public XPublisherArtifact(String origin, FilePath filePath) {
        this.origin = origin;
        this.filePath = filePath;
    }

    public String getOrigin() {
        return origin;
    }

    public FilePath getFilePath() {
        return filePath;
    }
}