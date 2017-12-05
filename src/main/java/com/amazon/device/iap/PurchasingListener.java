package com.amazon.device.iap;

import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.UserDataResponse;

public interface PurchasingListener {
    public static final int SUCCESSFUL = 0;
    public static final int FAILED = 1;
    public static final int INVALID_SKU = 2;
    public static final int ALREADY_PURCHASED = 3;
    void onUserDataResponse(UserDataResponse var1);

    void onProductDataResponse(ProductDataResponse var1);

    void onPurchaseResponse(PurchaseResponse var1);

    void onPurchaseUpdatesResponse(PurchaseUpdatesResponse var1);
}
