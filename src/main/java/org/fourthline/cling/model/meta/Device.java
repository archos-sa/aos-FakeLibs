package org.fourthline.cling.model.meta;

/**
 * Created by alexandre on 05/12/17.
 */

public class Device {

    public Details getDetails(){
        return null;
    }


    public String getDisplayString(){return null;}

    public Service findService(Service service){
        return null;
    }
    public static class Details{
        public ManufacturerDetails getManufacturerDetails(){
            return null;
        }

        public static class ManufacturerDetails{
            public String getManufacturer(){
                return null;
            }

        }
        public Details getModelDetails(){
            return null;
        }
        public String getModelName(){
            return null;
        }

        public String getFriendlyName() {
            return null;
        }
    }
}
