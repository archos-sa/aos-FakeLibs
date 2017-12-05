package org.fourthline.cling;

import org.fourthline.cling.android.AndroidUpnpService;
import org.fourthline.cling.controlpoint.ControlPoint;
import org.fourthline.cling.model.meta.Service;
import org.fourthline.cling.registry.Registry;

/**
 * Created by alexandre on 05/12/17.
 */

public interface UpnpService{
    public Registry getRegistry();
    public void shutdown();

    public UpnpServiceConfiguration getConfiguration();
    public ControlPoint getControlPoint();

}
