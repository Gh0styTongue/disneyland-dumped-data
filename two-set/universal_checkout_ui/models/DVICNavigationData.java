package com.disney.wdpro.universal_checkout_ui.models;

import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m92038d2 = {"Lcom/disney/wdpro/universal_checkout_ui/models/DVICNavigationData;", "", "interstitialText", "", "url", "(Ljava/lang/String;Ljava/lang/String;)V", "getInterstitialText", "()Ljava/lang/String;", "getUrl", "component1", "component2", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "hashCode", "", "toString", "universal_checkout_ui_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class DVICNavigationData {
    private final String interstitialText;
    private final String url;

    @JvmOverloads
    public DVICNavigationData() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ DVICNavigationData copy$default(DVICNavigationData dVICNavigationData, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = dVICNavigationData.interstitialText;
        }
        if ((i10 & 2) != 0) {
            str2 = dVICNavigationData.url;
        }
        return dVICNavigationData.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getInterstitialText() {
        return this.interstitialText;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public final DVICNavigationData copy(String interstitialText, String url) {
        return new DVICNavigationData(interstitialText, url);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DVICNavigationData)) {
            return false;
        }
        DVICNavigationData dVICNavigationData = (DVICNavigationData) other;
        return Intrinsics.areEqual(this.interstitialText, dVICNavigationData.interstitialText) && Intrinsics.areEqual(this.url, dVICNavigationData.url);
    }

    public final String getInterstitialText() {
        return this.interstitialText;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.interstitialText;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.url;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "DVICNavigationData(interstitialText=" + this.interstitialText + ", url=" + this.url + ")";
    }

    @JvmOverloads
    public DVICNavigationData(String str) {
        this(str, null, 2, 0 == true ? 1 : 0);
    }

    @JvmOverloads
    public DVICNavigationData(String str, String str2) {
        this.interstitialText = str;
        this.url = str2;
    }

    public /* synthetic */ DVICNavigationData(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2);
    }
}