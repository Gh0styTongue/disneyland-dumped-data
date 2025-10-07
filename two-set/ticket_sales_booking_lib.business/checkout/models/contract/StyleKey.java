package com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.contract;

import com.google.gson.annotations.SerializedName;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.Serializable;

@SuppressFBWarnings
/* loaded from: classes18.dex */
public class StyleKey implements Serializable {

    @SerializedName("AppearanceKey")
    private String appearanceKey;

    @SerializedName("HeightKey")
    private int heightKey;

    @SerializedName("SizeKey")
    private int sizeKey;

    public String getAppearanceKey() {
        return this.appearanceKey;
    }

    public int getHeightKey() {
        return this.heightKey;
    }

    public int getSizeKey() {
        return this.sizeKey;
    }

    public void setAppearanceKey(String str) {
        this.appearanceKey = str;
    }

    public void setHeightKey(int i10) {
        this.heightKey = i10;
    }

    public void setSizeKey(int i10) {
        this.sizeKey = i10;
    }

    public String toString() {
        return "ClassPojo [heightKey = " + this.heightKey + ", AppearanceKey = " + this.appearanceKey + "]";
    }
}