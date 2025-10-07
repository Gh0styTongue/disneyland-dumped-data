package com.disney.wdpro.friendsservices.model;

import com.google.common.base.Optional;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0016\u0018\u00002\u00020\u0001BI\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\tR\u001a\u0010\u0005\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0007\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR(\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R(\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\rR\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R(\u0010\u0017\u001a\u0004\u0018\u00010\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u000b\"\u0004\b\u0019\u0010\rR\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m92038d2 = {"Lcom/disney/wdpro/friendsservices/model/PersonName;", "Ljava/io/Serializable;", "titleOptional", "Lcom/google/common/base/Optional;", "", "firstName", "middleNameOptional", "lastName", "suffixOptional", "(Lcom/google/common/base/Optional;Ljava/lang/String;Lcom/google/common/base/Optional;Ljava/lang/String;Lcom/google/common/base/Optional;)V", "getFirstName", "()Ljava/lang/String;", "setFirstName", "(Ljava/lang/String;)V", "getLastName", "setLastName", "value", "middleName", "getMiddleName", "setMiddleName", "suffix", "getSuffix", "setSuffix", "title", "getTitle", "setTitle", "friends-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes28.dex */
public class PersonName implements Serializable {
    private String firstName;
    private String lastName;

    @SerializedName("middleName")
    private Optional<String> middleNameOptional;

    @SerializedName("suffix")
    private Optional<String> suffixOptional;

    @SerializedName("title")
    private Optional<String> titleOptional;

    public PersonName() {
        this(null, null, null, null, null, 31, null);
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getMiddleName() {
        return this.middleNameOptional.orNull();
    }

    public final String getSuffix() {
        return this.suffixOptional.orNull();
    }

    public final String getTitle() {
        return this.titleOptional.orNull();
    }

    public final void setFirstName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.firstName = str;
    }

    public final void setLastName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.lastName = str;
    }

    public final void setMiddleName(String str) {
        Optional<String> optionalAbsent;
        String str2;
        if (str == null || str.length() == 0) {
            optionalAbsent = Optional.absent();
            str2 = "absent()";
        } else {
            optionalAbsent = Optional.m68592of(str);
            str2 = "of(value)";
        }
        Intrinsics.checkNotNullExpressionValue(optionalAbsent, str2);
        this.middleNameOptional = optionalAbsent;
    }

    public final void setSuffix(String str) {
        Optional<String> optionalAbsent;
        String str2;
        if (str == null || str.length() == 0) {
            optionalAbsent = Optional.absent();
            str2 = "absent()";
        } else {
            optionalAbsent = Optional.m68592of(str);
            str2 = "of(value)";
        }
        Intrinsics.checkNotNullExpressionValue(optionalAbsent, str2);
        this.suffixOptional = optionalAbsent;
    }

    public final void setTitle(String str) {
        Optional<String> optionalAbsent;
        String str2;
        if (str == null || str.length() == 0) {
            optionalAbsent = Optional.absent();
            str2 = "absent()";
        } else {
            optionalAbsent = Optional.m68592of(str);
            str2 = "of(value)";
        }
        Intrinsics.checkNotNullExpressionValue(optionalAbsent, str2);
        this.titleOptional = optionalAbsent;
    }

    public PersonName(Optional<String> titleOptional, String firstName, Optional<String> middleNameOptional, String lastName, Optional<String> suffixOptional) {
        Intrinsics.checkNotNullParameter(titleOptional, "titleOptional");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(middleNameOptional, "middleNameOptional");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(suffixOptional, "suffixOptional");
        this.titleOptional = titleOptional;
        this.firstName = firstName;
        this.middleNameOptional = middleNameOptional;
        this.lastName = lastName;
        this.suffixOptional = suffixOptional;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PersonName(Optional optional, String str, Optional optional2, String str2, Optional optional3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 1) != 0) {
            optional = Optional.absent();
            Intrinsics.checkNotNullExpressionValue(optional, "absent()");
        }
        str = (i10 & 2) != 0 ? "" : str;
        if ((i10 & 4) != 0) {
            optional2 = Optional.absent();
            Intrinsics.checkNotNullExpressionValue(optional2, "absent()");
        }
        str2 = (i10 & 8) != 0 ? "" : str2;
        if ((i10 & 16) != 0) {
            optional3 = Optional.absent();
            Intrinsics.checkNotNullExpressionValue(optional3, "absent()");
        }
        Optional optional4 = optional3;
        this(optional, str, optional2, str2, optional4);
    }
}