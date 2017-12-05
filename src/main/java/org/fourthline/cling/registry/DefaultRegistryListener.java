package org.fourthline.cling.registry;

import org.fourthline.cling.model.meta.LocalDevice;
import org.fourthline.cling.model.meta.RemoteDevice;

/**
 * Created by alexandre on 05/12/17.
 */

public class DefaultRegistryListener extends RegistryListener {

    public void remoteDeviceAdded(Registry registry, RemoteDevice device)  {  }

    public void remoteDeviceRemoved(Registry registry, RemoteDevice device){  }

    public void localDeviceAdded(Registry registry, LocalDevice device)    {  }

    public void localDeviceRemoved(Registry registry, LocalDevice device)  {  }
}
