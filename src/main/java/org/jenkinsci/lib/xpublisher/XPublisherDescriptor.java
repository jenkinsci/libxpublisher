package org.jenkinsci.lib.xpublisher;

import hudson.model.Descriptor;

/**
 * @author Gregory Boissinot
 */
public abstract class XPublisherDescriptor<T> extends Descriptor {

    public abstract String getLabel();

    public abstract Class<?> getType();

    @SuppressWarnings("unused")
    public String getTypePackageName() {
        return getType().getName();
    }
}
