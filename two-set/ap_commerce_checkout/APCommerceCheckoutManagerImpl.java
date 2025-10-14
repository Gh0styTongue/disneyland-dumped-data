package com.disney.wdpro.ap_commerce_checkout;

import android.content.Context;
import com.disney.wdpro.analytics.InterfaceC8682n;
import com.disney.wdpro.ap_commerce_checkout.APCommerceCheckoutManager;
import com.disney.wdpro.ap_commerce_checkout.TicketOrderItem;
import com.disney.wdpro.commons.C9350r;
import com.disney.wdpro.commons.config.C9248i;
import com.disney.wdpro.midichlorian.annotations.UIEvent;
import com.disney.wdpro.profile_ui.manager.ProfileManager;
import com.disney.wdpro.service.model.Affiliations;
import com.disney.wdpro.service.model.Avatar;
import com.disney.wdpro.service.model.Media;
import com.disney.wdpro.service.model.PersonName;
import com.disney.wdpro.ticket_sales_base_lib.business.Pricing;
import com.disney.wdpro.ticket_sales_base_lib.business.SettablePersonName;
import com.disney.wdpro.ticket_sales_base_lib.business.TotalDepositDue;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.IdWithType;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.TicketOrderForm;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.UserDataContainer;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.models.TicketItem;
import com.disney.wdpro.ticket_sales_base_lib.business.product.AffiliationType;
import com.disney.wdpro.ticket_sales_base_lib.business.product.DemographicData;
import com.disney.wdpro.ticket_sales_base_lib.business.product.ProductCategoryDetails;
import com.disney.wdpro.ticket_sales_base_lib.business.product.ProductCategoryType;
import com.disney.wdpro.ticket_sales_base_lib.business.tiers.MonthlyPaymentAmount;
import com.disney.wdpro.ticket_sales_base_lib.utils.SerializablePair;
import com.disney.wdpro.ticket_sales_base_lib.utils.ServiceDateFormatter;
import com.disney.wdpro.ticket_sales_booking_lib.business.checkout.BookingApiClient;
import com.disney.wdpro.ticket_sales_booking_lib.business.checkout.BookingApiSession;
import com.disney.wdpro.ticket_sales_booking_lib.business.checkout.ListServiceApiClient;
import com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.ticketOrder.GuestInOrder;
import com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.ticketOrder.TicketOrderResponse;
import com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.ticketOrder.annualPass.AnnualPassOrderItemComponent;
import com.disney.wdpro.ticket_sales_booking_lib.business.product.assemblerapi.ProductAssemblerApiClient;
import com.disney.wdpro.ticket_sales_managers.BookingApiSessionStore;
import com.disney.wdpro.ticket_sales_managers.GeneralTicketSalesCheckoutManagerImpl;
import com.google.common.base.C22462m;
import com.google.common.base.Optional;
import com.google.common.collect.AbstractC22726b3;
import com.google.common.collect.AbstractC22798t1;
import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.TimeZone;
import javax.inject.Inject;

/* loaded from: classes23.dex */
public class APCommerceCheckoutManagerImpl extends GeneralTicketSalesCheckoutManagerImpl implements APCommerceCheckoutManager {
    private boolean userNeedsToValidateResidency;

    /* renamed from: com.disney.wdpro.ap_commerce_checkout.APCommerceCheckoutManagerImpl$1 */
    static /* synthetic */ class C86851 {

        /* renamed from: $SwitchMap$com$disney$wdpro$ticket_sales_base_lib$business$product$ProductCategoryType */
        static final /* synthetic */ int[] f29116x3a53626;

        static {
            int[] iArr = new int[ProductCategoryType.values().length];
            f29116x3a53626 = iArr;
            try {
                iArr[ProductCategoryType.ANNUAL_PASS_RENEWALS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29116x3a53626[ProductCategoryType.ANNUAL_PASS_UPGRADE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29116x3a53626[ProductCategoryType.ANNUAL_PASS_SALES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Inject
    public APCommerceCheckoutManagerImpl(Context context, GeneralTicketSalesCheckoutManagerImpl.Creator creator, BookingApiSessionStore bookingApiSessionStore, InterfaceC8682n interfaceC8682n, ProductAssemblerApiClient productAssemblerApiClient, ListServiceApiClient listServiceApiClient, C9248i c9248i) {
        super(context, creator, bookingApiSessionStore, interfaceC8682n, productAssemblerApiClient, listServiceApiClient, c9248i);
    }

    private ArrayList<SerializablePair<UserDataContainer, Optional<String>>> getAPSalesPassHolderItems(TicketOrderForm ticketOrderForm, List<TicketItem> list) throws IllegalArgumentException {
        C22462m.m68685q(ticketOrderForm, "TicketOrderForm == null");
        BookingApiSession bookingApiSession = getBookingApiSession(ticketOrderForm.getFormId());
        ArrayList<SerializablePair<UserDataContainer, Optional<String>>> arrayListM69268i = Lists.m69268i();
        List<TicketOrderResponse.OrderItem> orderItems = bookingApiSession.getOrderItems();
        for (int i10 = 0; i10 < list.size(); i10++) {
            TicketItem ticketItem = list.get(i10);
            UserDataContainer aPSalesUserDataContainer = getAPSalesUserDataContainer(ticketOrderForm.getFormId(), ticketItem);
            Optional<String> optionalAbsent = Optional.absent();
            Iterator<TicketOrderResponse.OrderItem> it = orderItems.iterator();
            while (true) {
                if (it.hasNext()) {
                    TicketOrderResponse.OrderItem next = it.next();
                    if (next.getProductInstanceIds().contains(ticketItem.getProductInstanceId())) {
                        optionalAbsent = next.getItemName();
                        break;
                    }
                }
            }
            arrayListM69268i.add(i10, new SerializablePair<>(aPSalesUserDataContainer, optionalAbsent));
        }
        return arrayListM69268i;
    }

    private UserDataContainer getAPSalesUserDataContainer(long j10, TicketItem ticketItem) {
        HashMap map = new HashMap();
        map.put(Avatar.AvatarMedia.AVATAR_MOBILE_SQUARE.toString(), new Media(ticketItem.getAvatarImageUrl()));
        UserDataContainer.UserDataContainerBuilder ageGroup = new UserDataContainer.UserDataContainerBuilder().setPersonName(SettablePersonName.fromPersonName(ticketItem.getGuestName().get())).setAvatar(new Avatar("id", "name", map)).setAgeGroup(ticketItem.getAgeGroup());
        if (ticketItem.getGuestIdType() != null && ticketItem.getGuestId() != null) {
            ageGroup.setIdWithType(new IdWithType(UserDataContainer.IdType.findById(ticketItem.getGuestIdType()), ticketItem.getGuestId()));
        }
        ageGroup.setAssignedEntitlementId(Integer.toString(ApUtils.getRandomNumber()));
        ageGroup.setTicketItemLocalId(ticketItem.getLocalId());
        if (ticketItem.getBirthdate() != null) {
            SimpleDateFormat simpleDateFormatM39105x = new C9350r().m39105x();
            Calendar calendar = Calendar.getInstance();
            try {
                calendar.setTime(simpleDateFormatM39105x.parse(ticketItem.getBirthdate()));
                ageGroup.setBirthDate(calendar);
            } catch (ParseException e10) {
                e10.toString();
            }
        }
        if (ticketItem.getDemographicData().isPresent()) {
            DemographicData demographicData = ticketItem.getDemographicData().get();
            demographicData.toString();
            ageGroup.setGender(getTitleGender(j10, demographicData.getName().getTitle().get()));
            ageGroup.setDemographicData(demographicData);
        }
        if (ticketItem.getAffiliationType().isPresent()) {
            ageGroup.setAffiliationType(ticketItem.getAffiliationType().get());
        }
        return ageGroup.build();
    }

    private ArrayList<SerializablePair<UserDataContainer, Optional<String>>> getApRenewalPassHolderList(BookingApiSession bookingApiSession) {
        ArrayList<SerializablePair<UserDataContainer, Optional<String>>> arrayListM69268i = Lists.m69268i();
        Map<String, GuestInOrder> guestsInOrder = bookingApiSession.getGuestsInOrder();
        if (guestsInOrder == null) {
            throw new IllegalStateException("Guests not parsed correctly.");
        }
        for (TicketOrderResponse.OrderItem orderItem : bookingApiSession.getOrderItems()) {
            List<String> guestParticipantIdsWithThisOrderItem = orderItem.getGuestParticipantIdsWithThisOrderItem();
            if (guestParticipantIdsWithThisOrderItem != null) {
                Iterator<String> it = guestParticipantIdsWithThisOrderItem.iterator();
                while (it.hasNext()) {
                    GuestInOrder guestInOrder = guestsInOrder.get(it.next());
                    if (guestInOrder != null) {
                        HashMap map = new HashMap();
                        map.put(Avatar.AvatarMedia.AVATAR_MOBILE_SQUARE.toString(), new Media(guestInOrder.getAvatarImageUrl().orNull()));
                        arrayListM69268i.add(new SerializablePair<>(new UserDataContainer.UserDataContainerBuilder().setPersonName(SettablePersonName.fromPersonName(guestInOrder.getName().mo68585or((Optional<PersonName>) new PersonName("Miss", "Emily", "", "Spiva", "")))).setAssignedEntitlementId(guestInOrder.getAssignedEntitlementId()).setAddresses(Lists.m69271l(guestInOrder.getAddress().orNull())).setAvatar(new Avatar("id", "name", map)).setEmail(guestInOrder.getEmailAddress().orNull()).setIdWithType(guestInOrder.getIdWithType().orNull()).setPhones(Lists.m69271l(guestInOrder.getPhoneNumber().orNull())).setBirthDate(guestInOrder.getBirthDate().orNull()).setGuestLocalId(guestInOrder.getParticipantId()).build(), orderItem.getItemName()));
                    }
                }
            }
        }
        return arrayListM69268i;
    }

    private ArrayList<SerializablePair<UserDataContainer, Optional<String>>> getApUpgradePassHolderList(BookingApiSession bookingApiSession, List<TicketItem> list) {
        ArrayList<SerializablePair<UserDataContainer, Optional<String>>> arrayListM69268i = Lists.m69268i();
        Map<String, GuestInOrder> guestsInOrder = bookingApiSession.getGuestsInOrder();
        if (guestsInOrder == null) {
            throw new IllegalStateException("Guests not parsed correctly.");
        }
        for (TicketOrderResponse.OrderItem orderItem : bookingApiSession.getOrderItems()) {
            List<String> guestParticipantIdsWithThisOrderItem = orderItem.getGuestParticipantIdsWithThisOrderItem();
            Map<String, AnnualPassOrderItemComponent.AnnualPassItem.TicketUpgradeData> ticketUpgradeDataMap = ((AnnualPassOrderItemComponent) orderItem.getOrderItemComponent()).getTicketUpgradeDataMap();
            if (guestParticipantIdsWithThisOrderItem != null) {
                Iterator<String> it = guestParticipantIdsWithThisOrderItem.iterator();
                while (it.hasNext()) {
                    GuestInOrder guestInOrder = guestsInOrder.get(it.next());
                    if (guestInOrder != null) {
                        HashMap map = new HashMap();
                        map.put(Avatar.AvatarMedia.AVATAR_MOBILE_SQUARE.toString(), new Media(guestInOrder.getAvatarImageUrl().orNull()));
                        TicketItem assignedTicketItem = getAssignedTicketItem(guestInOrder.getAssignedEntitlementId(), list);
                        list.remove(assignedTicketItem);
                        UserDataContainer.UserDataContainerBuilder ageGroup = new UserDataContainer.UserDataContainerBuilder().setPersonName(SettablePersonName.fromPersonName(guestInOrder.getName().mo68585or((Optional<PersonName>) new PersonName("", "", "", "", "")))).setAssignedEntitlementId(guestInOrder.getAssignedEntitlementId()).setAddresses(Lists.m69271l(guestInOrder.getAddress().orNull())).setAvatar(new Avatar("id", "name", map)).setEmail(guestInOrder.getEmailAddress().orNull()).setIdWithType(guestInOrder.getIdWithType().orNull()).setPhones(Lists.m69271l(guestInOrder.getPhoneNumber().orNull())).setGuestLocalId(guestInOrder.getParticipantId()).setAgeGroup(assignedTicketItem.getAgeGroup());
                        Calendar calendar = Calendar.getInstance();
                        if ("swid".equals(assignedTicketItem.getGuestIdType())) {
                            try {
                                calendar = ApUtils.getBirthdateCalendar(assignedTicketItem.getBirthdate());
                            } catch (ParseException e10) {
                                e10.printStackTrace();
                            }
                            ageGroup.setSwid(assignedTicketItem.getGuestId());
                            ageGroup.setBirthDate(calendar);
                        } else if (guestInOrder.getBirthDate().isPresent()) {
                            ageGroup.setBirthDate(guestInOrder.getBirthDate().orNull());
                        } else {
                            try {
                                calendar = ApUtils.getBirthdateCalendar(assignedTicketItem.getBirthdate());
                            } catch (NullPointerException unused) {
                                calendar = guestInOrder.getBirthDate().orNull();
                            } catch (ParseException e11) {
                                e11.printStackTrace();
                            }
                            ageGroup.setBirthDate(calendar);
                        }
                        if (assignedTicketItem.getAffiliationType().isPresent()) {
                            ageGroup.setAffiliationType(assignedTicketItem.getAffiliationType().get());
                        }
                        arrayListM69268i.add(new SerializablePair<>(ageGroup.build(), !orderItem.getItemName().isPresent() ? Optional.absent() : Optional.m68592of(this.appContext.getString(C8689R.string.ap_commerce_expires, orderItem.getItemName().get(), ticketUpgradeDataMap.get(guestInOrder.getAssignedEntitlementId()).getExpirationDate()))));
                    }
                }
            }
        }
        C22462m.m68691w(list.isEmpty(), "All ticket items were not assigned.");
        return arrayListM69268i;
    }

    private TicketItem getAssignedTicketItem(String str, List<TicketItem> list) {
        TicketItem next;
        Iterator<TicketItem> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next.getEntitlementId().equals(str)) {
                break;
            }
        }
        C22462m.m68691w(next != null, "Ticket assignment failed. No ticket Item found corresponding to the Product instance.");
        return next;
    }

    private BookingApiSession getBookingApiSession(long j10) throws IllegalArgumentException {
        BookingApiSession apiSession = this.sessionStore.readApiSession(j10);
        if (apiSession != null) {
            return apiSession;
        }
        throw new IllegalArgumentException("Session not found.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private TicketOrderItem getTicketOrderItem(AnnualPassOrderItemComponent annualPassOrderItemComponent, ProductCategoryType productCategoryType) {
        TicketOrderItem.Builder builderDisplayName = TicketOrderItem.builder().displayName(annualPassOrderItemComponent.getItemName());
        int i10 = C86851.f29116x3a53626[productCategoryType.ordinal()];
        if (i10 == 1) {
            builderDisplayName.addPriceDetailLine(annualPassOrderItemComponent.getDeposit(), annualPassOrderItemComponent.getPricePerMonth(), annualPassOrderItemComponent.getUnitPrice(), annualPassOrderItemComponent.getQuantity());
        } else if (i10 != 2) {
            if (i10 != 3) {
                throw new UnsupportedOperationException("ProductCategoryType: " + productCategoryType + " is not supported.");
            }
            builderDisplayName.addPriceDetailLine(annualPassOrderItemComponent.getDeposit(), annualPassOrderItemComponent.getPricePerMonth(), annualPassOrderItemComponent.getUnitPrice(), annualPassOrderItemComponent.getQuantity());
        } else {
            Map<String, AnnualPassOrderItemComponent.AnnualPassItem.TicketUpgradeData> ticketUpgradeDataMap = annualPassOrderItemComponent.getTicketUpgradeDataMap();
            Maps.m69381r().putAll(ticketUpgradeDataMap);
            ImmutableMultiset immutableMultisetM69708v = AbstractC22798t1.m69693q(ticketUpgradeDataMap.values()).m69708v();
            AbstractC22726b3 it = immutableMultisetM69708v.elementSet().iterator();
            while (it.hasNext()) {
                AnnualPassOrderItemComponent.AnnualPassItem.TicketUpgradeData ticketUpgradeData = (AnnualPassOrderItemComponent.AnnualPassItem.TicketUpgradeData) it.next();
                builderDisplayName.addPriceDetailLine(ticketUpgradeData.getDeposit(), ticketUpgradeData.getPricePerMonth(), ticketUpgradeData.getUnitPrice(), immutableMultisetM69708v.count(ticketUpgradeData));
            }
        }
        return builderDisplayName.build();
    }

    private List<TicketOrderItem> getTicketOrderItems(TicketOrderResponse ticketOrderResponse, ProductCategoryType productCategoryType) {
        ArrayList arrayList = new ArrayList();
        AbstractC22726b3<TicketOrderResponse.OrderItem> it = ticketOrderResponse.getOrderItems().iterator();
        while (it.hasNext()) {
            arrayList.add(getTicketOrderItem((AnnualPassOrderItemComponent) it.next().getOrderItemComponent(), productCategoryType));
        }
        return arrayList;
    }

    private boolean isFLResidencyEnable() {
        return this.vendomatic.m38785q1();
    }

    private boolean isFloridaTicket(ArrayList<TicketItem> arrayList) {
        if (arrayList == null) {
            return false;
        }
        Iterator<TicketItem> it = arrayList.iterator();
        while (it.hasNext()) {
            TicketItem next = it.next();
            if (next.getAffiliationType().isPresent() && next.getAffiliationType().get().equals(AffiliationType.FL_RESIDENT)) {
                return true;
            }
        }
        return false;
    }

    private boolean userNeedsToValidateResidency(EnumSet<Affiliations.Affiliation.AffiliationType> enumSet) {
        Iterator<Affiliations.Affiliation.AffiliationType> it = enumSet.iterator();
        while (it.hasNext()) {
            Affiliations.Affiliation.AffiliationType next = it.next();
            if (next.equals(Affiliations.Affiliation.AffiliationType.RESIDENCY) && next.getSubtypes().contains(Affiliations.Affiliation.AffiliationSubtype.FLORIDA)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.disney.wdpro.ap_commerce_checkout.APCommerceCheckoutManager
    @UIEvent
    public APCommerceCheckoutManager.ContractEvent fetchContract(TicketOrderForm ticketOrderForm, ProductCategoryDetails productCategoryDetails) throws MissingResourceException {
        BookingApiSession apiSession = this.sessionStore.readApiSession(ticketOrderForm.getFormId());
        String zuluDateStringForServiceRequest = new ServiceDateFormatter(new C9350r(TimeZone.getTimeZone("Zulu"), Locale.US)).getZuluDateStringForServiceRequest(ticketOrderForm.getSellableOnDate().orNull());
        BookingApiClient bookingApiClient = this.creator.getBookingApiClient();
        String iSO3Country = this.appContext.getResources().getConfiguration().locale.getISO3Country();
        APCommerceCheckoutManager.ContractEvent contractEvent = new APCommerceCheckoutManager.ContractEvent();
        try {
            contractEvent.setResult((APCommerceCheckoutManager.ContractEvent) bookingApiClient.fetchContract(ticketOrderForm, apiSession, iSO3Country, zuluDateStringForServiceRequest, productCategoryDetails));
            return contractEvent;
        } catch (IOException e10) {
            contractEvent.setException(e10);
            return contractEvent;
        }
    }

    @Override // com.disney.wdpro.ap_commerce_checkout.APCommerceCheckoutManager
    public String getFlexPassTermsAndCondition(long j10) {
        return getBookingApiSession(j10).getCreateOrderResponse().getFlexPassTermsAndCondition();
    }

    @Override // com.disney.wdpro.ap_commerce_checkout.APCommerceCheckoutManager
    public Optional<MonthlyPaymentAmount> getMonthlyPaymentAmount(Long l10) throws IllegalArgumentException {
        return getBookingApiSession(l10.longValue()).getCreateOrderResponse().getMonthlyPaymentAmount();
    }

    @Override // com.disney.wdpro.ap_commerce_checkout.APCommerceCheckoutManager
    public String[] getNameTitles(long j10) throws IllegalArgumentException {
        return getBookingApiSession(j10).getNameTitles();
    }

    @Override // com.disney.wdpro.ap_commerce_checkout.APCommerceCheckoutManager
    public ArrayList<SerializablePair<UserDataContainer, Optional<String>>> getPassHolderItems(TicketOrderForm ticketOrderForm, List<TicketItem> list, ProductCategoryType productCategoryType) throws IllegalArgumentException {
        C22462m.m68685q(ticketOrderForm, "TicketOrderForm == null");
        BookingApiSession bookingApiSession = getBookingApiSession(ticketOrderForm.getFormId());
        int i10 = C86851.f29116x3a53626[productCategoryType.ordinal()];
        if (i10 == 1) {
            return getApRenewalPassHolderList(bookingApiSession);
        }
        if (i10 == 2) {
            return getApUpgradePassHolderList(bookingApiSession, list);
        }
        if (i10 == 3) {
            return getAPSalesPassHolderItems(ticketOrderForm, list);
        }
        throw new UnsupportedOperationException("ProductCategoryType: " + productCategoryType + " is not supported.");
    }

    @Override // com.disney.wdpro.ap_commerce_checkout.APCommerceCheckoutManager
    public Pricing getPricing(Long l10) throws IllegalArgumentException {
        return getBookingApiSession(l10.longValue()).getCreateOrderResponse().getPricing();
    }

    @Override // com.disney.wdpro.ap_commerce_checkout.APCommerceCheckoutManager
    public TicketOrder getTicketOrder(long j10, ProductCategoryType productCategoryType) {
        int i10 = C86851.f29116x3a53626[productCategoryType.ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            TicketOrderResponse createOrderResponse = getBookingApiSession(j10).getCreateOrderResponse();
            return TicketOrder.builder().pricing(createOrderResponse.getPricing()).monthlyPaymentAmount(createOrderResponse.getMonthlyPaymentAmount().orNull()).totalDepositDue(createOrderResponse.getTotalDepositDue().orNull()).guestOnMonthlyPaymentPlan(createOrderResponse.isGuestOnMonthlyPaymentPlan()).ticketOrderItemList(getTicketOrderItems(createOrderResponse, productCategoryType)).build();
        }
        throw new UnsupportedOperationException("ProductCategoryType: " + productCategoryType + " is not supported.");
    }

    @Override // com.disney.wdpro.ap_commerce_checkout.APCommerceCheckoutManager
    public String getTitleGender(long j10, String str) throws IllegalArgumentException {
        return getBookingApiSession(j10).getTitleGender(str);
    }

    @Override // com.disney.wdpro.ap_commerce_checkout.APCommerceCheckoutManager
    public Map<String, String> getTitleToGenderMap(long j10) {
        return getBookingApiSession(j10).getTitleToGenderMap();
    }

    @Override // com.disney.wdpro.ap_commerce_checkout.APCommerceCheckoutManager
    public Optional<TotalDepositDue> getTotalDepositDueAmount(Long l10) throws IllegalArgumentException {
        return getBookingApiSession(l10.longValue()).getCreateOrderResponse().getTotalDepositDue();
    }

    @Override // com.disney.wdpro.ap_commerce_checkout.APCommerceCheckoutManager
    public APCommerceCheckoutManager.ResidencyVerificationEvent needsFLValidation(String str, ProfileManager profileManager, ArrayList<TicketItem> arrayList) {
        APCommerceCheckoutManager.ResidencyVerificationEvent residencyVerificationEvent = new APCommerceCheckoutManager.ResidencyVerificationEvent();
        this.userNeedsToValidateResidency = userNeedsToValidateResidency(profileManager.getAffiliations(str));
        residencyVerificationEvent.setResult(isFLResidencyEnable() && isFloridaTicket(arrayList) && this.userNeedsToValidateResidency);
        return residencyVerificationEvent;
    }

    @Override // com.disney.wdpro.ap_commerce_checkout.APCommerceCheckoutManager
    public boolean userNeedsToValidateResidency() {
        return this.userNeedsToValidateResidency;
    }
}