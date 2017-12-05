package com.amazon.device.iap.model;

import java.util.List;

/**
 * Created by alexandre on 05/12/17.
 */

public class PurchaseUpdatesResponse {
    public int getRequestStatus() {
        return 0;
    }

    public List<Receipt> getReceipts() {
        return null;
    }

    public String getRequestId() {
        return null;
    }

    public boolean hasMore() {
        return false;
    }

    public UserData getUserData() {
        return null;
    }
}
