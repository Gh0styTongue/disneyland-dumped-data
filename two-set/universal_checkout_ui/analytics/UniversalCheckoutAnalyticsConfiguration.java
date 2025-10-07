package com.disney.wdpro.universal_checkout_ui.analytics;

import java.io.Serializable;

/* loaded from: classes20.dex */
public class UniversalCheckoutAnalyticsConfiguration implements Serializable {
    private String linkCategory;
    private String trackStateStem;

    public UniversalCheckoutAnalyticsConfiguration(String str, String str2) {
        this.linkCategory = str;
        this.trackStateStem = str2;
    }

    public String getLinkCategory() {
        return this.linkCategory;
    }

    public String getTrackStateStem() {
        return this.trackStateStem;
    }
}