package org.jenkinsci.lib.xpublisher.destinations;

import hudson.model.Descriptor;

/**
 * @author Gregory Boissinot
 */
public abstract class XPublisherDestinationTypeDescriptor<T extends XPublisherDestinationType> extends Descriptor<XPublisherDestinationType> {

    public abstract String getLabel();

    public abstract Class<?> getType();

    @SuppressWarnings("unused")
    public String getTypeName() {
        return getType().getName();
    }
}
