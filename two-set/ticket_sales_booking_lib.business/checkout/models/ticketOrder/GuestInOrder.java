package com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.ticketOrder;

import com.disney.wdpro.commons.C9350r;
import com.disney.wdpro.dinecheckin.services.checkin.model.CheckInServiceConstantsKt;
import com.disney.wdpro.service.model.Address;
import com.disney.wdpro.service.model.PersonName;
import com.disney.wdpro.service.model.Phone;
import com.disney.wdpro.service.utils.Constants;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.IdWithType;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.UserDataContainer;
import com.google.common.base.C22462m;
import com.google.common.base.Optional;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.annotation.Nonnull;

/* loaded from: classes18.dex */
public class GuestInOrder implements Serializable {
    private static final long serialVersionUID = 1;
    private final Address address;
    private final String assignedEntitlementId;
    private final String avatarImageUrl;
    private final Calendar birthDate;
    private final String emailAddress;
    private final IdWithType idWithType;
    private final PersonName name;
    private final String participantId;
    private final Phone phoneNumber;

    public static class Builder {
        private Address address;
        private String assignedEntitlementId;
        private String avatarImageUrl;
        private Calendar birthDate;
        private String emailAddress;
        private IdWithType idWithType;
        private PersonName name;
        private String participantId;
        private Phone phoneNumber;

        public GuestInOrder build() {
            C22462m.m68685q(this.participantId, "participantId cannot be null");
            return new GuestInOrder(this);
        }

        public Builder withAddress(Address address) {
            this.address = address;
            return this;
        }

        public Builder withAssignedEntitlementId(String str) {
            this.assignedEntitlementId = str;
            return this;
        }

        public Builder withAvatarImageUrl(String str) {
            this.avatarImageUrl = str;
            return this;
        }

        public Builder withBirthDate(Calendar calendar) {
            this.birthDate = calendar;
            return this;
        }

        public Builder withEmailAddress(String str) {
            this.emailAddress = str;
            return this;
        }

        public Builder withIdWithType(IdWithType idWithType) {
            this.idWithType = idWithType;
            return this;
        }

        public Builder withName(PersonName personName) {
            this.name = personName;
            return this;
        }

        public Builder withParticipantId(String str) {
            this.participantId = str;
            return this;
        }

        public Builder withPhone(Phone phone) {
            this.phoneNumber = phone;
            return this;
        }
    }

    public static class GuestInOrderDeserializer implements JsonDeserializer<GuestInOrder> {
        private Calendar getBirthDate(JsonObject jsonObject) {
            JsonElement jsonElement = jsonObject.get("birthDate");
            if (jsonElement == null) {
                return null;
            }
            String asString = jsonElement.getAsString();
            SimpleDateFormat simpleDateFormatM39105x = new C9350r().m39105x();
            Calendar calendar = Calendar.getInstance();
            try {
                calendar.setTime(simpleDateFormatM39105x.parse(asString));
                return calendar;
            } catch (ParseException e10) {
                e10.toString();
                return null;
            }
        }

        private String getNullableString(JsonObject jsonObject, String str) {
            if (jsonObject.has(str)) {
                return jsonObject.get(str).getAsString();
            }
            return null;
        }

        private PersonName getPersonName(JsonObject jsonObject) {
            JsonElement jsonElement = jsonObject.get("name");
            if (jsonElement == null) {
                return null;
            }
            JsonObject asJsonObject = jsonElement.getAsJsonObject();
            return new PersonName(getNullableString(asJsonObject, "title"), getNullableString(asJsonObject, "firstName"), getNullableString(asJsonObject, "middleName"), getNullableString(asJsonObject, "lastName"), getNullableString(asJsonObject, "suffix"));
        }

        private IdWithType getUserIdWithType(JsonObject jsonObject) {
            if (jsonObject.has("swid")) {
                return new IdWithType(UserDataContainer.IdType.SWID, jsonObject.get("swid").getAsString());
            }
            if (jsonObject.has("guid")) {
                return new IdWithType(UserDataContainer.IdType.GUID, jsonObject.get("guid").getAsString());
            }
            if (jsonObject.has("xid")) {
                return new IdWithType(UserDataContainer.IdType.XID, jsonObject.get("xid").getAsString());
            }
            return null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.JsonDeserializer
        public GuestInOrder deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            Builder builder = new Builder();
            JsonObject asJsonObject = jsonElement.getAsJsonObject();
            Address address = (Address) jsonDeserializationContext.deserialize(asJsonObject.get("address"), Address.class);
            Calendar birthDate = getBirthDate(asJsonObject);
            PersonName personName = getPersonName(asJsonObject);
            Phone phone = (Phone) jsonDeserializationContext.deserialize(asJsonObject.get(CheckInServiceConstantsKt.PROPERTY_PHONE_NUMBER), Phone.class);
            return builder.withParticipantId(asJsonObject.get(Constants.PARTICIPANT_ID).getAsString()).withAssignedEntitlementId(getNullableString(asJsonObject, "assignedEntitlementId")).withName(personName).withPhone(phone).withEmailAddress(getNullableString(asJsonObject, "emailAddress")).withAvatarImageUrl(getNullableString(asJsonObject, "avatarImage")).withBirthDate(birthDate).withAddress(address).withIdWithType(getUserIdWithType(asJsonObject)).build();
        }
    }

    public GuestInOrder(Builder builder) {
        this.name = builder.name;
        this.phoneNumber = builder.phoneNumber;
        this.emailAddress = builder.emailAddress;
        this.address = builder.address;
        this.birthDate = builder.birthDate;
        this.idWithType = builder.idWithType;
        this.avatarImageUrl = builder.avatarImageUrl;
        this.participantId = builder.participantId;
        this.assignedEntitlementId = builder.assignedEntitlementId;
    }

    public Optional<Address> getAddress() {
        return Optional.fromNullable(this.address);
    }

    public String getAssignedEntitlementId() {
        return this.assignedEntitlementId;
    }

    public Optional<String> getAvatarImageUrl() {
        return Optional.fromNullable(this.avatarImageUrl);
    }

    public Optional<Calendar> getBirthDate() {
        return Optional.fromNullable(this.birthDate);
    }

    public Optional<String> getEmailAddress() {
        return Optional.fromNullable(this.emailAddress);
    }

    public Optional<IdWithType> getIdWithType() {
        return Optional.fromNullable(this.idWithType);
    }

    public Optional<PersonName> getName() {
        return Optional.fromNullable(this.name);
    }

    @Nonnull
    public String getParticipantId() {
        return this.participantId;
    }

    public Optional<Phone> getPhoneNumber() {
        return Optional.fromNullable(this.phoneNumber);
    }
}