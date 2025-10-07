package com.disney.wdpro.httpclient.authentication;

/* loaded from: classes23.dex */
public class AuthConfig {
    private final ProfileSecurityGuestController guestControllerVersion;
    private final String jwtValue;
    private final boolean ssoEnabled;

    public static class Builder {
        private ProfileSecurityGuestController guestControllerVersion = ProfileSecurityGuestController.VERSION_5;
        private String jwtValue;
        private boolean ssoEnabled;

        public AuthConfig build() {
            return new AuthConfig(this);
        }

        public Builder withGuestControllerVersion(ProfileSecurityGuestController profileSecurityGuestController) {
            if (profileSecurityGuestController == null) {
                profileSecurityGuestController = ProfileSecurityGuestController.VERSION_5;
            }
            this.guestControllerVersion = profileSecurityGuestController;
            return this;
        }

        public Builder withJwt(String str) {
            this.jwtValue = str;
            return this;
        }

        public Builder withSSO() {
            this.ssoEnabled = true;
            return this;
        }
    }

    public enum ProfileSecurityGuestController {
        VERSION_5,
        VERSION_4
    }

    public ProfileSecurityGuestController getGuestControllerVersion() {
        return this.guestControllerVersion;
    }

    public String getJwtValue() {
        return this.jwtValue;
    }

    public boolean isSSOEnabled() {
        return this.ssoEnabled;
    }

    private AuthConfig(Builder builder) {
        this.guestControllerVersion = builder.guestControllerVersion;
        this.ssoEnabled = builder.ssoEnabled;
        this.jwtValue = builder.jwtValue;
    }
}