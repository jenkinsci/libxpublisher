package org.jenkinsci.lib.xpublisher;

import java.io.Serializable;

/**
 * @author Gregory Boissinot
 */
public class XPublisherArtifact implements Serializable {

    private String origin;

    private String fileName;

    private String uri;

    public XPublisherArtifact(String origin, String fileName, String uri) {
        this.origin = origin;
        this.fileName = fileName;
        this.uri = uri;
    }

    public String getOrigin() {
        return origin;
    }

    public String getFileName() {
        return fileName;
    }

    public String getUri() {
        return uri;
    }
}