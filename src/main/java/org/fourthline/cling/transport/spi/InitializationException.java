package org.fourthline.cling.transport.spi;

/**
 * Created by alexandre on 05/12/17.
 */

public class InitializationException extends Exception {
    public InitializationException(String e, Exception e2){
        super(e);
    }
}
