package com.disney.wdpro.ap_commerce_checkout;

import com.google.common.base.Optional;

/* loaded from: classes23.dex */
public class PassHolderItemData {
    private static final long serialVersionUID = 1;
    private final String address;
    private final String avatarImageUrl;
    private final String birthDate;
    private final String emailAddress;
    private final String guestName;
    private final String passName;
    private final String phoneNumber;

    public static class Builder {
        private String address;
        private String avatarImageUrl;
        private String birthDate;
        private String emailAddress;
        private String guestName;
        private String passName;
        private String phoneNumber;

        public PassHolderItemData build() {
            return new PassHolderItemData(this);
        }

        public Builder withAddress(String str) {
            this.address = str;
            return this;
        }

        public Builder withAvatarImageUrl(String str) {
            this.avatarImageUrl = str;
            return this;
        }

        public Builder withBirthDate(String str) {
            this.birthDate = str;
            return this;
        }

        public Builder withEmailAddress(String str) {
            this.emailAddress = str;
            return this;
        }

        public Builder withGuestName(String str) {
            this.guestName = str;
            return this;
        }

        public Builder withPassName(String str) {
            this.passName = str;
            return this;
        }

        public Builder withPhone(String str) {
            this.phoneNumber = str;
            return this;
        }
    }

    public PassHolderItemData(Builder builder) {
        this.guestName = builder.guestName;
        this.passName = builder.passName;
        this.phoneNumber = builder.phoneNumber;
        this.emailAddress = builder.emailAddress;
        this.address = builder.address;
        this.birthDate = builder.birthDate;
        this.avatarImageUrl = builder.avatarImageUrl;
    }

    public Optional<String> getAddress() {
        return Optional.fromNullable(this.address);
    }

    public Optional<String> getAvatarImageUrl() {
        return Optional.fromNullable(this.avatarImageUrl);
    }

    public Optional<String> getBirthDate() {
        return Optional.fromNullable(this.birthDate);
    }

    public Optional<String> getEmailAddress() {
        return Optional.fromNullable(this.emailAddress);
    }

    public Optional<String> getGuestName() {
        return Optional.fromNullable(this.guestName);
    }

    public Optional<String> getPassName() {
        return Optional.fromNullable(this.passName);
    }

    public Optional<String> getPhoneNumber() {
        return Optional.fromNullable(this.phoneNumber);
    }
}