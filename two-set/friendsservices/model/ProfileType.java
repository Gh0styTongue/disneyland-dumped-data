package com.disney.wdpro.friendsservices.model;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m92037d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, m92038d2 = {"Lcom/disney/wdpro/friendsservices/model/ProfileType;", "", "type", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "UNKNOWN", "REGISTERED", "MANAGED", "Companion", "friends-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes28.dex */
public enum ProfileType {
    UNKNOWN(""),
    REGISTERED("registered"),
    MANAGED("managed");


    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String type;

    @Metadata(m92037d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, m92038d2 = {"Lcom/disney/wdpro/friendsservices/model/ProfileType$Companion;", "", "()V", "lookup", "Lcom/disney/wdpro/friendsservices/model/ProfileType;", "type", "", "friends-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    @SourceDebugExtension({"SMAP\nProfileType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProfileType.kt\ncom/disney/wdpro/friendsservices/model/ProfileType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,13:1\n1#2:14\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final ProfileType lookup(String type) {
            ProfileType profileType;
            Intrinsics.checkNotNullParameter(type, "type");
            ProfileType[] profileTypeArrValues = ProfileType.values();
            int length = profileTypeArrValues.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    profileType = null;
                    break;
                }
                profileType = profileTypeArrValues[i10];
                if (Intrinsics.areEqual(profileType.getType(), type)) {
                    break;
                }
                i10++;
            }
            return profileType == null ? ProfileType.UNKNOWN : profileType;
        }

        private Companion() {
        }
    }

    ProfileType(String str) {
        this.type = str;
    }

    @JvmStatic
    public static final ProfileType lookup(String str) {
        return INSTANCE.lookup(str);
    }

    public final String getType() {
        return this.type;
    }
}