package com.disney.wdpro.httpclient.authentication.model;

import java.io.Serializable;

@Deprecated
/* loaded from: classes23.dex */
public class UserBaseProfile implements Serializable {
    private static final long serialVersionUID = -4354145722084044556L;
    private boolean adult;
    private String characterVal;
    private String firstName;
    private String lastName;
    private String middleName;
    private String suffix;
    private String swid;
    private String title;

    public static class Builder<B extends Builder> {
        private boolean adult;
        private String characterVal;
        private String firstName;
        private String lastName;
        private String middleName;
        private String suffix;
        private String swid;
        private String title;

        public B adult(boolean z10) {
            this.adult = z10;
            return this;
        }

        public UserBaseProfile build() {
            return new UserBaseProfile(this);
        }

        public B characterVal(String str) {
            this.characterVal = str;
            return this;
        }

        public B firstName(String str) {
            this.firstName = str;
            return this;
        }

        public B lastName(String str) {
            this.lastName = str;
            return this;
        }

        public B middleName(String str) {
            this.middleName = str;
            return this;
        }

        public B suffix(String str) {
            this.suffix = str;
            return this;
        }

        public B swid(String str) {
            this.swid = str;
            return this;
        }

        public B title(String str) {
            this.title = str;
            return this;
        }
    }

    protected UserBaseProfile(Builder builder) {
        this.swid = builder.swid;
        this.title = builder.title;
        this.firstName = builder.firstName;
        this.middleName = builder.middleName;
        this.lastName = builder.lastName;
        this.suffix = builder.suffix;
        this.adult = builder.adult;
        this.characterVal = builder.characterVal;
    }

    public String getCharacterVal() {
        return this.characterVal;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public String getSuffix() {
        return this.suffix;
    }

    public String getSwid() {
        return this.swid;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean isAdult() {
        return this.adult;
    }
}