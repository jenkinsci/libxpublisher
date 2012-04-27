package org.jenkinsci.lib.xpublisher.types;

import hudson.model.Descriptor;

/**
 * @author Gregory Boissinot
 */
public abstract class XPublisherTypeDescriptor<T extends XPublisherType> extends Descriptor<XPublisherType> {

    public abstract String getLabel();

    public abstract Class<?> getType();

    @SuppressWarnings("unused")
    public String getTypeName() {
        return getType().getName();
    }
}