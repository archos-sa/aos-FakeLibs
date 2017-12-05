package org.fourthline.cling.android;

import org.fourthline.cling.UpnpService;
import org.fourthline.cling.controlpoint.ActionCallback;
import org.fourthline.cling.controlpoint.ControlPoint;
import org.fourthline.cling.model.message.header.UDADeviceTypeHeader;
import org.fourthline.cling.registry.Registry;

/**
 * Created by alexandre on 05/12/17.
 */

public interface AndroidUpnpService{

    public ControlPoint getControlPoint();

    public Registry getRegistry();


}
