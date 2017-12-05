package org.fourthline.cling.support.contentdirectory.callback;

import android.util.Log;

import org.fourthline.cling.controlpoint.ActionCallback;
import org.fourthline.cling.model.action.ActionInvocation;
import org.fourthline.cling.model.message.UpnpResponse;
import org.fourthline.cling.model.meta.Service;
import org.fourthline.cling.support.model.BrowseFlag;
import org.fourthline.cling.support.model.DIDLContent;

/**
 * Created by alexandre on 05/12/17.
 */

public class Browse extends ActionCallback {
    public Browse(Service service, String str, int flag){

    }

    public void failure(ActionInvocation arg0, UpnpResponse arg1, String arg2) { }

    public void updateStatus(Status status) {}


    public void received(ActionInvocation action, final DIDLContent content) { }

    public static class Status{}
}
