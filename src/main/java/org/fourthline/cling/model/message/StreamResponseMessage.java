package org.fourthline.cling.model.message;

import java.io.UnsupportedEncodingException;

/**
 * Created by alexandre on 05/12/17.
 */

public class StreamResponseMessage {
    public StreamResponseMessage(UpnpResponse UpnpResponse){

    }

    public void setHeaders(UpnpHeaders UpnpHeaders){

    }

    public boolean isContentTypeMissingOrText(){
        return false;
    }

    public void setBodyCharacters(byte[] bytes) throws UnsupportedEncodingException {

    }
    public void setBody(int type, Object obj){

    }
}
