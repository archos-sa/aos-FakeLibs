package org.fourthline.cling.support.model.item;

import org.fourthline.cling.support.model.DIDLObject;

/**
 * Created by alexandre on 05/12/17.
 */

public class Item {

    public String getTitle(){
        return null;
    }

    public Ressource getFirstResource(){
        return null;
    }

    public DIDLObject.Property getFirstProperty(Class cl){
        return null;
    }

    public static class Ressource{
        public String getValue(){
            return null;
        }
        public ProtocolInfo getProtocolInfo(){
            return null;
        }
        public long getSize(){return -1;}
    }

    public static class ProtocolInfo{
        public String getContentFormatMimeType(){
            return null;
        }
    }
}
