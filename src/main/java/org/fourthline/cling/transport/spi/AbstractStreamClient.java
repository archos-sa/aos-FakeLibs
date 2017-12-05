package org.fourthline.cling.transport.spi;

import org.fourthline.cling.model.message.StreamRequestMessage;
import org.fourthline.cling.model.message.StreamResponseMessage;
import org.fourthline.cling.transport.impl.jetty.StreamClientConfigurationImpl;

import java.util.concurrent.Callable;

/**
 * Created by alexandre on 05/12/17.
 */

public class AbstractStreamClient <Object, ContentExchange> extends StreamClient {

    protected ContentExchange createRequest(StreamRequestMessage requestMessage) {
        return null;
    }


    protected Callable<StreamResponseMessage> createCallable(final StreamRequestMessage requestMessage,
                                                             final ContentExchange exchange) {
        return null;
    }


    public StreamClientConfigurationImpl getConfiguration() {
        return null;
    }

    protected void abort(ContentExchange exchange) {}

    protected boolean logExecutionException(Throwable t) {
        return false;
    }

    public void stop() {

    }
}
