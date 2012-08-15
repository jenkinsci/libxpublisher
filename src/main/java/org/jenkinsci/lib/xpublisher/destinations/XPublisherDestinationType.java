package org.jenkinsci.lib.xpublisher.destinations;

import hudson.ExtensionPoint;
import hudson.model.Describable;
import hudson.model.Descriptor;
import hudson.model.Hudson;
import org.jenkinsci.lib.xpublisher.XPublisherArtifact;
import org.jenkinsci.lib.xpublisher.XPublisherException;
import org.jenkinsci.lib.xpublisher.XPublisherLogger;

import java.io.Serializable;
import java.util.List;

/**
 * @author Gregory Boissinot
 */
public abstract class XPublisherDestinationType implements ExtensionPoint, Describable<XPublisherDestinationType>, Serializable {

    public abstract void publish(List<XPublisherArtifact> artifactList, XPublisherLogger log) throws XPublisherException;

    public Descriptor<XPublisherDestinationType> getDescriptor() {
        return Hudson.getInstance().getDescriptor(getClass());
    }
}
