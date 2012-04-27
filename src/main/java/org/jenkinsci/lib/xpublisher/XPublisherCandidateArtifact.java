package org.jenkinsci.lib.xpublisher;

import hudson.FilePath;

import java.io.Serializable;

/**
 * @author Gregory Boissinot
 */
public class XPublisherCandidateArtifact implements Serializable {

    private FilePath location;

    public XPublisherCandidateArtifact(FilePath location) {
        this.location = location;
    }

    public FilePath getLocation() {
        return location;
    }
}
