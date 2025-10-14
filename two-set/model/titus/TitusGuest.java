package com.disney.wdpro.photopass.services.model.titus;

import com.disney.wdpro.hawkeye.p136ui.navigation.HawkeyeDeepLinks;
import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J9\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001c"}, m92038d2 = {"Lcom/disney/wdpro/photopass/services/model/titus/TitusGuest;", "", HawkeyeDeepLinks.GUEST_ID, "Lcom/disney/wdpro/photopass/services/model/titus/TitusTypeValue;", "price", "Lcom/disney/wdpro/photopass/services/model/titus/TitusPricing;", "guestItemId", "", "value", "(Lcom/disney/wdpro/photopass/services/model/titus/TitusTypeValue;Lcom/disney/wdpro/photopass/services/model/titus/TitusPricing;Ljava/lang/String;Ljava/lang/String;)V", "getGuestId", "()Lcom/disney/wdpro/photopass/services/model/titus/TitusTypeValue;", "getGuestItemId", "()Ljava/lang/String;", "getPrice", "()Lcom/disney/wdpro/photopass/services/model/titus/TitusPricing;", "getValue", "component1", "component2", "component3", "component4", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "hashCode", "", "toString", "photopass-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class TitusGuest {
    private final TitusTypeValue guestId;
    private final String guestItemId;
    private final TitusPricing price;
    private final String value;

    public TitusGuest(TitusTypeValue titusTypeValue, TitusPricing titusPricing, String str, String str2) {
        this.guestId = titusTypeValue;
        this.price = titusPricing;
        this.guestItemId = str;
        this.value = str2;
    }

    public static /* synthetic */ TitusGuest copy$default(TitusGuest titusGuest, TitusTypeValue titusTypeValue, TitusPricing titusPricing, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            titusTypeValue = titusGuest.guestId;
        }
        if ((i10 & 2) != 0) {
            titusPricing = titusGuest.price;
        }
        if ((i10 & 4) != 0) {
            str = titusGuest.guestItemId;
        }
        if ((i10 & 8) != 0) {
            str2 = titusGuest.value;
        }
        return titusGuest.copy(titusTypeValue, titusPricing, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final TitusTypeValue getGuestId() {
        return this.guestId;
    }

    /* renamed from: component2, reason: from getter */
    public final TitusPricing getPrice() {
        return this.price;
    }

    /* renamed from: component3, reason: from getter */
    public final String getGuestItemId() {
        return this.guestItemId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public final TitusGuest copy(TitusTypeValue guestId, TitusPricing price, String guestItemId, String value) {
        return new TitusGuest(guestId, price, guestItemId, value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TitusGuest)) {
            return false;
        }
        TitusGuest titusGuest = (TitusGuest) other;
        return Intrinsics.areEqual(this.guestId, titusGuest.guestId) && Intrinsics.areEqual(this.price, titusGuest.price) && Intrinsics.areEqual(this.guestItemId, titusGuest.guestItemId) && Intrinsics.areEqual(this.value, titusGuest.value);
    }

    public final TitusTypeValue getGuestId() {
        return this.guestId;
    }

    public final String getGuestItemId() {
        return this.guestItemId;
    }

    public final TitusPricing getPrice() {
        return this.price;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        TitusTypeValue titusTypeValue = this.guestId;
        int iHashCode = (titusTypeValue == null ? 0 : titusTypeValue.hashCode()) * 31;
        TitusPricing titusPricing = this.price;
        int iHashCode2 = (iHashCode + (titusPricing == null ? 0 : titusPricing.hashCode())) * 31;
        String str = this.guestItemId;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.value;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "TitusGuest(guestId=" + this.guestId + ", price=" + this.price + ", guestItemId=" + this.guestItemId + ", value=" + this.value + ")";
    }
}