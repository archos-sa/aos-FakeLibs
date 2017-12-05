package com.amazon.device.iap.model;

import java.util.Map;

/**
 * Created by alexandre on 05/12/17.
 */

public class ProductDataResponse {
    public int getRequestStatus() {
        return 0;
    }

    public String[] getUnavailableSkus() {
        return new String[0];
    }

    public Map<String, Product> getProductData() {
        return null;
    }
}
