package org.jenkinsci.lib.xpublisher;

import hudson.model.TaskListener;

import java.io.Serializable;

/**
 * @author Gregory Boissinot
 */
public class XPublisherLogger implements Serializable {

    private TaskListener listener;

    public TaskListener getListener() {
        return listener;
    }

    public XPublisherLogger(TaskListener listener) {
        this.listener = listener;
    }

    public void info(String message) {
        listener.getLogger().println("[XPublisher]" + message);
    }
}