package com.disney.wdpro.universal_checkout_ui.models;

import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import com.google.gson.Gson;
import com.newrelic.agent.android.instrumentation.GsonInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(m92037d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BE\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0018\u001a\u00020\u0003J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\b\u0010\u001e\u001a\u00020\u0003H\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001f"}, m92038d2 = {"Lcom/disney/wdpro/universal_checkout_ui/models/RememberMeCookie;", "", "name", "", "lastName", "avatar", "swid", "email", "passiveId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAvatar", "()Ljava/lang/String;", "getEmail", "getLastName", "getName", "getPassiveId", "getSwid", "component1", "component2", "component3", "component4", "component5", "component6", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "encode", "equals", "", "other", "hashCode", "", "toString", "universal_checkout_ui_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@Instrumented
/* loaded from: classes20.dex */
public final /* data */ class RememberMeCookie {
    private final String avatar;
    private final String email;
    private final String lastName;
    private final String name;
    private final String passiveId;
    private final String swid;

    @JvmOverloads
    public RememberMeCookie(String str, String str2, String str3, String str4, String str5) {
        this(str, str2, str3, str4, str5, null, 32, null);
    }

    public static /* synthetic */ RememberMeCookie copy$default(RememberMeCookie rememberMeCookie, String str, String str2, String str3, String str4, String str5, String str6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = rememberMeCookie.name;
        }
        if ((i10 & 2) != 0) {
            str2 = rememberMeCookie.lastName;
        }
        if ((i10 & 4) != 0) {
            str3 = rememberMeCookie.avatar;
        }
        if ((i10 & 8) != 0) {
            str4 = rememberMeCookie.swid;
        }
        if ((i10 & 16) != 0) {
            str5 = rememberMeCookie.email;
        }
        if ((i10 & 32) != 0) {
            str6 = rememberMeCookie.passiveId;
        }
        String str7 = str5;
        String str8 = str6;
        return rememberMeCookie.copy(str, str2, str3, str4, str7, str8);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAvatar() {
        return this.avatar;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSwid() {
        return this.swid;
    }

    /* renamed from: component5, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* renamed from: component6, reason: from getter */
    public final String getPassiveId() {
        return this.passiveId;
    }

    public final RememberMeCookie copy(String name, String lastName, String avatar, String swid, String email, String passiveId) {
        return new RememberMeCookie(name, lastName, avatar, swid, email, passiveId);
    }

    public final String encode() throws UnsupportedEncodingException {
        String strEncode = URLEncoder.encode(toString(), "UTF-8");
        Intrinsics.checkNotNullExpressionValue(strEncode, "encode(toString(), \"UTF-8\")");
        return StringsKt.replace$default(strEncode, "+", "%20", false, 4, (Object) null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RememberMeCookie)) {
            return false;
        }
        RememberMeCookie rememberMeCookie = (RememberMeCookie) other;
        return Intrinsics.areEqual(this.name, rememberMeCookie.name) && Intrinsics.areEqual(this.lastName, rememberMeCookie.lastName) && Intrinsics.areEqual(this.avatar, rememberMeCookie.avatar) && Intrinsics.areEqual(this.swid, rememberMeCookie.swid) && Intrinsics.areEqual(this.email, rememberMeCookie.email) && Intrinsics.areEqual(this.passiveId, rememberMeCookie.passiveId);
    }

    public final String getAvatar() {
        return this.avatar;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPassiveId() {
        return this.passiveId;
    }

    public final String getSwid() {
        return this.swid;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.lastName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.avatar;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.swid;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.email;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.passiveId;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        String json = GsonInstrumentation.toJson(new Gson(), this);
        Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(this)");
        return json;
    }

    @JvmOverloads
    public RememberMeCookie(String str, String str2, String str3, String str4, String str5, String str6) {
        this.name = str;
        this.lastName = str2;
        this.avatar = str3;
        this.swid = str4;
        this.email = str5;
        this.passiveId = str6;
    }

    public /* synthetic */ RememberMeCookie(String str, String str2, String str3, String str4, String str5, String str6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, (i10 & 32) != 0 ? null : str6);
    }
}