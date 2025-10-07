package com.disney.wdpro.photopass_plus.models;

import com.disney.wdpro.ticket_sales_base_lib.business.checkout.models.BookingStatus;
import java.io.Serializable;

/* loaded from: classes15.dex */
public class PurchasedProduct implements Serializable {
    private String guestMediaId;
    private BookingStatus orderStatus;
    private PhotoPassProduct photoPassProduct;

    public PurchasedProduct(PhotoPassProduct photoPassProduct, BookingStatus bookingStatus, String str) {
        this.photoPassProduct = photoPassProduct;
        this.orderStatus = bookingStatus;
        this.guestMediaId = str;
    }

    public BookingStatus getBookingStatus() {
        return this.orderStatus;
    }

    public String getGuestMediaId() {
        return this.guestMediaId;
    }

    public PhotoPassProduct getPhotoPassProduct() {
        return this.photoPassProduct;
    }
}