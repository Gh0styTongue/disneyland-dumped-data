package com.disney.wdpro.photopass.services.model;

import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import com.onetrust.otpublishers.headless.Public.Keys.OTUXParamsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, m92038d2 = {"Lcom/disney/wdpro/photopass/services/model/LexVASPoliciesConditionsMediaFont;", "", "type", "", "hexCharacter", OTUXParamsKeys.OT_UX_FONT_NAME, "htmlCharacter", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFontName", "()Ljava/lang/String;", "getHexCharacter", "getHtmlCharacter", "getType", "component1", "component2", "component3", "component4", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "hashCode", "", "toString", "photopass-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class LexVASPoliciesConditionsMediaFont {
    private final String fontName;
    private final String hexCharacter;
    private final String htmlCharacter;
    private final String type;

    public LexVASPoliciesConditionsMediaFont(String type, String hexCharacter, String fontName, String htmlCharacter) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(hexCharacter, "hexCharacter");
        Intrinsics.checkNotNullParameter(fontName, "fontName");
        Intrinsics.checkNotNullParameter(htmlCharacter, "htmlCharacter");
        this.type = type;
        this.hexCharacter = hexCharacter;
        this.fontName = fontName;
        this.htmlCharacter = htmlCharacter;
    }

    public static /* synthetic */ LexVASPoliciesConditionsMediaFont copy$default(LexVASPoliciesConditionsMediaFont lexVASPoliciesConditionsMediaFont, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = lexVASPoliciesConditionsMediaFont.type;
        }
        if ((i10 & 2) != 0) {
            str2 = lexVASPoliciesConditionsMediaFont.hexCharacter;
        }
        if ((i10 & 4) != 0) {
            str3 = lexVASPoliciesConditionsMediaFont.fontName;
        }
        if ((i10 & 8) != 0) {
            str4 = lexVASPoliciesConditionsMediaFont.htmlCharacter;
        }
        return lexVASPoliciesConditionsMediaFont.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final String getHexCharacter() {
        return this.hexCharacter;
    }

    /* renamed from: component3, reason: from getter */
    public final String getFontName() {
        return this.fontName;
    }

    /* renamed from: component4, reason: from getter */
    public final String getHtmlCharacter() {
        return this.htmlCharacter;
    }

    public final LexVASPoliciesConditionsMediaFont copy(String type, String hexCharacter, String fontName, String htmlCharacter) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(hexCharacter, "hexCharacter");
        Intrinsics.checkNotNullParameter(fontName, "fontName");
        Intrinsics.checkNotNullParameter(htmlCharacter, "htmlCharacter");
        return new LexVASPoliciesConditionsMediaFont(type, hexCharacter, fontName, htmlCharacter);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LexVASPoliciesConditionsMediaFont)) {
            return false;
        }
        LexVASPoliciesConditionsMediaFont lexVASPoliciesConditionsMediaFont = (LexVASPoliciesConditionsMediaFont) other;
        return Intrinsics.areEqual(this.type, lexVASPoliciesConditionsMediaFont.type) && Intrinsics.areEqual(this.hexCharacter, lexVASPoliciesConditionsMediaFont.hexCharacter) && Intrinsics.areEqual(this.fontName, lexVASPoliciesConditionsMediaFont.fontName) && Intrinsics.areEqual(this.htmlCharacter, lexVASPoliciesConditionsMediaFont.htmlCharacter);
    }

    public final String getFontName() {
        return this.fontName;
    }

    public final String getHexCharacter() {
        return this.hexCharacter;
    }

    public final String getHtmlCharacter() {
        return this.htmlCharacter;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((this.type.hashCode() * 31) + this.hexCharacter.hashCode()) * 31) + this.fontName.hashCode()) * 31) + this.htmlCharacter.hashCode();
    }

    public String toString() {
        return "LexVASPoliciesConditionsMediaFont(type=" + this.type + ", hexCharacter=" + this.hexCharacter + ", fontName=" + this.fontName + ", htmlCharacter=" + this.htmlCharacter + ")";
    }
}