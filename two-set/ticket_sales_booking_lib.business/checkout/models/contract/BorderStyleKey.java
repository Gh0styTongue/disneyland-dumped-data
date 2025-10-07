package com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.contract;

import com.google.gson.annotations.SerializedName;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.Serializable;

@SuppressFBWarnings
/* loaded from: classes18.dex */
public class BorderStyleKey implements Serializable {

    @SerializedName("AppearanceKey")
    private String appearanceKey;

    @SerializedName("ThicknessKey")
    private int thicknessKey;

    public String getAppearanceKey() {
        return this.appearanceKey;
    }

    public int getThicknessKey() {
        return this.thicknessKey;
    }

    public void setAppearanceKey(String str) {
        this.appearanceKey = str;
    }

    public void setThicknessKey(int i10) {
        this.thicknessKey = i10;
    }

    public String toString() {
        return "ClassPojo [AppearanceKey = " + this.appearanceKey + ", ThicknessKey = " + this.thicknessKey + "]";
    }
}