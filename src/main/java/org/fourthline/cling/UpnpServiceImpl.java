package org.fourthline.cling;

import org.fourthline.cling.controlpoint.ControlPoint;
import org.fourthline.cling.protocol.ProtocolFactory;
import org.fourthline.cling.registry.Registry;
import org.fourthline.cling.transport.Router;

/**
 * Created by alexandre on 05/12/17.
 */

public class UpnpServiceImpl implements UpnpService{

    public UpnpServiceImpl(UpnpServiceConfiguration conf){

    }
    @Override
    public Registry getRegistry() {
        return null;
    }
    public UpnpServiceConfiguration getConfiguration(){
        return null;
    }
    public Router getRouter(){
        return null;
    }
    public synchronized void shutdown() {

    }

    @Override
    public ControlPoint getControlPoint() {
        return null;
    }

    public synchronized void shutdown(boolean ter) {

    }
    protected Router createRouter(ProtocolFactory protocolFactory, Registry registry) {
        return null;
    }

}
