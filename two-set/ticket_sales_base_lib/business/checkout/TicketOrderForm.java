package com.disney.wdpro.ticket_sales_base_lib.business.checkout;

import com.disney.wdpro.service.model.Phone;
import com.disney.wdpro.service.model.payment.CardPaymentMethod;
import com.disney.wdpro.ticket_sales_base_lib.business.DestinationId;
import com.disney.wdpro.ticket_sales_base_lib.business.WebStoreId;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.models.PaymentCard;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.models.SupportedPaymentType;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.models.TicketItem;
import com.disney.wdpro.ticket_sales_base_lib.business.product.DisplayNames;
import com.disney.wdpro.ticket_sales_base_lib.business.product.ProductCategoryType;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Set;
import javax.annotation.Nullable;

/* loaded from: classes18.dex */
public interface TicketOrderForm extends Serializable {
    public static final int MAX_ASSIGNMENT_NAME_CHARS = 56;
    public static final int MIN_ASSIGNMENT_NAME_CHARS = 2;

    public enum ValidationReasons {
        TICKETS_NOT_ASSIGNED,
        GOV_ID_NOT_ASSIGNED,
        TERMS_AND_CONDITIONS_NOT_CONFIRMED,
        CREDIT_CARD_MISSING,
        ELECTRONIC_CONSENT_NOT_ACCEPTED,
        MONTHLY_CONTRACT_NOT_SIGNED,
        DEMOGRAPHIC_DATA_NOT_AVAILABLE_FOR_ALL_GUESTS,
        INVALID_SECURITY_CODE
    }

    void acceptElectronicSignatureConsent(boolean z10);

    void acceptLocalTermsAndConditions(boolean z10);

    void acceptServerTermsAndConditions(boolean z10);

    void assignTicket(int i10, UserDataContainer userDataContainer);

    void assignTicketWithTicketItemLocalId(int i10, UserDataContainer userDataContainer);

    void clearPayments();

    Optional<CardPaymentMethod> getCardPaymentMethod();

    DestinationId getDestinationId();

    long getFormId();

    Phone getPaymentBillingPhone();

    Optional<PaymentCard> getPaymentCard();

    ProductCategoryType getProductCategoryType();

    Optional<UserDataContainer> getPurchaser();

    String getPurchaserSwid();

    Optional<Calendar> getSellableOnDate();

    String getSessionId();

    SupportedPaymentType getSupportedPaymentType();

    TicketItem getTicket(int i10);

    int getTicketCount();

    int getTicketCountAssignedToUser(UserDataContainer userDataContainer);

    Optional<DisplayNames> getTicketDisplayNames();

    ImmutableList<TicketItem> getTicketsAssignedToUser(UserDataContainer userDataContainer);

    UserDataContainer getUserDataContainerForTicketIndex(int i10);

    ImmutableSet<UserDataContainer> getUsersWithAssignedTickets();

    WebStoreId getWebStoreId();

    boolean hasServerTermsAndConditionsBeenAccepted();

    boolean isCreditCardScanned();

    boolean isElectronicSignatureConsentAccepted();

    boolean isGuestOnPaymentPlan();

    boolean isMonthlyContractSigned();

    void markCreditCardScanned();

    void removeTicket(int i10);

    void setDemographicDataAvailableForAllGuests(boolean z10);

    void setPayment(CardPaymentMethod cardPaymentMethod, @Nullable String str);

    void setPayment(PaymentCard paymentCard);

    void setPaymentBillingPhone(Phone phone);

    void setPurchaser(UserDataContainer userDataContainer);

    void setSupportedPaymentType(SupportedPaymentType supportedPaymentType);

    void signMonthlyContract(boolean z10);

    Set<ValidationReasons> validateForContractGeneration(Set<SupportedPaymentType> set);

    Set<ValidationReasons> validateForPurchase(Set<SupportedPaymentType> set);
}