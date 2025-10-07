package com.disney.wdpro.friendsservices.model;

import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import com.disney.wdpro.park.util.C18390e;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001eB1\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\u0010\bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0003J5\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, m92038d2 = {"Lcom/disney/wdpro/friendsservices/model/ContactInfo;", "Ljava/io/Serializable;", "type", "", "emails", "", "addresses", "Lcom/disney/wdpro/friendsservices/model/Address;", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getAddresses", "()Ljava/util/List;", "setAddresses", "(Ljava/util/List;)V", "getEmails", "setEmails", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "component1", "component2", "component3", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "", "hashCode", "", "toString", "ContactInfoDeserializer", "friends-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes28.dex */
public final /* data */ class ContactInfo implements Serializable {
    private List<Address> addresses;
    private List<String> emails;
    private String type;

    @Metadata(m92037d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, m92038d2 = {"Lcom/disney/wdpro/friendsservices/model/ContactInfo$ContactInfoDeserializer;", "Lcom/google/gson/JsonDeserializer;", "Lcom/disney/wdpro/friendsservices/model/ContactInfo;", "()V", "deserialize", C18390e.JSON_EXTENSION, "Lcom/google/gson/JsonElement;", "typeOfT", "Ljava/lang/reflect/Type;", "context", "Lcom/google/gson/JsonDeserializationContext;", "friends-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class ContactInfoDeserializer implements JsonDeserializer<ContactInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.JsonDeserializer
        public ContactInfo deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(typeOfT, "typeOfT");
            Intrinsics.checkNotNullParameter(context, "context");
            JsonObject asJsonObject = json.getAsJsonObject();
            String asString = asJsonObject.get("type").getAsString();
            ContactInfo contactInfo = new ContactInfo(asString, null, null, 6, null);
            if (asJsonObject.has("details")) {
                JsonArray asJsonArray = asJsonObject.get("details").getAsJsonArray();
                if (Intrinsics.areEqual(asString, "email")) {
                    Iterator<JsonElement> it = asJsonArray.iterator();
                    while (it.hasNext()) {
                        JsonElement next = it.next();
                        List<String> emails = contactInfo.getEmails();
                        String asString2 = next.getAsJsonObject().get("email").getAsString();
                        Intrinsics.checkNotNullExpressionValue(asString2, "jsonElement.asJsonObject[JsonKeys.EMAIL].asString");
                        emails.add(asString2);
                    }
                } else if (Intrinsics.areEqual(asString, "address")) {
                    Object objDeserialize = context.deserialize(asJsonArray, new TypeToken<List<? extends Address>>() { // from class: com.disney.wdpro.friendsservices.model.ContactInfo$ContactInfoDeserializer$deserialize$addressType$1
                    }.getType());
                    Intrinsics.checkNotNullExpressionValue(objDeserialize, "context.deserialize(asJsonArray, addressType)");
                    contactInfo.setAddresses((List) objDeserialize);
                }
            }
            return contactInfo;
        }
    }

    public ContactInfo() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ContactInfo copy$default(ContactInfo contactInfo, String str, List list, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = contactInfo.type;
        }
        if ((i10 & 2) != 0) {
            list = contactInfo.emails;
        }
        if ((i10 & 4) != 0) {
            list2 = contactInfo.addresses;
        }
        return contactInfo.copy(str, list, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final List<String> component2() {
        return this.emails;
    }

    public final List<Address> component3() {
        return this.addresses;
    }

    public final ContactInfo copy(String type, List<String> emails, List<Address> addresses) {
        Intrinsics.checkNotNullParameter(emails, "emails");
        Intrinsics.checkNotNullParameter(addresses, "addresses");
        return new ContactInfo(type, emails, addresses);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContactInfo)) {
            return false;
        }
        ContactInfo contactInfo = (ContactInfo) other;
        return Intrinsics.areEqual(this.type, contactInfo.type) && Intrinsics.areEqual(this.emails, contactInfo.emails) && Intrinsics.areEqual(this.addresses, contactInfo.addresses);
    }

    public final List<Address> getAddresses() {
        return this.addresses;
    }

    public final List<String> getEmails() {
        return this.emails;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.type;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.emails.hashCode()) * 31) + this.addresses.hashCode();
    }

    public final void setAddresses(List<Address> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.addresses = list;
    }

    public final void setEmails(List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.emails = list;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public String toString() {
        return "ContactInfo(type=" + this.type + ", emails=" + this.emails + ", addresses=" + this.addresses + ")";
    }

    public ContactInfo(String str, List<String> emails, List<Address> addresses) {
        Intrinsics.checkNotNullParameter(emails, "emails");
        Intrinsics.checkNotNullParameter(addresses, "addresses");
        this.type = str;
        this.emails = emails;
        this.addresses = addresses;
    }

    public /* synthetic */ ContactInfo(String str, List list, List list2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? new ArrayList() : list, (i10 & 4) != 0 ? new ArrayList() : list2);
    }
}