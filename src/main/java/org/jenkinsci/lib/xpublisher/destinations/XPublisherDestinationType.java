package org.jenkinsci.lib.xpublisher.destinations;

import hudson.ExtensionPoint;
import hudson.model.Describable;
import hudson.model.Descriptor;
import hudson.model.Hudson;

import java.io.Serializable;

/**
 * @author Gregory Boissinot
 */
public abstract class XPublisherDestinationType implements ExtensionPoint, Describable<XPublisherDestinationType>, Serializable{

    public Descriptor<XPublisherDestinationType> getDescriptor() {
        return Hudson.getInstance().getDescriptor(getClass());
    }
}
