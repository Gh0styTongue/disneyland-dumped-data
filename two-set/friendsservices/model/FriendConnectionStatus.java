package com.disney.wdpro.friendsservices.model;

import com.disney.wdpro.park.util.C18390e;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, m92038d2 = {"Lcom/disney/wdpro/friendsservices/model/FriendConnectionStatus;", "", "(Ljava/lang/String;I)V", "ALREADY_CONNECTED", "INVITATION_PENDING", "NOT_CONNECTED", "NONE", "FriendConnectionStatusDeserializer", "friends-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes28.dex */
public enum FriendConnectionStatus {
    ALREADY_CONNECTED,
    INVITATION_PENDING,
    NOT_CONNECTED,
    NONE;

    @Metadata(m92037d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0014\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0002\u0010\u0006J \u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m92038d2 = {"Lcom/disney/wdpro/friendsservices/model/FriendConnectionStatus$FriendConnectionStatusDeserializer;", "Lcom/google/gson/JsonDeserializer;", "Lcom/disney/wdpro/friendsservices/model/FriendConnectionStatus;", "entitlementStatusMap", "", "", "(Ljava/util/Map;)V", "deserialize", C18390e.JSON_EXTENSION, "Lcom/google/gson/JsonElement;", "typeOF", "Ljava/lang/reflect/Type;", "context", "Lcom/google/gson/JsonDeserializationContext;", "friends-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    @SourceDebugExtension({"SMAP\nFriendConnectionStatus.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FriendConnectionStatus.kt\ncom/disney/wdpro/friendsservices/model/FriendConnectionStatus$FriendConnectionStatusDeserializer\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,38:1\n13579#2,2:39\n*S KotlinDebug\n*F\n+ 1 FriendConnectionStatus.kt\ncom/disney/wdpro/friendsservices/model/FriendConnectionStatus$FriendConnectionStatusDeserializer\n*L\n32#1:39,2\n*E\n"})
    public static final class FriendConnectionStatusDeserializer implements JsonDeserializer<FriendConnectionStatus> {
        private final Map<String, FriendConnectionStatus> entitlementStatusMap;

        public FriendConnectionStatusDeserializer() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public FriendConnectionStatusDeserializer(Map<String, FriendConnectionStatus> entitlementStatusMap) {
            Intrinsics.checkNotNullParameter(entitlementStatusMap, "entitlementStatusMap");
            this.entitlementStatusMap = entitlementStatusMap;
            for (FriendConnectionStatus friendConnectionStatus : FriendConnectionStatus.values()) {
                this.entitlementStatusMap.put(friendConnectionStatus.name(), friendConnectionStatus);
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.JsonDeserializer
        public FriendConnectionStatus deserialize(JsonElement json, Type typeOF, JsonDeserializationContext context) {
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(typeOF, "typeOF");
            Intrinsics.checkNotNullParameter(context, "context");
            FriendConnectionStatus friendConnectionStatus = this.entitlementStatusMap.get(json.getAsString());
            return friendConnectionStatus == null ? FriendConnectionStatus.NONE : friendConnectionStatus;
        }

        public /* synthetic */ FriendConnectionStatusDeserializer(Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? new HashMap() : map);
        }
    }
}