package com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.contract;

import com.google.gson.annotations.SerializedName;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.Serializable;

@SuppressFBWarnings
/* loaded from: classes18.dex */
public class TextKey implements Serializable {

    @SerializedName("Content")
    private String content;

    @SerializedName("Style")
    private StyleKey style;

    public String getContent() {
        return this.content;
    }

    public StyleKey getStyle() {
        return this.style;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setStyle(StyleKey styleKey) {
        this.style = styleKey;
    }

    public String toString() {
        return "ClassPojo [Style = " + this.style + ", Content = " + this.content + "]";
    }
}