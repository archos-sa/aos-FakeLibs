package org.fourthline.cling.transport.impl.jetty;

import org.fourthline.cling.model.meta.Service;

import java.util.concurrent.ExecutorService;

/**
 * Created by alexandre on 05/12/17.
 */

public class StreamClientConfigurationImpl {
    public StreamClientConfigurationImpl(Service service){

    }
    public String getUserAgentValue(int majorVersion, int minorVersion){return null;}
    public ExecutorService getRequestExecutorService(){return null;}
    public int getTimeoutSeconds(){return -1;}
    public int getRequestRetryCount() {return -1;}
}
