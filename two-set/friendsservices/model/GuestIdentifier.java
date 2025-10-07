package com.disney.wdpro.friendsservices.model;

import com.google.common.base.InterfaceC22463n;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(m92037d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u0000 \f2\u00020\u0001:\u0002\f\rB\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u000e"}, m92038d2 = {"Lcom/disney/wdpro/friendsservices/model/GuestIdentifier;", "Ljava/io/Serializable;", "type", "", "value", "(Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "getValue", "setValue", "Companion", "GuestIdentifierPredicate", "friends-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes28.dex */
public final class GuestIdentifier implements Serializable {
    public static final String ID_TYPE_CHILD_SWID = "child-swid";
    public static final String ID_TYPE_GUID = "guid";
    public static final String ID_TYPE_GXP_LINK = "gxp-link-id";
    public static final String ID_TYPE_PERNR = "pernr";
    public static final String ID_TYPE_SWID = "swid";
    public static final String ID_TYPE_XID = "xid";
    private String type;
    private String value;

    @Metadata(m92037d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000b¨\u0006\r"}, m92038d2 = {"Lcom/disney/wdpro/friendsservices/model/GuestIdentifier$GuestIdentifierPredicate;", "Lcom/google/common/base/n;", "Lcom/disney/wdpro/friendsservices/model/GuestIdentifier;", "", "guestIdType", "<init>", "(Ljava/lang/String;)V", "guestIdentifier", "", "apply", "(Lcom/disney/wdpro/friendsservices/model/GuestIdentifier;)Z", "Ljava/lang/String;", "Companion", "friends-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class GuestIdentifierPredicate implements InterfaceC22463n<GuestIdentifier> {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String guestIdType;

        @Metadata(m92037d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, m92038d2 = {"Lcom/disney/wdpro/friendsservices/model/GuestIdentifier$GuestIdentifierPredicate$Companion;", "", "()V", "getPernrPredicate", "Lcom/disney/wdpro/friendsservices/model/GuestIdentifier$GuestIdentifierPredicate;", "friends-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            public final GuestIdentifierPredicate getPernrPredicate() {
                return new GuestIdentifierPredicate(GuestIdentifier.ID_TYPE_PERNR);
            }

            private Companion() {
            }
        }

        public GuestIdentifierPredicate(String guestIdType) {
            Intrinsics.checkNotNullParameter(guestIdType, "guestIdType");
            this.guestIdType = guestIdType;
        }

        @JvmStatic
        public static final GuestIdentifierPredicate getPernrPredicate() {
            return INSTANCE.getPernrPredicate();
        }

        @Override // com.google.common.base.InterfaceC22463n
        public boolean apply(GuestIdentifier guestIdentifier) {
            Intrinsics.checkNotNull(guestIdentifier);
            return StringsKt.equals(guestIdentifier.getType(), this.guestIdType, true);
        }
    }

    public GuestIdentifier() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final String getType() {
        return this.type;
    }

    public final String getValue() {
        return this.value;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public final void setValue(String str) {
        this.value = str;
    }

    public GuestIdentifier(String str, String str2) {
        this.type = str;
        this.value = str2;
    }

    public /* synthetic */ GuestIdentifier(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2);
    }
}