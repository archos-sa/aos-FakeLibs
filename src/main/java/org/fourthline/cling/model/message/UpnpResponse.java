package org.fourthline.cling.model.message;

/**
 * Created by alexandre on 05/12/17.
 */

public class UpnpResponse {
    public UpnpResponse(int i, String str){

    }
    public static class Status{
        public String getStatusMsg(){
            return null;
        }
        public static Status getByStatusCode(int me){
            return new Status();
        }
    }
}
