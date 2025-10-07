package com.disney.wdpro.httpclient.authentication.model;

import com.disney.wdpro.httpclient.C13323a0;
import com.disney.wdpro.httpclient.authentication.model.ServiceError;
import com.disney.wdpro.httpclient.authentication.model.UserBaseProfile;
import com.google.common.base.InterfaceC22463n;
import com.google.common.collect.AbstractC22798t1;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes23.dex */
public class LoginResponse extends C13323a0 implements Serializable {
    private static final String ACCOUNT_LOCKED_OUT = "AUTHORIZATION_ACCOUNT_LOCKED_OUT";
    private static final String ACCOUNT_SECURITY_LOCKED_OUT = "AUTHORIZATION_ACCOUNT_SECURITY_LOCKED_OUT";
    public static final String ADDRESSES_VALUE = "profile.addresses";
    private static final String ADULT = "ADULT";
    private static final String AUTHORIZATION_CREDENTIALS = "AUTHORIZATION_CREDENTIALS";
    public static final String BILLING_ADDRESS_VALUE = "profile.addresses.type.BILLING";
    public static final String DATE_OF_BIRTH_VALUE = "profile.dateOfBirth";
    public static final String FIRST_NAME_VALUE = "profile.firstName";
    private static final String GUEST_GATED_AGEBAND = "GUEST_GATED_AGEBAND";
    private static final String INPUT_PASSWORD_MISSING_CHARS_CODE = "INVALID_VALUE_PASSWORD_MISSING_EXPECTED_CHARS";
    private static final String INVALID_VALUE_PASSWORD_SIZE = "INVALID_VALUE_PASSWORD_SIZE";
    private static final String INVALID_VALUE_PASSWORD_TOO_COMMON = "INVALID_VALUE_PASSWORD_TOO_COMMON";
    public static final String LAST_NAME_VALUE = "profile.lastName";
    private static final String LEGAL_CODE = "PPU_LEGAL";
    private static final String MISSING_VALUE = "MISSING_VALUE";
    private static final String PPU_MARKETING_ERROR = "PPU_MARKETING";
    private static final String PPU_SECURITY_ERROR = "PPU_SECURITY";
    private static final long serialVersionUID = 1;
    private InnerData data;
    private ServiceError error;

    static class InnerData implements Serializable {
        private static final long serialVersionUID = 1;
        private String jwt;
        private InnerProfile profile;
        private Token token;

        InnerData() {
        }

        public String getAccessToken() {
            Token token = this.token;
            if (token == null) {
                return null;
            }
            String str = token.accessToken;
            return str != null ? str : token.access_token;
        }

        public String getAgeBand() {
            InnerProfile innerProfile = this.profile;
            if (innerProfile != null) {
                return innerProfile.ageBand;
            }
            return null;
        }

        public String getCharacterVal() {
            InnerProfile innerProfile = this.profile;
            if (innerProfile != null) {
                return innerProfile.characterVal;
            }
            return null;
        }

        public String getEmail() {
            InnerProfile innerProfile = this.profile;
            if (innerProfile != null) {
                return innerProfile.email;
            }
            return null;
        }

        public String getFirstName() {
            InnerProfile innerProfile = this.profile;
            if (innerProfile != null) {
                return innerProfile.firstName;
            }
            return null;
        }

        public String getJwt() {
            return this.jwt;
        }

        public String getLastName() {
            InnerProfile innerProfile = this.profile;
            if (innerProfile != null) {
                return innerProfile.lastName;
            }
            return null;
        }

        public String getMiddleName() {
            InnerProfile innerProfile = this.profile;
            if (innerProfile != null) {
                return innerProfile.middleName;
            }
            return null;
        }

        public String getRefreshToken() {
            Token token = this.token;
            if (token == null) {
                return null;
            }
            String str = token.refreshToken;
            return str != null ? str : token.refresh_token;
        }

        public String getSuffix() {
            InnerProfile innerProfile = this.profile;
            if (innerProfile != null) {
                return innerProfile.suffix;
            }
            return null;
        }

        public String getSwid() {
            InnerProfile innerProfile = this.profile;
            if (innerProfile != null) {
                return innerProfile.swid;
            }
            return null;
        }

        public String getTTL() {
            Token token = this.token;
            if (token != null) {
                return token.ttl;
            }
            return null;
        }

        public String getTitle() {
            InnerProfile innerProfile = this.profile;
            if (innerProfile != null) {
                return innerProfile.title;
            }
            return null;
        }
    }

    static class InnerProfile implements Serializable {
        private static final long serialVersionUID = 1;
        String ageBand;
        String characterVal;
        String email;
        String firstName;
        String lastName;
        String middleName;
        String suffix;
        String swid;
        String title;

        InnerProfile() {
        }
    }

    static class Token implements Serializable {
        private static final long serialVersionUID = 1;
        String accessToken;
        String access_token;
        String refreshToken;
        String refresh_token;
        String ttl;

        Token() {
        }
    }

    private List<ServiceError.ErrorEntry> filterErrorsByCode(final String str) {
        ServiceError serviceError = this.error;
        if (serviceError != null) {
            return AbstractC22798t1.m69693q(serviceError.getErrors()).m69701l(new InterfaceC22463n<ServiceError.ErrorEntry>() { // from class: com.disney.wdpro.httpclient.authentication.model.LoginResponse.1
                @Override // com.google.common.base.InterfaceC22463n
                public boolean apply(ServiceError.ErrorEntry errorEntry) {
                    return errorEntry.getCode().equals(str);
                }
            }).m69707u();
        }
        return null;
    }

    public boolean areMandatoryFieldsMissing() {
        return isFirstNameMissing() || isLastNameMissing() || isDOBMissing() || isLegalAcceptanceMissing() || isPasswordUpgradeNeeded() || isBillingAddressMissing() || isMarketingOptInPromptNeeded();
    }

    public String getAccessToken() {
        InnerData innerData = this.data;
        if (innerData != null) {
            return innerData.getAccessToken();
        }
        return null;
    }

    public String getAccessTokenTTL() {
        InnerData innerData = this.data;
        if (innerData != null) {
            return innerData.getTTL();
        }
        return null;
    }

    public String getAgeBand() {
        InnerData innerData = this.data;
        if (innerData != null) {
            return innerData.getAgeBand();
        }
        return null;
    }

    public String getCharacterVal() {
        InnerData innerData = this.data;
        if (innerData != null) {
            return innerData.getCharacterVal();
        }
        return null;
    }

    public String getEmail() {
        InnerData innerData = this.data;
        if (innerData != null) {
            return innerData.getEmail();
        }
        return null;
    }

    public ServiceError getError() {
        return this.error;
    }

    public ServiceError.ErrorEntry getErrorByCode(String str) {
        ServiceError serviceError = this.error;
        if (serviceError != null) {
            return serviceError.getErrorByCode(str);
        }
        return null;
    }

    public ServiceError.ErrorEntry getErrorByInputName(String str, String str2) {
        ServiceError serviceError = this.error;
        if (serviceError != null) {
            return serviceError.getErrorByInputName(str, str2);
        }
        return null;
    }

    public String getFirstName() {
        InnerData innerData = this.data;
        if (innerData != null) {
            return innerData.getFirstName();
        }
        return null;
    }

    public String getJwt() {
        return this.data.getJwt();
    }

    public String getLastName() {
        InnerData innerData = this.data;
        if (innerData != null) {
            return innerData.getLastName();
        }
        return null;
    }

    public List<ServiceError.ErrorEntry> getMarketingOptInErrors() {
        return filterErrorsByCode(PPU_MARKETING_ERROR);
    }

    public String getMiddleName() {
        InnerData innerData = this.data;
        if (innerData != null) {
            return innerData.getMiddleName();
        }
        return null;
    }

    public String getRefreshToken() {
        InnerData innerData = this.data;
        if (innerData != null) {
            return innerData.getRefreshToken();
        }
        return null;
    }

    public String getSuffix() {
        InnerData innerData = this.data;
        if (innerData != null) {
            return innerData.getSuffix();
        }
        return null;
    }

    public String getSwid() {
        InnerData innerData = this.data;
        if (innerData != null) {
            return innerData.getSwid();
        }
        return null;
    }

    public String getTitle() {
        InnerData innerData = this.data;
        if (innerData != null) {
            return innerData.getTitle();
        }
        return null;
    }

    public boolean hasWrongCredentials() {
        return getErrorByCode(AUTHORIZATION_CREDENTIALS) != null;
    }

    public boolean isAccountLocked() {
        return getErrorByCode(ACCOUNT_LOCKED_OUT) != null;
    }

    public boolean isAccountSecurityLocked() {
        return getErrorByCode(ACCOUNT_SECURITY_LOCKED_OUT) != null;
    }

    public boolean isAddressMissing() {
        return getErrorByInputName("MISSING_VALUE", "profile.addresses") != null;
    }

    public boolean isAuthenticated() {
        return (getAccessToken() == null || getRefreshToken() == null || getSwid() == null) ? false : true;
    }

    public boolean isBillingAddressMissing() {
        return getErrorByInputName("MISSING_VALUE", "profile.addresses.type.BILLING") != null;
    }

    public boolean isDOBMissing() {
        return getErrorByInputName("MISSING_VALUE", "profile.dateOfBirth") != null;
    }

    public boolean isFirstNameMissing() {
        return getErrorByInputName("MISSING_VALUE", FIRST_NAME_VALUE) != null;
    }

    public boolean isGatedAgeBand() {
        return getErrorByCode(GUEST_GATED_AGEBAND) != null;
    }

    public boolean isLastNameMissing() {
        return getErrorByInputName("MISSING_VALUE", "profile.lastName") != null;
    }

    public boolean isLegalAcceptanceMissing() {
        return getErrorByCode("PPU_LEGAL") != null;
    }

    public boolean isMarketingOptInPromptNeeded() {
        return getErrorByCode(PPU_MARKETING_ERROR) != null;
    }

    public boolean isPasswordUpgradeNeeded() {
        return (getErrorByCode("PPU_SECURITY") == null && getErrorByCode(INPUT_PASSWORD_MISSING_CHARS_CODE) == null && getErrorByCode(INVALID_VALUE_PASSWORD_TOO_COMMON) == null && getErrorByCode(INVALID_VALUE_PASSWORD_SIZE) == null) ? false : true;
    }

    public UserBaseProfile toUserBaseProfile() {
        return new UserBaseProfile.Builder().swid(getSwid()).title(getTitle()).firstName(getFirstName()).middleName(getMiddleName()).lastName(getLastName()).suffix(getSuffix()).adult("ADULT".equals(getAgeBand())).characterVal(getCharacterVal()).build();
    }
}