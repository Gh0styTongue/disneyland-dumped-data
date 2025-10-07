package com.disney.wdpro.friendsservices.model;

import com.disney.wdpro.park.util.C18390e;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0006\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\b"}, m92038d2 = {"Lcom/disney/wdpro/friendsservices/model/SharePhotoPassClassificationType;", "", "(Ljava/lang/String;I)V", "SHARE_MEDIA_DOWNLOAD", "SHARE_MEDIA_NONE", "UNKNOWN", "Companion", "SharePhotoPassClassificationTypeDeserializer", "friends-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes28.dex */
public enum SharePhotoPassClassificationType {
    SHARE_MEDIA_DOWNLOAD,
    SHARE_MEDIA_NONE,
    UNKNOWN;


    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m92037d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007"}, m92038d2 = {"Lcom/disney/wdpro/friendsservices/model/SharePhotoPassClassificationType$Companion;", "", "()V", "getSharePhotoPassClassificationType", "Lcom/disney/wdpro/friendsservices/model/SharePhotoPassClassificationType;", "sharePhotoPassClassification", "", "friends-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final SharePhotoPassClassificationType getSharePhotoPassClassificationType(String sharePhotoPassClassification) {
            return StringsKt.equals("SHARE_MEDIA_DOWNLOAD", sharePhotoPassClassification, true) ? SharePhotoPassClassificationType.SHARE_MEDIA_DOWNLOAD : StringsKt.equals("SHARE_MEDIA_NONE", sharePhotoPassClassification, true) ? SharePhotoPassClassificationType.SHARE_MEDIA_NONE : SharePhotoPassClassificationType.UNKNOWN;
        }

        private Companion() {
        }
    }

    @Metadata(m92037d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, m92038d2 = {"Lcom/disney/wdpro/friendsservices/model/SharePhotoPassClassificationType$SharePhotoPassClassificationTypeDeserializer;", "Lcom/google/gson/JsonDeserializer;", "Lcom/disney/wdpro/friendsservices/model/SharePhotoPassClassificationType;", "()V", "deserialize", C18390e.JSON_EXTENSION, "Lcom/google/gson/JsonElement;", "typeOfT", "Ljava/lang/reflect/Type;", "context", "Lcom/google/gson/JsonDeserializationContext;", "friends-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class SharePhotoPassClassificationTypeDeserializer implements JsonDeserializer<SharePhotoPassClassificationType> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.JsonDeserializer
        public SharePhotoPassClassificationType deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(typeOfT, "typeOfT");
            Intrinsics.checkNotNullParameter(context, "context");
            return SharePhotoPassClassificationType.INSTANCE.getSharePhotoPassClassificationType(json.getAsString());
        }
    }

    @JvmStatic
    public static final SharePhotoPassClassificationType getSharePhotoPassClassificationType(String str) {
        return INSTANCE.getSharePhotoPassClassificationType(str);
    }
}