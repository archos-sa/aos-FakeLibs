package org.fourthline.cling.model.message.header;

import org.seamless.util.MimeType;

/**
 * Created by alexandre on 05/12/17.
 */

public class ContentTypeHeader {
    public static MimeType DEFAULT_CONTENT_TYPE_UTF8 = null;
    public MimeType getValue(){
        return new MimeType();
    }
}
