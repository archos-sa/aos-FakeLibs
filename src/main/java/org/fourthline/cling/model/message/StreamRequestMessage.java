package org.fourthline.cling.model.message;

import org.fourthline.cling.model.message.header.ContentTypeHeader;

/**
 * Created by alexandre on 05/12/17.
 */

public class StreamRequestMessage {

    public UpnpRequest getOperation(){
        return null;
    }

    public int getUdaMajorVersion(){return -1;}
    public int getUdaMinorVersion(){return -1;}
    public int getBodyType(){return -1;}

    public ContentTypeHeader getContentTypeHeader(){
        return null;
    }

    public UpnpHeaders getHeaders(){
        return null;
    }
    public String getBodyString(){
        return null;
    }

    public byte[] getBodyBytes(){
        return null;
    }
    public String getContentTypeCharset(){return null;}

    public boolean hasBody(){
        return false;
    }
}
