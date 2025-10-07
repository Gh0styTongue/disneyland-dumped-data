package com.disney.wdpro.ticket_sales_base_lib.business.product;

import com.disney.wdpro.ticket_sales_base_lib.business.DestinationId;
import com.disney.wdpro.ticket_sales_base_lib.business.Price;
import com.disney.wdpro.ticket_sales_base_lib.business.Pricing;
import com.disney.wdpro.ticket_sales_base_lib.business.WebStoreId;
import com.disney.wdpro.ticket_sales_base_lib.business.product.PolicyGroup;
import com.google.common.base.C22462m;
import com.google.common.base.C22466q;
import com.google.common.base.Optional;
import com.google.common.collect.AbstractC22726b3;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

/* loaded from: classes18.dex */
public class SelectedTicketProducts implements Serializable {
    private static final long serialVersionUID = 1;
    private final Optional<Price> adultCombinedSubtotal;
    private final ImmutableListMultimap<AgeGroup, SelectedTicketProduct> ageGroupToSelectedTicketsMap;
    private final Optional<Price> allAgesCombinedSubtotal;
    private final Optional<Price> childCombinedSubtotal;
    private final Optional<Price> combinedSubtotal;
    private final Optional<Price> combinedTax;
    private final Optional<Price> combinedTotal;
    private final DestinationId destinationId;
    private String discountGroupType;
    private final String dtiStoreId;
    private final ImmutableListMultimap<String, SelectedTicketProduct> genericTickets;
    private final boolean isGovIdRequired;
    private final Integer numberOfSelectedDays;
    private final Optional<String> oneDayDisplayDate;
    private final LinkedHashSet<Policy> policies;
    private final Map<PolicyUILocation, CharSequence> policiesWithLocation;
    private final PricePerTicket pricePerTicket;
    private final ProductCategoryType productCategoryType;
    private final String productId;
    private final Optional<Calendar> responseDateTime;
    private final Calendar sellableOnDate;
    private final Optional<Price> seniorCombinedSubtotal;
    private final String sessionId;
    private final String startDateTime;
    private final Price totalDownForMonthlyOption;
    private final Price totalMonthlyPrice;
    private final Optional<String> twoDayDisplayDate;
    private final WebStoreId webStoreId;

    public static class Builder {
        private Price adultCombinedSubtotal;
        private ImmutableListMultimap<AgeGroup, SelectedTicketProduct> ageGroupToSelectedTicketsMap;
        private Price allAgesCombinedSubtotal;
        private Price childCombinedSubtotal;
        private Price combinedSubtotal;
        private Price combinedTax;
        private Price combinedTotal;
        private DestinationId destinationId;
        private String discountGroupType;
        private String dtiStoreId;
        private ImmutableListMultimap<String, SelectedTicketProduct> genericTicketProducts;
        private boolean isGovIdRequired;
        private int numberOfAdultTickets;
        private int numberOfAllAgesTickets;
        private int numberOfChildTickets;
        private Integer numberOfSelectedDays;
        private int numberOfSeniorTickets;
        private String oneDayDisplayDate;
        private PricePerTicket pricePerTicket;
        private ProductCategoryType productCategoryType;
        private String productId;
        private Calendar responseDateTime;
        private Calendar sellableOnDate;
        private Price seniorCombinedSubtotal;
        private String sessionId;
        private String startDateTime;
        private Price totalDownForMonthlyOption;
        private Price totalMonthlyPrice;
        private String twoDayDisplayDate;
        private WebStoreId webStoreId;
        private ImmutableListMultimap.C22585a<String, SelectedTicketProduct> ticketProductsBuilder = ImmutableListMultimap.builder();
        private Map<PolicyUILocation, CharSequence> policiesWithLocation = Maps.m69381r();
        private ImmutableListMultimap.C22585a<AgeGroup, SelectedTicketProduct> ageGroupToSelectedTicketsMapBuilder = ImmutableListMultimap.builder();
        private SelectedTicketProduct.Builder adultSelectedTicketProductBuilder = new SelectedTicketProduct.Builder();
        private SelectedTicketProduct.Builder childSelectedTicketProductBuilder = new SelectedTicketProduct.Builder();
        private SelectedTicketProduct.Builder seniorSelectedTicketProductBuilder = new SelectedTicketProduct.Builder();
        private SelectedTicketProduct.Builder allAgesSelectedTicketProductBuilder = new SelectedTicketProduct.Builder();
        private final LinkedHashSet<Policy> policies = Sets.m69466m();

        private void addTicketsAsPerAge(AgeGroup ageGroup, int i10, SelectedTicketProduct.Builder builder) {
            if (i10 > 0) {
                for (int i11 = 0; i11 < i10; i11++) {
                    this.ageGroupToSelectedTicketsMapBuilder.mo69063d(ageGroup, builder.build());
                }
            }
        }

        public Builder addPolicy(Policy policy) {
            this.policies.add(policy);
            return this;
        }

        public Builder addPolicyWithLocation(PolicyUILocation policyUILocation, CharSequence charSequence) {
            this.policiesWithLocation.put(policyUILocation, charSequence);
            return this;
        }

        public Builder addSelectedTicketProduct(SelectedTicketProduct selectedTicketProduct) {
            this.ticketProductsBuilder.mo69063d(selectedTicketProduct.productInstanceId, (SelectedTicketProduct) C22462m.m68685q(selectedTicketProduct, "selected ticket product cannot be null."));
            return this;
        }

        public SelectedTicketProducts build() {
            C22462m.m68685q(this.combinedTotal, "combinedTotal is required");
            C22462m.m68685q(this.combinedSubtotal, "combinedSubtotal is required");
            C22462m.m68685q(this.combinedTax, "combinedTax is required");
            C22462m.m68685q(this.webStoreId, "web StoreId is required");
            C22462m.m68685q(this.sessionId, "sessionId == null");
            C22462m.m68685q(this.destinationId, "destinationId == null");
            C22462m.m68673e(!C22466q.m68722b(this.dtiStoreId), "DTI store Id is required");
            C22462m.m68685q(Boolean.valueOf(!C22466q.m68722b(this.discountGroupType)), "discountGroupType is required");
            addTicketsAsPerAge(AgeGroup.ADULT, this.numberOfAdultTickets, this.adultSelectedTicketProductBuilder);
            addTicketsAsPerAge(AgeGroup.CHILD, this.numberOfChildTickets, this.childSelectedTicketProductBuilder);
            addTicketsAsPerAge(AgeGroup.SENIOR, this.numberOfSeniorTickets, this.seniorSelectedTicketProductBuilder);
            addTicketsAsPerAge(AgeGroup.ALL_AGES, this.numberOfAllAgesTickets, this.allAgesSelectedTicketProductBuilder);
            this.genericTicketProducts = this.ticketProductsBuilder.m69066h();
            this.ageGroupToSelectedTicketsMap = this.ageGroupToSelectedTicketsMapBuilder.m69066h();
            return new SelectedTicketProducts(this);
        }

        public Builder setAdultATSCode(@Nullable String str) {
            this.adultSelectedTicketProductBuilder.setAtsCode(str);
            return this;
        }

        public Builder setAdultCategoryId(@Nullable String str) {
            this.adultSelectedTicketProductBuilder.setCategoryId(str);
            return this;
        }

        public Builder setAdultCombinedSubtotal(@Nullable Price price) {
            this.adultCombinedSubtotal = price;
            return this;
        }

        public Builder setAdultPricing(Pricing pricing) {
            this.adultSelectedTicketProductBuilder.setTicketPricing(pricing);
            return this;
        }

        public Builder setAdultProductInstanceId(@Nullable String str) {
            this.adultSelectedTicketProductBuilder.setProductInstanceId(str);
            return this;
        }

        public Builder setAllAgesATSCode(@Nullable String str) {
            this.allAgesSelectedTicketProductBuilder.setAtsCode(str);
            return this;
        }

        public Builder setAllAgesCategoryId(@Nullable String str) {
            this.allAgesSelectedTicketProductBuilder.setCategoryId(str);
            return this;
        }

        public Builder setAllAgesCombinedSubtotal(@Nullable Price price) {
            this.allAgesCombinedSubtotal = price;
            return this;
        }

        public Builder setAllAgesPricing(Pricing pricing) {
            this.allAgesSelectedTicketProductBuilder.setTicketPricing(pricing);
            return this;
        }

        public Builder setAllAgesProductInstanceId(@Nullable String str) {
            this.allAgesSelectedTicketProductBuilder.setProductInstanceId(str);
            return this;
        }

        public Builder setChildATSCode(@Nullable String str) {
            this.childSelectedTicketProductBuilder.setAtsCode(str);
            return this;
        }

        public Builder setChildCategoryId(@Nullable String str) {
            this.childSelectedTicketProductBuilder.setCategoryId(str);
            return this;
        }

        public Builder setChildCombinedSubtotal(@Nullable Price price) {
            this.childCombinedSubtotal = price;
            return this;
        }

        public Builder setChildPricing(Pricing pricing) {
            this.childSelectedTicketProductBuilder.setTicketPricing(pricing);
            return this;
        }

        public Builder setChildProductInstanceId(@Nullable String str) {
            this.childSelectedTicketProductBuilder.setProductInstanceId(str);
            return this;
        }

        public Builder setCombinedSubtotal(@Nullable Price price) {
            this.combinedSubtotal = price;
            return this;
        }

        public Builder setCombinedTax(@Nullable Price price) {
            this.combinedTax = price;
            return this;
        }

        public Builder setCombinedTotal(@Nullable Price price) {
            this.combinedTotal = price;
            return this;
        }

        public Builder setDestinationId(DestinationId destinationId) {
            this.destinationId = destinationId;
            return this;
        }

        public Builder setDiscountGroupType(String str) {
            this.discountGroupType = str;
            return this;
        }

        public Builder setDtiStoreId(String str) {
            this.dtiStoreId = str;
            return this;
        }

        public Builder setIsGovIdRequired(boolean z10) {
            this.isGovIdRequired = z10;
            return this;
        }

        public Builder setNumberOfAdultTickets(int i10) {
            this.numberOfAdultTickets = i10;
            return this;
        }

        public Builder setNumberOfAllAgesTickets(int i10) {
            this.numberOfAllAgesTickets = i10;
            return this;
        }

        public Builder setNumberOfChildTickets(int i10) {
            this.numberOfChildTickets = i10;
            return this;
        }

        public Builder setNumberOfSelectedDays(Integer num) {
            this.numberOfSelectedDays = num;
            return this;
        }

        public Builder setNumberOfSeniorTickets(int i10) {
            this.numberOfSeniorTickets = i10;
            return this;
        }

        public Builder setOneDayDisplayDate(@Nullable String str) {
            this.oneDayDisplayDate = str;
            return this;
        }

        public Builder setPricePerTicket(PricePerTicket pricePerTicket) {
            this.pricePerTicket = pricePerTicket;
            return this;
        }

        public Builder setProductCategoryType(ProductCategoryType productCategoryType) {
            this.productCategoryType = productCategoryType;
            return this;
        }

        public Builder setProductId(String str) {
            this.productId = str;
            return this;
        }

        public Builder setResponseDateTime(Calendar calendar) {
            this.responseDateTime = calendar;
            return this;
        }

        public Builder setSellableOnDate(Calendar calendar) {
            this.sellableOnDate = calendar;
            return this;
        }

        public Builder setSeniorATSCode(@Nullable String str) {
            this.seniorSelectedTicketProductBuilder.setAtsCode(str);
            return this;
        }

        public Builder setSeniorCategoryId(@Nullable String str) {
            this.seniorSelectedTicketProductBuilder.setCategoryId(str);
            return this;
        }

        public Builder setSeniorCombinedSubtotal(@Nullable Price price) {
            this.seniorCombinedSubtotal = price;
            return this;
        }

        public Builder setSeniorPricing(Pricing pricing) {
            this.seniorSelectedTicketProductBuilder.setTicketPricing(pricing);
            return this;
        }

        public Builder setSeniorProductInstanceId(@Nullable String str) {
            this.seniorSelectedTicketProductBuilder.setProductInstanceId(str);
            return this;
        }

        public Builder setSessionId(String str) {
            this.sessionId = str;
            return this;
        }

        public Builder setStartDateTime(String str) {
            this.startDateTime = str;
            return this;
        }

        public Builder setTicketDisplayNames(@Nullable DisplayNames displayNames) {
            this.adultSelectedTicketProductBuilder.setTicketDisplayNames(displayNames);
            this.childSelectedTicketProductBuilder.setTicketDisplayNames(displayNames);
            this.seniorSelectedTicketProductBuilder.setTicketDisplayNames(displayNames);
            this.allAgesSelectedTicketProductBuilder.setTicketDisplayNames(displayNames);
            return this;
        }

        public Builder setTotalDownForMonthlyOption(Price price) {
            this.totalDownForMonthlyOption = price;
            return this;
        }

        public Builder setTotalMonthlyPrice(Price price) {
            this.totalMonthlyPrice = price;
            return this;
        }

        public Builder setTwoDayDisplayDate(@Nullable String str) {
            this.twoDayDisplayDate = str;
            return this;
        }

        public Builder setWebStoreId(WebStoreId webStoreId) {
            this.webStoreId = webStoreId;
            return this;
        }
    }

    public enum PolicyUILocation {
        BACK_BRICK,
        ORDER_SUMMARY_TERMS_AND_CONDITIONS,
        ORDER_SUMMARY_IMPORTANT_DETAILS,
        ORDER_CONFIRMATION_FINE_PRINT,
        ORDER_CONFIRMATION_DELIVERY_INSTRUCTIONS
    }

    public static class SelectedTicketProduct implements Serializable {
        private static final long serialVersionUID = 1;
        private final String atsCode;
        private final String categoryId;
        private final Optional<Price> downPayment;
        private final String entitlementId;
        private final Optional<Price> monthlyPrice;
        private final String productInstanceId;
        private final DisplayNames ticketDisplayNames;
        private final Pricing ticketPricing;

        public static class Builder {
            private String atsCode;
            private String categoryId;
            private Price downPayment;
            private String entitlementId;
            private Price monthlyPrice;
            private String productInstanceId;
            private DisplayNames ticketDisplayNames;
            private Pricing ticketPricing;

            public SelectedTicketProduct build() {
                C22462m.m68685q(this.ticketDisplayNames, "ticketDisplayNames == null");
                return new SelectedTicketProduct(this);
            }

            public Builder setAtsCode(String str) {
                this.atsCode = str;
                return this;
            }

            public Builder setCategoryId(String str) {
                this.categoryId = str;
                return this;
            }

            public Builder setDownPayment(Price price) {
                this.downPayment = price;
                return this;
            }

            public Builder setEntitlementId(String str) {
                this.entitlementId = str;
                return this;
            }

            public Builder setMonthlyPrice(Price price) {
                this.monthlyPrice = price;
                return this;
            }

            public Builder setProductInstanceId(String str) {
                this.productInstanceId = str;
                return this;
            }

            public Builder setTicketDisplayNames(DisplayNames displayNames) {
                this.ticketDisplayNames = displayNames;
                return this;
            }

            public Builder setTicketPricing(Pricing pricing) {
                this.ticketPricing = pricing;
                return this;
            }
        }

        public SelectedTicketProduct(Builder builder) {
            this.productInstanceId = builder.productInstanceId;
            this.entitlementId = builder.entitlementId;
            this.atsCode = builder.atsCode;
            this.ticketDisplayNames = builder.ticketDisplayNames;
            this.ticketPricing = builder.ticketPricing;
            this.categoryId = builder.categoryId;
            this.monthlyPrice = Optional.fromNullable(builder.monthlyPrice);
            this.downPayment = Optional.fromNullable(builder.downPayment);
        }

        public String getAtsCode() {
            return this.atsCode;
        }

        public String getCategoryId() {
            return this.categoryId;
        }

        public Optional<Price> getDownPaymentForMonthlyOption() {
            return this.downPayment;
        }

        public String getEntitlementId() {
            return this.entitlementId;
        }

        public Optional<Price> getMonthlyPrice() {
            return this.monthlyPrice;
        }

        public String getProductInstanceId() {
            return this.productInstanceId;
        }

        public DisplayNames getTicketDisplayNames() {
            return this.ticketDisplayNames;
        }

        public Pricing getTicketPricing() {
            return this.ticketPricing;
        }
    }

    public SelectedTicketProducts(Builder builder) {
        this.ageGroupToSelectedTicketsMap = builder.ageGroupToSelectedTicketsMap;
        this.genericTickets = builder.genericTicketProducts;
        this.combinedTotal = Optional.fromNullable(builder.combinedTotal);
        this.combinedSubtotal = Optional.fromNullable(builder.combinedSubtotal);
        this.combinedTax = Optional.fromNullable(builder.combinedTax);
        this.adultCombinedSubtotal = Optional.fromNullable(builder.adultCombinedSubtotal);
        this.childCombinedSubtotal = Optional.fromNullable(builder.childCombinedSubtotal);
        this.seniorCombinedSubtotal = Optional.fromNullable(builder.seniorCombinedSubtotal);
        this.allAgesCombinedSubtotal = Optional.fromNullable(builder.allAgesCombinedSubtotal);
        this.oneDayDisplayDate = Optional.fromNullable(builder.oneDayDisplayDate);
        this.twoDayDisplayDate = Optional.fromNullable(builder.twoDayDisplayDate);
        this.pricePerTicket = builder.pricePerTicket;
        this.numberOfSelectedDays = builder.numberOfSelectedDays;
        this.policies = builder.policies;
        this.policiesWithLocation = builder.policiesWithLocation;
        this.webStoreId = builder.webStoreId;
        this.dtiStoreId = builder.dtiStoreId;
        this.sessionId = builder.sessionId;
        this.productId = builder.productId;
        this.destinationId = builder.destinationId;
        this.sellableOnDate = builder.sellableOnDate;
        this.productCategoryType = builder.productCategoryType;
        this.startDateTime = builder.startDateTime;
        this.isGovIdRequired = builder.isGovIdRequired;
        this.totalMonthlyPrice = builder.totalMonthlyPrice;
        this.totalDownForMonthlyOption = builder.totalDownForMonthlyOption;
        this.responseDateTime = Optional.fromNullable(builder.responseDateTime);
        this.discountGroupType = builder.discountGroupType;
    }

    public static Builder builder() {
        return new Builder();
    }

    private boolean matchesGroup(Policy policy, Set<PolicyGroup> set) {
        if (set.contains(PolicyGroup.MATCH_ALL)) {
            return true;
        }
        return set.contains(policy.getGroup());
    }

    private boolean matchesSubGroup(Policy policy, Set<PolicyGroup.PolicySubGroup> set) {
        if (set.contains(PolicyGroup.PolicySubGroup.MATCH_ALL)) {
            return true;
        }
        return set.contains(policy.getSubGroup());
    }

    public Optional<String> getAdultATSCode() {
        ImmutableListMultimap<AgeGroup, SelectedTicketProduct> immutableListMultimap = this.ageGroupToSelectedTicketsMap;
        AgeGroup ageGroup = AgeGroup.ADULT;
        return immutableListMultimap.containsKey(ageGroup) ? Optional.fromNullable(this.ageGroupToSelectedTicketsMap.get((ImmutableListMultimap<AgeGroup, SelectedTicketProduct>) ageGroup).iterator().next().atsCode) : Optional.absent();
    }

    public Optional<String> getAdultCategoryId() {
        ImmutableListMultimap<AgeGroup, SelectedTicketProduct> immutableListMultimap = this.ageGroupToSelectedTicketsMap;
        AgeGroup ageGroup = AgeGroup.ADULT;
        return immutableListMultimap.containsKey(ageGroup) ? Optional.fromNullable(this.ageGroupToSelectedTicketsMap.get((ImmutableListMultimap<AgeGroup, SelectedTicketProduct>) ageGroup).iterator().next().categoryId) : Optional.absent();
    }

    public Optional<Price> getAdultCombinedSubtotal() {
        return this.adultCombinedSubtotal;
    }

    public Pricing getAdultPricing() {
        return this.ageGroupToSelectedTicketsMap.get((ImmutableListMultimap<AgeGroup, SelectedTicketProduct>) AgeGroup.ADULT).iterator().next().ticketPricing;
    }

    public Optional<String> getAdultProductInstanceId() {
        ImmutableListMultimap<AgeGroup, SelectedTicketProduct> immutableListMultimap = this.ageGroupToSelectedTicketsMap;
        AgeGroup ageGroup = AgeGroup.ADULT;
        return immutableListMultimap.containsKey(ageGroup) ? Optional.fromNullable(this.ageGroupToSelectedTicketsMap.get((ImmutableListMultimap<AgeGroup, SelectedTicketProduct>) ageGroup).iterator().next().productInstanceId) : Optional.absent();
    }

    public ImmutableListMultimap<AgeGroup, SelectedTicketProduct> getAgeGroupToSelectedTicketsMap() {
        return this.ageGroupToSelectedTicketsMap;
    }

    public Optional<String> getAllAgesATSCode() {
        ImmutableListMultimap<AgeGroup, SelectedTicketProduct> immutableListMultimap = this.ageGroupToSelectedTicketsMap;
        AgeGroup ageGroup = AgeGroup.ALL_AGES;
        return immutableListMultimap.containsKey(ageGroup) ? Optional.fromNullable(this.ageGroupToSelectedTicketsMap.get((ImmutableListMultimap<AgeGroup, SelectedTicketProduct>) ageGroup).iterator().next().atsCode) : Optional.absent();
    }

    public Optional<String> getAllAgesCategoryId() {
        ImmutableListMultimap<AgeGroup, SelectedTicketProduct> immutableListMultimap = this.ageGroupToSelectedTicketsMap;
        AgeGroup ageGroup = AgeGroup.ALL_AGES;
        return immutableListMultimap.containsKey(ageGroup) ? Optional.fromNullable(this.ageGroupToSelectedTicketsMap.get((ImmutableListMultimap<AgeGroup, SelectedTicketProduct>) ageGroup).iterator().next().categoryId) : Optional.absent();
    }

    public Optional<Price> getAllAgesCombinedSubtotal() {
        return this.allAgesCombinedSubtotal;
    }

    public Pricing getAllAgesPricing() {
        return this.ageGroupToSelectedTicketsMap.get((ImmutableListMultimap<AgeGroup, SelectedTicketProduct>) AgeGroup.ALL_AGES).iterator().next().ticketPricing;
    }

    public Optional<String> getAllAgesProductInstanceId() {
        ImmutableListMultimap<AgeGroup, SelectedTicketProduct> immutableListMultimap = this.ageGroupToSelectedTicketsMap;
        AgeGroup ageGroup = AgeGroup.ALL_AGES;
        return immutableListMultimap.containsKey(ageGroup) ? Optional.fromNullable(this.ageGroupToSelectedTicketsMap.get((ImmutableListMultimap<AgeGroup, SelectedTicketProduct>) ageGroup).iterator().next().productInstanceId) : Optional.absent();
    }

    public Optional<String> getChildATSCode() {
        ImmutableListMultimap<AgeGroup, SelectedTicketProduct> immutableListMultimap = this.ageGroupToSelectedTicketsMap;
        AgeGroup ageGroup = AgeGroup.CHILD;
        return immutableListMultimap.containsKey(ageGroup) ? Optional.fromNullable(this.ageGroupToSelectedTicketsMap.get((ImmutableListMultimap<AgeGroup, SelectedTicketProduct>) ageGroup).iterator().next().atsCode) : Optional.absent();
    }

    public Optional<String> getChildCategoryId() {
        ImmutableListMultimap<AgeGroup, SelectedTicketProduct> immutableListMultimap = this.ageGroupToSelectedTicketsMap;
        AgeGroup ageGroup = AgeGroup.CHILD;
        return immutableListMultimap.containsKey(ageGroup) ? Optional.fromNullable(this.ageGroupToSelectedTicketsMap.get((ImmutableListMultimap<AgeGroup, SelectedTicketProduct>) ageGroup).iterator().next().categoryId) : Optional.absent();
    }

    public Optional<Price> getChildCombinedSubtotal() {
        return this.childCombinedSubtotal;
    }

    public Pricing getChildPricing() {
        return this.ageGroupToSelectedTicketsMap.get((ImmutableListMultimap<AgeGroup, SelectedTicketProduct>) AgeGroup.CHILD).iterator().next().ticketPricing;
    }

    public Optional<String> getChildProductInstanceId() {
        ImmutableListMultimap<AgeGroup, SelectedTicketProduct> immutableListMultimap = this.ageGroupToSelectedTicketsMap;
        AgeGroup ageGroup = AgeGroup.CHILD;
        return immutableListMultimap.containsKey(ageGroup) ? Optional.fromNullable(this.ageGroupToSelectedTicketsMap.get((ImmutableListMultimap<AgeGroup, SelectedTicketProduct>) ageGroup).iterator().next().productInstanceId) : Optional.absent();
    }

    public Optional<Price> getCombinedSubtotal() {
        return this.combinedSubtotal;
    }

    public Optional<Price> getCombinedTax() {
        return this.combinedTax;
    }

    public Optional<Price> getCombinedTotal() {
        return this.combinedTotal;
    }

    public DestinationId getDestinationId() {
        return this.destinationId;
    }

    public String getDiscountGroupType() {
        return this.discountGroupType;
    }

    public String getDtiStoreId() {
        return this.dtiStoreId;
    }

    public ImmutableListMultimap<String, SelectedTicketProduct> getGenericTickets() {
        return this.genericTickets;
    }

    public ImmutableList<Policy> getMatchingPolicies(Set<PolicyGroup> set, Set<PolicyGroup.PolicySubGroup> set2) {
        ImmutableList.C22583a c22583aBuilder = ImmutableList.builder();
        Iterator<Policy> it = this.policies.iterator();
        while (it.hasNext()) {
            Policy next = it.next();
            if (matchesGroup(next, set) && matchesSubGroup(next, set2)) {
                c22583aBuilder.mo69026a(next);
            }
        }
        return c22583aBuilder.m69053m();
    }

    public int getNumberOfAdultTickets() {
        ImmutableListMultimap<AgeGroup, SelectedTicketProduct> immutableListMultimap = this.ageGroupToSelectedTicketsMap;
        AgeGroup ageGroup = AgeGroup.ADULT;
        if (immutableListMultimap.containsKey(ageGroup)) {
            return this.ageGroupToSelectedTicketsMap.get((ImmutableListMultimap<AgeGroup, SelectedTicketProduct>) ageGroup).size();
        }
        return 0;
    }

    public int getNumberOfAllAgesTickets() {
        ImmutableListMultimap<AgeGroup, SelectedTicketProduct> immutableListMultimap = this.ageGroupToSelectedTicketsMap;
        AgeGroup ageGroup = AgeGroup.ALL_AGES;
        if (immutableListMultimap.containsKey(ageGroup)) {
            return this.ageGroupToSelectedTicketsMap.get((ImmutableListMultimap<AgeGroup, SelectedTicketProduct>) ageGroup).size();
        }
        return 0;
    }

    public int getNumberOfChildTickets() {
        ImmutableListMultimap<AgeGroup, SelectedTicketProduct> immutableListMultimap = this.ageGroupToSelectedTicketsMap;
        AgeGroup ageGroup = AgeGroup.CHILD;
        if (immutableListMultimap.containsKey(ageGroup)) {
            return this.ageGroupToSelectedTicketsMap.get((ImmutableListMultimap<AgeGroup, SelectedTicketProduct>) ageGroup).size();
        }
        return 0;
    }

    public Integer getNumberOfSelectedDays() {
        return this.numberOfSelectedDays;
    }

    public int getNumberOfSeniorTickets() {
        ImmutableListMultimap<AgeGroup, SelectedTicketProduct> immutableListMultimap = this.ageGroupToSelectedTicketsMap;
        AgeGroup ageGroup = AgeGroup.SENIOR;
        if (immutableListMultimap.containsKey(ageGroup)) {
            return this.ageGroupToSelectedTicketsMap.get((ImmutableListMultimap<AgeGroup, SelectedTicketProduct>) ageGroup).size();
        }
        return 0;
    }

    public Optional<String> getOneDayDisplayDate() {
        return this.oneDayDisplayDate;
    }

    public LinkedHashSet<Policy> getPolicies() {
        return this.policies;
    }

    public CharSequence getPolicy(PolicyUILocation policyUILocation) {
        C22462m.m68685q(policyUILocation, "policy location cannot be null");
        return this.policiesWithLocation.get(policyUILocation);
    }

    public PricePerTicket getPricePerTicket() {
        return this.pricePerTicket;
    }

    public ProductCategoryType getProductCategoryType() {
        return this.productCategoryType;
    }

    public String getProductId() {
        return this.productId;
    }

    public Optional<Calendar> getResponseDateTime() {
        return this.responseDateTime;
    }

    public Optional<Calendar> getSellableOnDate() {
        return Optional.fromNullable(this.sellableOnDate);
    }

    public Optional<String> getSeniorATSCode() {
        ImmutableListMultimap<AgeGroup, SelectedTicketProduct> immutableListMultimap = this.ageGroupToSelectedTicketsMap;
        AgeGroup ageGroup = AgeGroup.SENIOR;
        return immutableListMultimap.containsKey(ageGroup) ? Optional.fromNullable(this.ageGroupToSelectedTicketsMap.get((ImmutableListMultimap<AgeGroup, SelectedTicketProduct>) ageGroup).iterator().next().atsCode) : Optional.absent();
    }

    public Optional<String> getSeniorCategoryId() {
        ImmutableListMultimap<AgeGroup, SelectedTicketProduct> immutableListMultimap = this.ageGroupToSelectedTicketsMap;
        AgeGroup ageGroup = AgeGroup.SENIOR;
        return immutableListMultimap.containsKey(ageGroup) ? Optional.fromNullable(this.ageGroupToSelectedTicketsMap.get((ImmutableListMultimap<AgeGroup, SelectedTicketProduct>) ageGroup).iterator().next().categoryId) : Optional.absent();
    }

    public Optional<Price> getSeniorCombinedSubtotal() {
        return this.seniorCombinedSubtotal;
    }

    public Pricing getSeniorPricing() {
        return this.ageGroupToSelectedTicketsMap.get((ImmutableListMultimap<AgeGroup, SelectedTicketProduct>) AgeGroup.SENIOR).iterator().next().ticketPricing;
    }

    public Optional<String> getSeniorProductInstanceId() {
        ImmutableListMultimap<AgeGroup, SelectedTicketProduct> immutableListMultimap = this.ageGroupToSelectedTicketsMap;
        AgeGroup ageGroup = AgeGroup.SENIOR;
        return immutableListMultimap.containsKey(ageGroup) ? Optional.fromNullable(this.ageGroupToSelectedTicketsMap.get((ImmutableListMultimap<AgeGroup, SelectedTicketProduct>) ageGroup).iterator().next().productInstanceId) : Optional.absent();
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public String getStartDateTime() {
        return this.startDateTime;
    }

    public Optional<DisplayNames> getTicketDisplayNames() {
        AbstractC22726b3<AgeGroup> it = this.ageGroupToSelectedTicketsMap.keySet().iterator();
        if (!it.hasNext()) {
            return Optional.absent();
        }
        return Optional.fromNullable(this.ageGroupToSelectedTicketsMap.get((ImmutableListMultimap<AgeGroup, SelectedTicketProduct>) it.next()).iterator().next().ticketDisplayNames);
    }

    public Optional<Price> getTotalDownForMonthlyOption() {
        return Optional.fromNullable(this.totalDownForMonthlyOption);
    }

    public Optional<Price> getTotalMonthlyPrice() {
        return Optional.fromNullable(this.totalMonthlyPrice);
    }

    public Optional<String> getTwoDayDisplayDate() {
        return this.twoDayDisplayDate;
    }

    public WebStoreId getWebStoreId() {
        return this.webStoreId;
    }

    public boolean isGovIdRequired() {
        return this.isGovIdRequired;
    }

    public String toString() {
        return String.format("combinedTotal[%s], combinedSubtotal[%s], combinedTax[%s], numberOfSelectedDays[%s], pricePerTicket[%s], webStoreId[%s] dtiStoreId[%s] sellableOnDate[%s] responseDateTime[%s] ", this.combinedTotal, this.combinedSubtotal, this.combinedTax, this.numberOfSelectedDays, this.pricePerTicket, this.webStoreId, this.dtiStoreId, this.sellableOnDate, this.responseDateTime);
    }
}