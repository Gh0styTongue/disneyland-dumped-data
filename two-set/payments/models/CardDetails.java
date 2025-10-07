package com.disney.wdpro.payments.models;

import com.disney.wdpro.payments.models.enums.CardTypeEnum;
import com.disney.wdpro.payments.models.enums.IssuerNameEnum;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* loaded from: classes15.dex */
public class CardDetails extends BaseCardDetails implements Serializable {
    private static final long serialVersionUID = -1480464192045448616L;
    private Address billingAddress;
    private String cardDisplayNumber;
    private String cardProductName;
    private String cardToken;
    private String cardholderName;
    private String checkoutType;
    private String email;

    @SerializedName("expiration")
    private String exprDate;
    private boolean isBackup;
    private boolean isFromChargeAccount;
    private boolean isStoredCard;
    private boolean isWalletDefault;
    private Name profileName;
    private Phone profilePhone;
    private Payment scheduled;
    private String securityCode;
    private List<DescriptorType> terms;
    private String tokenVault;
    private boolean obtainedFromCamera = false;
    private boolean isWalletEdit = false;
    private Boolean removable = Boolean.TRUE;

    public static class CardDetailsBuilder {
        private Double amount;
        private Address billingAddress;
        private String cardDisplayNumber;
        private String cardProductName;
        private String cardToken;
        private String cardholderName;
        private String checkoutType;
        private String exprDate;
        private boolean isBackup;
        private boolean isFromChargeAccount;
        private boolean isStoredCard;
        private boolean isWalletDefault;
        private IssuerNameEnum issuer;
        private String profileEmail;
        private Name profileName;
        private Phone profilePhone;
        private Payment scheduled;
        private String securityCode;
        private List<DescriptorType> terms;
        private String tokenVault;
        private CardTypeEnum type;
        private boolean saveToProfile = false;
        private boolean obtainedFromCamera = false;
        private boolean isWalletEdit = false;
        private Boolean removable = Boolean.TRUE;

        public CardDetails build() {
            CardDetails cardDetails = new CardDetails();
            cardDetails.setAmount(this.amount);
            cardDetails.setBillingAddress(this.billingAddress);
            cardDetails.setCardholderName(this.cardholderName);
            cardDetails.setCardToken(this.cardToken);
            cardDetails.setTokenVault(this.tokenVault);
            cardDetails.setExprDate(this.exprDate);
            cardDetails.setObtainedFromCamera(this.obtainedFromCamera);
            cardDetails.setProfileName(this.profileName);
            cardDetails.setProfilePhone(this.profilePhone);
            cardDetails.setProfileEmail(this.profileEmail);
            cardDetails.setSaveToProfile(this.saveToProfile);
            cardDetails.setSecurityCode(this.securityCode);
            cardDetails.setSaveToProfile(this.saveToProfile);
            cardDetails.setScheduled(this.scheduled);
            cardDetails.setType(this.type);
            cardDetails.setWalletDefault(this.isWalletDefault);
            cardDetails.setWalletEdit(this.isWalletEdit);
            cardDetails.setStoredCard(this.isStoredCard);
            cardDetails.setBackup(this.isBackup);
            cardDetails.setFromChargeAccount(this.isFromChargeAccount);
            cardDetails.setCardProductName(this.cardProductName);
            cardDetails.setCardDisplayNumber(this.cardDisplayNumber);
            cardDetails.setIssuer(this.issuer);
            cardDetails.setTerms(this.terms);
            cardDetails.setCheckoutType(this.checkoutType);
            cardDetails.setRemovable(this.removable);
            return cardDetails;
        }

        public String getCardDisplayNumber() {
            return this.cardDisplayNumber;
        }

        public String getCardProductName() {
            return this.cardProductName;
        }

        public String getCheckoutType() {
            return this.checkoutType;
        }

        public IssuerNameEnum getIssuer() {
            return this.issuer;
        }

        public Boolean getRemovable() {
            return this.removable;
        }

        public List<DescriptorType> getTerms() {
            return this.terms;
        }

        public boolean isBackup() {
            return this.isBackup;
        }

        public boolean isFromChargeAccount() {
            return this.isFromChargeAccount;
        }

        public boolean isStoredCard() {
            return this.isStoredCard;
        }

        public boolean isWalletDefault() {
            return this.isWalletDefault;
        }

        public boolean isWalletEdit() {
            return this.isWalletEdit;
        }

        public CardDetailsBuilder setAmount(Double d10) {
            this.amount = d10;
            return this;
        }

        public CardDetailsBuilder setBackup(boolean z10) {
            this.isBackup = z10;
            return this;
        }

        public CardDetailsBuilder setBillingAddress(Address address) {
            this.billingAddress = address;
            return this;
        }

        public CardDetailsBuilder setCardDisplayNumber(String str) {
            this.cardDisplayNumber = str;
            return this;
        }

        public CardDetailsBuilder setCardProductName(String str) {
            this.cardProductName = str;
            return this;
        }

        public CardDetailsBuilder setCardToken(String str) {
            this.cardToken = str;
            return this;
        }

        public CardDetailsBuilder setCardholderName(String str) {
            this.cardholderName = str;
            return this;
        }

        public void setCheckoutType(String str) {
            this.checkoutType = str;
        }

        public CardDetailsBuilder setExprDate(String str) {
            this.exprDate = str;
            return this;
        }

        public CardDetailsBuilder setFromChargeAccount(boolean z10) {
            this.isFromChargeAccount = z10;
            return this;
        }

        public CardDetailsBuilder setIssuer(IssuerNameEnum issuerNameEnum) {
            this.issuer = issuerNameEnum;
            return this;
        }

        public CardDetailsBuilder setObtainedFromCamera(boolean z10) {
            this.obtainedFromCamera = z10;
            return this;
        }

        public CardDetailsBuilder setProfileEmail(String str) {
            this.profileEmail = str;
            return this;
        }

        public CardDetailsBuilder setProfileName(Name name) {
            this.profileName = name;
            return this;
        }

        public CardDetailsBuilder setProfilePhone(Phone phone) {
            this.profilePhone = phone;
            return this;
        }

        public CardDetailsBuilder setRemovable(Boolean bool) {
            this.removable = bool;
            return this;
        }

        public CardDetailsBuilder setSaveToProfile(boolean z10) {
            this.saveToProfile = z10;
            return this;
        }

        public CardDetailsBuilder setScheduled(Payment payment) {
            this.scheduled = payment;
            return this;
        }

        public CardDetailsBuilder setSecurityCode(String str) {
            this.securityCode = str;
            return this;
        }

        public CardDetailsBuilder setStoredCard(boolean z10) {
            this.isStoredCard = z10;
            return this;
        }

        public void setTerms(List<DescriptorType> list) {
            this.terms = list;
        }

        public CardDetailsBuilder setTokenVault(String str) {
            this.tokenVault = str;
            return this;
        }

        public CardDetailsBuilder setType(CardTypeEnum cardTypeEnum) {
            this.type = cardTypeEnum;
            return this;
        }

        public CardDetailsBuilder setWalletDefault(boolean z10) {
            this.isWalletDefault = z10;
            return this;
        }

        public CardDetailsBuilder setWalletEdit(boolean z10) {
            this.isWalletEdit = z10;
            return this;
        }
    }

    CardDetails() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            CardDetails cardDetails = (CardDetails) obj;
            if (this.obtainedFromCamera == cardDetails.obtainedFromCamera && Objects.equals(this.cardToken, cardDetails.cardToken) && Objects.equals(this.securityCode, cardDetails.securityCode) && this.type == cardDetails.type && Objects.equals(this.cardholderName, cardDetails.cardholderName) && Objects.equals(this.exprDate, cardDetails.exprDate) && Objects.equals(this.billingAddress, cardDetails.billingAddress) && Objects.equals(this.profileName, cardDetails.profileName) && Objects.equals(this.email, cardDetails.email) && Objects.equals(this.profilePhone, cardDetails.profilePhone) && Objects.equals(this.scheduled, cardDetails.scheduled)) {
                return true;
            }
        }
        return false;
    }

    public Address getBillingAddress() {
        return this.billingAddress;
    }

    public String getCardDisplayNumber() {
        return this.cardDisplayNumber;
    }

    public String getCardProductName() {
        return this.cardProductName;
    }

    public String getCardToken() {
        return this.cardToken;
    }

    public String getCardholderName() {
        return this.cardholderName;
    }

    public String getCheckoutType() {
        return this.checkoutType;
    }

    public String getEmail() {
        return this.email;
    }

    public String getExprDate() {
        return this.exprDate;
    }

    public String getProfileEmail() {
        return this.email;
    }

    public Name getProfileName() {
        return this.profileName;
    }

    public Phone getProfilePhone() {
        return this.profilePhone;
    }

    public Boolean getRemovable() {
        return this.removable;
    }

    public Payment getScheduled() {
        return this.scheduled;
    }

    public String getSecurityCode() {
        return this.securityCode;
    }

    public List<DescriptorType> getTerms() {
        return this.terms;
    }

    public String getTokenVault() {
        return this.tokenVault;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.obtainedFromCamera), this.cardToken, this.securityCode, this.type, this.cardholderName, this.exprDate, this.billingAddress, this.profileName, this.email, this.profilePhone, this.scheduled);
    }

    public boolean isBackup() {
        return this.isBackup;
    }

    public boolean isFromChargeAccount() {
        return this.isFromChargeAccount;
    }

    public boolean isObtainedFromCamera() {
        return this.obtainedFromCamera;
    }

    public boolean isStoredCard() {
        return this.isStoredCard;
    }

    public boolean isWalletDefault() {
        return this.isWalletDefault;
    }

    public boolean isWalletEdit() {
        return this.isWalletEdit;
    }

    public void setBackup(boolean z10) {
        this.isBackup = z10;
    }

    public void setBillingAddress(Address address) {
        this.billingAddress = address;
    }

    public void setCardDisplayNumber(String str) {
        this.cardDisplayNumber = str;
    }

    public void setCardProductName(String str) {
        this.cardProductName = str;
    }

    public void setCardToken(String str) {
        this.cardToken = str;
    }

    public void setCardholderName(String str) {
        this.cardholderName = str;
    }

    public void setCheckoutType(String str) {
        this.checkoutType = str;
    }

    public void setEmail(String str) {
        this.email = str;
    }

    public void setExprDate(String str) {
        this.exprDate = str;
    }

    public void setFromChargeAccount(boolean z10) {
        this.isFromChargeAccount = z10;
    }

    public void setObtainedFromCamera(boolean z10) {
        this.obtainedFromCamera = z10;
    }

    public void setProfileEmail(String str) {
        this.email = str;
    }

    public void setProfileName(Name name) {
        this.profileName = name;
    }

    public void setProfilePhone(Phone phone) {
        this.profilePhone = phone;
    }

    public void setRemovable(Boolean bool) {
        this.removable = bool;
    }

    public void setScheduled(Payment payment) {
        this.scheduled = payment;
    }

    public void setSecurityCode(String str) {
        this.securityCode = str;
    }

    public void setStoredCard(boolean z10) {
        this.isStoredCard = z10;
    }

    public void setTerms(List<DescriptorType> list) {
        this.terms = list;
    }

    public void setTokenVault(String str) {
        this.tokenVault = str;
    }

    public void setType(CardTypeEnum cardTypeEnum) {
        this.type = cardTypeEnum;
    }

    public void setWalletDefault(boolean z10) {
        this.isWalletDefault = z10;
    }

    public void setWalletEdit(boolean z10) {
        this.isWalletEdit = z10;
    }

    public CardDetails(boolean z10, boolean z11, String str, String str2, CardTypeEnum cardTypeEnum, String str3, String str4, Address address) {
        this.exprDate = str3;
        this.cardholderName = str4;
        this.billingAddress = address;
        setSaveToProfile(z10);
        setObtainedFromCamera(z11);
        setCardToken(str);
        setSecurityCode(str2);
        setType(cardTypeEnum);
    }
}