package org.fourthline.cling.transport.spi;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.List;

/**
 * Created by alexandre on 05/12/17.
 */

public class NetworkAddressFactory {

    public List<String> useAddresses;
    public NetworkAddressFactory(int i){}

    protected boolean isUsableAddress(NetworkInterface networkInterface, InetAddress address) {
        return false;
    }
}
