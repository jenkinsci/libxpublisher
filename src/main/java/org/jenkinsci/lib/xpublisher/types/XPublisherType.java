package org.jenkinsci.lib.xpublisher.types;

import hudson.ExtensionPoint;
import hudson.model.AbstractBuild;
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
public abstract class XPublisherType implements ExtensionPoint, Describable<XPublisherType>, Serializable {

    public Descriptor<XPublisherType> getDescriptor() {
        return Hudson.getInstance().getDescriptor(getClass());
    }

    public abstract List<XPublisherArtifact> getArtifacts(AbstractBuild build, XPublisherLogger logger) throws XPublisherException;

}

