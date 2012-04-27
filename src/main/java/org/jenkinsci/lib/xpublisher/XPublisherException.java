package org.jenkinsci.lib.xpublisher;

/**
 * @author Gregory Boissinot
 */
public class XPublisherException extends RuntimeException {

    public XPublisherException() {
    }

    public XPublisherException(String s) {
        super(s);
    }

    public XPublisherException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public XPublisherException(Throwable throwable) {
        super(throwable);
    }
}
