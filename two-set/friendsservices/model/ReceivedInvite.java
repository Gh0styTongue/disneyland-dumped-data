package com.disney.wdpro.friendsservices.model;

import com.disney.wdpro.commons.C9350r;
import com.disney.wdpro.park.util.C18390e;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(m92037d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m92038d2 = {"Lcom/disney/wdpro/friendsservices/model/ReceivedInvite;", "Lcom/disney/wdpro/friendsservices/model/Invite;", "Lorg/json/JSONObject;", C18390e.JSON_EXTENSION, "Lcom/disney/wdpro/commons/r;", "time", "<init>", "(Lorg/json/JSONObject;Lcom/disney/wdpro/commons/r;)V", "Companion", "friends-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes28.dex */
public final class ReceivedInvite extends Invite {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m92037d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m92038d2 = {"Lcom/disney/wdpro/friendsservices/model/ReceivedInvite$Companion;", "", "<init>", "()V", "Lorg/json/JSONArray;", "invites", "Lcom/disney/wdpro/commons/r;", "time", "", "Lcom/disney/wdpro/friendsservices/model/Invite;", "invitesFromJson", "(Lorg/json/JSONArray;Lcom/disney/wdpro/commons/r;)Ljava/util/List;", "friends-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final List<Invite> invitesFromJson(JSONArray invites, C9350r time) {
            Intrinsics.checkNotNullParameter(invites, "invites");
            Intrinsics.checkNotNullParameter(time, "time");
            ArrayList arrayList = new ArrayList();
            int length = invites.length();
            for (int i10 = 0; i10 < length; i10++) {
                arrayList.add(new ReceivedInvite(invites.optJSONObject(i10), time));
            }
            return arrayList;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReceivedInvite(JSONObject jSONObject, C9350r time) {
        super(jSONObject, time);
        Intrinsics.checkNotNullParameter(time, "time");
    }

    @JvmStatic
    public static final List<Invite> invitesFromJson(JSONArray jSONArray, C9350r c9350r) {
        return INSTANCE.invitesFromJson(jSONArray, c9350r);
    }
}