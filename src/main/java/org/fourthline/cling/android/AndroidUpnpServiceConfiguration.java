package org.fourthline.cling.android;

import org.fourthline.cling.UpnpServiceConfiguration;
import org.fourthline.cling.model.meta.Service;
import org.fourthline.cling.support.model.item.Item;
import org.fourthline.cling.transport.spi.NetworkAddressFactory;

/**
 * Created by alexandre on 05/12/17.
 */

public class AndroidUpnpServiceConfiguration extends UpnpServiceConfiguration{
    public Service getSyncProtocolExecutorService(){
        return null;
    }
    protected NetworkAddressFactory createNetworkAddressFactory(int streamListenPort){ return null;}

}
